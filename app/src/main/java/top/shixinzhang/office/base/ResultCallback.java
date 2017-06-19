package top.shixinzhang.office.base;


/**
 * Description:
 * <br> 通用的结果回调
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public interface ResultCallback {

    void onSuccess(Object o);

    void onFailed(Throwable e);
}
