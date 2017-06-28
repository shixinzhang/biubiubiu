package top.shixinzhang.office.features.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import top.shixinzhang.office.base.BaseFragmentActivity;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class SplashActivity extends BaseFragmentActivity {

    private SplashFragment mSplashFragment;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public Fragment getFragment() {
        if (mSplashFragment == null){
            mSplashFragment = new SplashFragment();
        }
        return mSplashFragment;
    }
}
