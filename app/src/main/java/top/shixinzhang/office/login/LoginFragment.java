package top.shixinzhang.office.login;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.shixinzhang.office.R;

/**
 * Description:
 * <br> 登录 fragment
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class LoginFragment extends Fragment implements LoginContract.View {

    @BindView(R.id.edit_account)
    EditText mEditAccount;
    @BindView(R.id.edit_password)
    EditText mEditPassword;
    @BindView(R.id.cb_agree_protocol)
    AppCompatCheckBox mCbAgreeProtocol;
    @BindView(R.id.tv_protocol)
    TextView mTvProtocol;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    private LoginContract.Presenter mPresenter;
    private ProgressDialog mProgressDialog;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn_login)
    public void clickLogin() {
        if (mPresenter.login(getAccount(), getPassword())) {
            showTips("登录成功");
        }
    }

    @OnClick(R.id.tv_protocol)
    public void clickProtocol() {
        mPresenter.openProtocol();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void showLoadingView() {
        mProgressDialog = ProgressDialog.show(getContext(), null, "加载中...");
    }

    @Override
    public void stopLoadingView() {
        mProgressDialog.dismiss();
    }

    @Override
    public void showTips(final String tips) {
        Snackbar.make(getView(), tips, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

    @Override
    public String getAccount() {
        return mEditAccount.getText().toString();
    }

    @Override
    public String getPassword() {
        return mEditPassword.getText().toString();
    }

    @Override
    public boolean agreeProtocol() {
        return mCbAgreeProtocol.isChecked();
    }

    @Override
    public void setPresenter(final LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
