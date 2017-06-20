package top.shixinzhang.office;

import android.app.Application;
import android.app.ProgressDialog;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

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

    @Inject
    ApplicationComponent  mComponent;
    @Inject
    ProgressDialog mProgressDialog;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerMyApplication_ApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        mComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }

    public ProgressDialog getProgressDialog() {
        return mProgressDialog;
    }

    @Singleton
    @Component(modules = ApplicationModule.class)
    public interface ApplicationComponent {
        void inject(MyApplication application);
//        void inject(DaggerSampleActivity activity);
    }
}
