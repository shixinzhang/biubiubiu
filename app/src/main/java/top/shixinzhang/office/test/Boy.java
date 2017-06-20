package top.shixinzhang.office.test;

import javax.inject.Inject;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/6/20.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class Boy {
    private String name;

    @Inject
    public Boy(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boy setName(final String name) {
        this.name = name;
        return this;
    }
}
