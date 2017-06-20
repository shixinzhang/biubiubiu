package top.shixinzhang.office.business.login;

import dagger.Module;
import dagger.Provides;
import top.shixinzhang.office.data.source.LoginModel;
import top.shixinzhang.office.data.source.LoginRepository;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/20.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Module
public class LoginModule {
    private LoginContract.View mView;

    public LoginModule(final LoginContract.View view) {
        mView = view;
    }

    @Provides
    LoginContract.View provideView() {
        return mView;
    }

    @Provides
    LoginModel provideLoginModel() {
        return LoginRepository.getInstance();
    }
}
