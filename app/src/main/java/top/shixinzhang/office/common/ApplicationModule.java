package top.shixinzhang.office.common;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import top.shixinzhang.office.common.qualifier.ApplicationContext;
import top.shixinzhang.office.common.qualifier.DatabaseInfo;

/**
 * Description:
 * <br> 全局配置
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(final Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "sx-office.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 1;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences("sx-office=prefs", Context.MODE_PRIVATE);
    }
}

