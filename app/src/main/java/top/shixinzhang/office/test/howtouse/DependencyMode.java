package top.shixinzhang.office.test.howtouse;

import android.view.View;
import android.widget.Toast;

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
public class DependencyMode {
    private View mView;

    public DependencyMode(final View view) {
        mView = view;
    }

    @Provides
    View provideToast(){
        return mView;
    }
}
