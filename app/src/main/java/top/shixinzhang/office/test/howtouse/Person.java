package top.shixinzhang.office.test.howtouse;

import android.util.Log;

import javax.inject.Inject;

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

public class Person {
    private final String TAG = this.getClass().getSimpleName();

    @Inject
    public Person() {
        Log.i(TAG, "Person is created!!");
    }

}
