package top.shixinzhang.office.data.local;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Singleton
public class SharedPrefsHelper {
    public static String KEY_ACCESS_TOKEN = "access_token";

    private SharedPreferences mSharedPreferences;

    @Inject
    public SharedPrefsHelper(final SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }


    public void put(String key, String value) {
        mSharedPreferences.edit().putString(key, value).apply();
    }

    public void put(String key, int value) {
        mSharedPreferences.edit().putInt(key, value).apply();
    }

    public void put(String key, float value) {
        mSharedPreferences.edit().putFloat(key, value).apply();
    }

    public void put(String key, boolean value) {
        mSharedPreferences.edit().putBoolean(key, value).apply();
    }

    public String get(String key, String defaultValue) {
        return mSharedPreferences.getString(key, defaultValue);
    }

    public Integer get(String key, int defaultValue) {
        return mSharedPreferences.getInt(key, defaultValue);
    }

    public Float get(String key, float defaultValue) {
        return mSharedPreferences.getFloat(key, defaultValue);
    }

    public Boolean get(String key, boolean defaultValue) {
        return mSharedPreferences.getBoolean(key, defaultValue);
    }

    public void deleteSavedData(String key) {
        mSharedPreferences.edit().remove(key).apply();
    }
}
