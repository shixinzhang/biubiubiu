package top.shixinzhang.office.test;

import javax.inject.Singleton;

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
public class LoverModule {

    @Provides
    static Girl provideGirl(){
        return new Girl("rourou");
    }

    @Provides
    @Singleton
    static Boy provideBoy(){
        return new Boy("shixinzhang");
    }
}
