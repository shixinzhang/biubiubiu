package top.shixinzhang.office.test.howtouse;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;
import top.shixinzhang.office.test.DaggerSampleActivity;
import top.shixinzhang.office.test.howtouse.qualifier.CoderModule;
import top.shixinzhang.office.test.howtouse.scope.PerActivity;

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

@Component(modules = {MainModule.class, CoderModule.class}, dependencies = DependencyComponent.class)
//沟通桥梁，沟通调用者和依赖对象库；也可以依赖上层桥梁
@Singleton  //允许提供单例
@PerActivity    //只要 module 中使用了 scope 注解，就需要给对应的桥梁也加上 ?
public interface MainComponent {

    //注入内容的范围
    void inject(DaggerSampleActivity activity);     //严格指定注入参数，类名要一致，父类都不行
}
