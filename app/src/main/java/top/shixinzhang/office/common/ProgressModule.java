package top.shixinzhang.office.common;

import android.app.ProgressDialog;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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
public class ProgressModule {

    @Singleton
    @Provides
    ProgressDialog provideProgress(Context context) {
        return ProgressDialog.show(context, null, "加载中");
    }
}
