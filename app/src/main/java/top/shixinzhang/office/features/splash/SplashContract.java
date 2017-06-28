package top.shixinzhang.office.features.splash;

import top.shixinzhang.office.base.BasePresenter;
import top.shixinzhang.office.base.BaseView;

/**
 * Description:
 * <br> 启动页
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public interface SplashContract {

    interface Presenter extends BasePresenter {
        void skip();    //跳过

        void showWhat();    //显示什么页面

        void enter(int pageCode);   //进入应用，具体进入页面，应该根据 Code 决定

        void openLogin();

        void openMain();
    }

    interface View extends BaseView<Presenter> {

        void showGuide();   //显示引导

        void showSplash();  //显示启动页

        void showAdvert();  //显示广告
    }
}
