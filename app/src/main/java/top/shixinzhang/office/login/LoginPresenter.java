package top.shixinzhang.office.login;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import top.shixinzhang.office.utils.CheckUtils;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mLoginView;

    public LoginPresenter(@NonNull LoginContract.View view) {
        mLoginView = CheckUtils.checkNotNull(view);
        mLoginView.setPresenter(this);
    }

    @Override
    public void openProtocol() {
        mLoginView.showTips("跳转到协议详情页面");
    }

    @Override
    public boolean login(final String account, final String password) {
        if (TextUtils.isEmpty(account) || TextUtils.isEmpty(password)) {
            mLoginView.showTips("请输入账户或密码");
            return false;
        }
        if (!mLoginView.agreeProtocol()) {
            mLoginView.showTips("请同意协议");
            return false;
        }
        boolean fakeResult = account.equals(password);
        mLoginView.showLoadingView();
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(4_000);
                mLoginView.stopLoadingView();
            }
        }).start();
        return fakeResult;
    }

    @Override
    public void openRegister() {
        mLoginView.showTips("跳转到注册页面");
    }

    @Override
    public void openForgetPassword() {
        mLoginView.showTips("跳转到忘记密码页面");
    }

    @Override
    public void start() {
//        mLoginView.showLoadingView();

    }
}
