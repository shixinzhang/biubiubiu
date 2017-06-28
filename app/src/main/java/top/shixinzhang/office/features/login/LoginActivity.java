package top.shixinzhang.office.features.login;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import top.shixinzhang.office.MyApplication;
import top.shixinzhang.office.base.BaseFragmentActivity;
import top.shixinzhang.office.data.DataManager;
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
    private final String TAG = this.getClass().getSimpleName();

    private LoginFragment mFragment;
    @Inject
    LoginPresenter mLoginPresenter;
    @Inject
    DataManager mDataManager;

    LoginComponent mLoginComponent;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        new LoginPresenter(LoginRepository.getInstance(), getFragment());

        getComponent().inject(this);

        Log.d(TAG, mDataManager.toString());

        DataManager dataManager = ((MyApplication) getApplication()).getComponent().getDataManager();

    }

    LoginComponent getComponent() {
        if (mLoginComponent == null) {
            MyApplication.AppComponent component = ((MyApplication) getApplication()).getComponent();
            mLoginComponent = DaggerLoginComponent.builder()
                    .appComponent(component)
                    .loginModule(new LoginModule(getFragment()))
                    .build();
        }
        return mLoginComponent;
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
