package top.shixinzhang.office.data.source;

import top.shixinzhang.office.base.ResultCallback;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class LoginRepository implements LoginModel {


    private LoginRepository() {
        //do some init work
    }

    private volatile static LoginRepository mInstance = new LoginRepository();

    public static LoginRepository getInstance() {
        return mInstance;
    }

    public static void destroyInstance() {
        mInstance = null;
    }

    @Override
    public void getUserInfo(final String token, final ResultCallback callback) {
        // TODO: 17/6/19 根据 token 获取个人信息
    }

    @Override
    public void updateUserInfo(final String token, final ResultCallback callback) {
        // TODO: 17/6/19 根据 token 更新个人信息
    }

    @Override
    public void login(final String account, final String password, final ResultCallback callback) {
        // TODO: 17/6/19 登录，获取 token
        String token = "";


    }
}
