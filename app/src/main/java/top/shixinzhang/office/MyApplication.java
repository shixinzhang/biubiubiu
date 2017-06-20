package top.shixinzhang.office;

import android.app.Application;
import android.app.ProgressDialog;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import top.shixinzhang.office.common.ContextModule;
import top.shixinzhang.office.common.ProgressModule;

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

public class MyApplication extends Application {

    AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerMyApplication_AppComponent.builder()
                .contextModule(new ContextModule(this))
                .progressModule(new ProgressModule())
                .build();
    }

    public AppComponent getComponent() {
        return mComponent;
    }


    /**
     * 注入全局通用的一些单例对象¬
     */
    @Singleton
    @Component(modules = {ContextModule.class, ProgressModule.class})
    public interface AppComponent {
        ProgressDialog getProgressDialog();
    }
}
