package top.shixinzhang.office.test.howtouse;

import android.app.Activity;

import dagger.Component;
import top.shixinzhang.office.test.DaggerSampleActivity;

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

@Component(modules = MainModule.class)      //沟通桥梁，沟通调用者和依赖对象库
public interface MainComponent {

    void inject(DaggerSampleActivity activity);     //严格指定注入参数，类名要一致，父类都不行
}
