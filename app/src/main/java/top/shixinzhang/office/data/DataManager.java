package top.shixinzhang.office.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import top.shixinzhang.office.common.qualifier.ApplicationContext;
import top.shixinzhang.office.data.bean.UserInfo;
import top.shixinzhang.office.data.local.DbHelper;
import top.shixinzhang.office.data.local.SharedPrefsHelper;

/**
 * Description:
 * <br> 数据管理，包括本地 sp、db 以及网络
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Singleton
public class DataManager {
    private Context mContext;
    private DbHelper mDbHelper;
    private SharedPrefsHelper mSharedPrefsHelper;

    @Inject
    public DataManager(@ApplicationContext final Context context, final DbHelper dbHelper, final SharedPrefsHelper sharedPrefsHelper) {
        mContext = context;
        mDbHelper = dbHelper;
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefsHelper.put(SharedPrefsHelper.KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken(){
        return mSharedPrefsHelper.get(SharedPrefsHelper.KEY_ACCESS_TOKEN, null);
    }

    public Long createUser(UserInfo user) throws Exception {
        return mDbHelper.addUser(user);
    }

    public UserInfo getUser(Long userId){
        return mDbHelper.getUserInfo(userId);
    }
}
