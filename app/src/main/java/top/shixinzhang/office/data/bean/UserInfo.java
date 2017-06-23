package top.shixinzhang.office.data.bean;

import java.io.Serializable;

/**
 * Description:
 * <br> 用户信息实体类
 * <p>
 * <br> Created by shixinzhang on 17/6/19.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class UserInfo implements Serializable {
    private long userId;
    private String username;
    private String description;
    private int number;

    public String getUsername() {
        return username;
    }

    public UserInfo setUsername(final String username) {
        this.username = username;
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public UserInfo setUserId(final long userId) {
        this.userId = userId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UserInfo setDescription(final String description) {
        this.description = description;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public UserInfo setNumber(final int number) {
        this.number = number;
        return this;
    }
}
