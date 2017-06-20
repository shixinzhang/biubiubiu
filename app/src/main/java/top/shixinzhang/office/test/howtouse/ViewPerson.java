package top.shixinzhang.office.test.howtouse;

import android.util.Log;
import android.view.View;

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

public class ViewPerson {
    private final String TAG = this.getClass().getSimpleName();
    private View mView;

    public ViewPerson(final View view) {
        mView = view;
        Log.i(TAG, "ViewPerson is created! " + mView.toString());
    }
}
