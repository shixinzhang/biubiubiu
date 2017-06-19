package top.shixinzhang.office.login;

import top.shixinzhang.office.base.BasePresenter;
import top.shixinzhang.office.base.BaseView;

/**
 * Description:
 * <br> 登录的契约类
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void showLoadingView();

        void stopLoadingView();

        void showTips(String tips);    //显示提示信息

        boolean isActive();     //是否可用

        String getAccount();    //获取输入的账号

        String getPassword();

        boolean agreeProtocol();    //同意协议
    }

    interface Presenter extends BasePresenter {
        void openProtocol();

        boolean login(String account, String password);    //登录

        void openRegister();    //去注册

        void openForgetPassword();  //去忘记密码
    }
}
