package top.shixinzhang.office.common.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Description:
 * <br> 标识 Activity 的 Context
 * <p>
 * <br> Created by shixinzhang on 17/6/23.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
