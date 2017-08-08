package top.shixinzhang.office.base;

/**
 * Description:
 * <br> Presenter 基类
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public interface BasePresenter<V> {
    void onAttach(V mvpView);

    void onDetach();

    void start();
}
