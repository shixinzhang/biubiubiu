package top.shixinzhang.office.test.howtouse.qualifier;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

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

@Module
public class CoderModule {

//    @Named("Name")  //标识当前方法
    @NameCoder  //使用注解代替
    @Provides
    Coder provideCoderWithName() {
        return new Coder("test name");
    }

//    @Named("Context")
    @ContextCoder
    @Provides
    Coder provideCoderWithAge(Context context) {
        return new Coder(context);
    }
}
