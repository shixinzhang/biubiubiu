package top.shixinzhang.office.test.howtouse.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Description:
 * <br> 修饰在 Activity 范围内单例的变量的注解
 * <p>
 * <br> Created by shixinzhang on 17/6/20.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Scope  //保持唯一的条件是通过 @Scope 标记的注解相同
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
