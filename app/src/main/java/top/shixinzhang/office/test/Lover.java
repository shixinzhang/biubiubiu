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

public class Lover {
    //属性有 @Inject 修饰但是构造器没有，就会注入字段而不创建新的实例
    @Inject Girl mGirl;
    @Inject Boy mBoy;

    @Inject
    public Lover() {
    }
}
