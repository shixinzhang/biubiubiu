package top.shixinzhang.office.test.howtouse;

import android.content.Context;
import android.view.View;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import top.shixinzhang.office.test.howtouse.scope.PerActivity;

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

@Module     //容器，提供依赖对象的实例
public class MainModule {

    //4.到容器中找 @Provides 修饰的、返回值与要注入类型一样的方法，调用
    @Provides       //提供对象
    @Singleton
    //提供的是单例
    Person providePerson() {
        return new Person();
    }

    private Context mContext;

    public MainModule(final Context context) {
        mContext = context;
    }

    /**
     * 不直接使用成员属性，而是以注入的方式提供，是为了便于后续调整
     * @return
     */
    @Provides
    Context provideContext() {      //⬅️ 找到返回值为 Context 的注入方法
        //返回值与参数不能一样，否者会导致循环依赖，编译时会报错
        return mContext;
    }

    @Provides
    @Singleton
    ContextPerson provideContextPerson(Context context) {       //需要穿的参数，也会从当前 module 中查找提供方法 ↑
        return new ContextPerson(context);
    }


    @PerActivity    //保持唯一的条件是通过 @Scope 标记的注解相同
    @Provides
    ViewPerson provideToastPerson(View view){
        return new ViewPerson(view);
    }
}
