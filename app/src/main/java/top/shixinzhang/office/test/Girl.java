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

public class Girl {
    private String name;

    /**
     * 构造器有 @Inject 注解的话，会创建实例
     * @param name
     */
    @Inject
    public Girl(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Girl setName(final String name) {
        this.name = name;
        return this;
    }
}
