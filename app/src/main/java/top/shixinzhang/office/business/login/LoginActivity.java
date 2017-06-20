package top.shixinzhang.office.business.login;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import top.shixinzhang.office.MyApplication;
import top.shixinzhang.office.base.BaseFragmentActivity;
import top.shixinzhang.office.data.source.LoginRepository;

/**
 * Description:
 * <br> 登录
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class LoginActivity extends BaseFragmentActivity {
    private LoginFragment mFragment;

    @Inject
    LoginPresenter mLoginPresenter;
//    @Inject
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        new LoginPresenter(LoginRepository.getInstance(), getFragment());

        MyApplication.AppComponent component = ((MyApplication) getApplication()).getComponent();
        DaggerLoginComponent.builder()
                .appComponent(component)
                .loginModule(new LoginModule(getFragment()))
                .build()
                .inject(this);

        if (mProgressDialog != null){
            mProgressDialog.show();
        }

        ProgressDialog progressDialog = component.getProgressDialog();

    }

    @Override
    public LoginFragment getFragment() {
        if (mFragment == null) {
            mFragment = LoginFragment.newInstance();
        }
        return mFragment;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LoginRepository.destroyInstance();
    }
}
