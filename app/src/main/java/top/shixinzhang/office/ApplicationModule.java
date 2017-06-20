package top.shixinzhang.office;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

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
public class ApplicationModule {
    private Context mContext;

    public ApplicationModule(final Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }

    @Singleton
    @Provides
    ProgressDialog provideProgress(Context context) {
        return new ProgressDialog(context);
    }
}
