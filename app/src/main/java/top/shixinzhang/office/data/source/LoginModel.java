package top.shixinzhang.office.data.source;

import top.shixinzhang.office.base.ResultCallback;

/**
 * Description:
 * <br> 用户信息数据操作接口，这里只做数据操作（网络请求、本地读取、增删改查），不做逻辑
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public interface LoginModel {

    void getUserInfo(String token, ResultCallback callback);

    void updateUserInfo(String token, ResultCallback callback);

    void login(String account, String password, ResultCallback callback);
}
