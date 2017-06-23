package top.shixinzhang.office.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import top.shixinzhang.office.common.qualifier.ApplicationContext;
import top.shixinzhang.office.common.qualifier.DatabaseInfo;
import top.shixinzhang.office.data.bean.UserInfo;

/**
 * Description:
 * <br> 本地数据库
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Singleton
public class DbHelper extends SQLiteOpenHelper {
    //table name
    public static final String TABLE_USER = "user";

    @Inject
    public DbHelper(@ApplicationContext final Context context,
                    @DatabaseInfo final String name,
                    @DatabaseInfo final int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(final SQLiteDatabase db) {
        createTable(db);
    }

    private void createTable(final SQLiteDatabase db) {
        String string = "CREATE TABLE IF NOT EXISTS " + TABLE_USER + "(" +
                "id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name" + " VARCHAR(20)," +
                "phone" + " VARCHAR(20)," +
                "created_at" + " VARCHAR(10) DEFAULT " + getCurrentTimeStamp() +
                "updated_at" + " VARCHAR(10) DEFAULT " + getCurrentTimeStamp();
        db.execSQL(string);
    }

    @Override
    public void onUpgrade(final SQLiteDatabase db, final int oldVersion, final int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        createTable(db);
    }

    // TODO: 17/6/23 查询、获取

    public Long addUser(UserInfo userInfo){
        return 0L;
    }

    public UserInfo getUserInfo(long userId){
        return null;
    }

    private String getCurrentTimeStamp() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }
}
