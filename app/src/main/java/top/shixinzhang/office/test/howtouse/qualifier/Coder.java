package top.shixinzhang.office.test.howtouse.qualifier;

import android.content.Context;

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

public class Coder {
    private String mName;
    private Context mContext;

    public Coder(final String name) {
        this.mName = name;
    }

    public Coder(final Context context) {
        this.mContext = context;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + mName + '\'' +
                ", mContext=" + mContext +
                '}';
    }
}
