package top.shixinzhang.office.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import top.shixinzhang.office.R;
import top.shixinzhang.office.base.BaseFragmentActivity;
import top.shixinzhang.office.utils.ActivityUtils;

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

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new LoginPresenter(getFragment());
    }

    @Override
    public LoginFragment getFragment() {
        if (mFragment == null) {
            mFragment = LoginFragment.newInstance();
        }
        return mFragment;
    }

}
