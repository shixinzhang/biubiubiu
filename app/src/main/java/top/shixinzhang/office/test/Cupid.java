package top.shixinzhang.office.test;

import javax.inject.Singleton;

import dagger.Component;

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
@Component(modules = LoverModule.class)     //桥梁，沟通调用者和依赖对象
@Singleton
public interface Cupid {
    Lover makeLover();
}
