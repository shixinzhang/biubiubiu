package top.shixinzhang.office.test.howtouse;

import android.content.Context;
import android.widget.Toast;

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

public class ContextPerson {
    private Context mContext;

    public ContextPerson(final Context context) {
        mContext = context;
        Toast.makeText(mContext, "context person is created!", Toast.LENGTH_SHORT).show();
    }
}
