package top.shixinzhang.office.business.login;

import dagger.Component;
import top.shixinzhang.office.MyApplication;
import top.shixinzhang.office.common.FragmentScope;

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

@FragmentScope
@Component(modules = LoginModule.class, dependencies = MyApplication.AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
