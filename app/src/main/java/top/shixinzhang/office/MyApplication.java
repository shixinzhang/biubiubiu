package top.shixinzhang.office;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import top.shixinzhang.office.common.ApplicationModule;
import top.shixinzhang.office.common.ContextModule;
import top.shixinzhang.office.common.ProgressModule;
import top.shixinzhang.office.common.qualifier.ApplicationContext;
import top.shixinzhang.office.data.DataManager;
import top.shixinzhang.office.data.local.DbHelper;
import top.shixinzhang.office.data.local.SharedPrefsHelper;

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
    private final String TAG = this.getClass().getSimpleName();
    AppComponent mComponent;
    @Inject
    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        getComponent().inject(this);
        Log.d(TAG, mDataManager.toString());
    }

    public AppComponent getComponent() {
        if (mComponent == null) {
            mComponent = DaggerMyApplication_AppComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mComponent;
    }

    /**
     * 注入全局通用的一些单例对象
     */
    @Singleton
    @Component(modules = {ApplicationModule.class})
    public interface AppComponent {

        void inject(MyApplication application);

        @ApplicationContext
        Context getContext();

        Application getApplication();

        DataManager getDataManager();

        SharedPrefsHelper getPreferenceHelper();

        DbHelper getDbHelper();
    }
}
