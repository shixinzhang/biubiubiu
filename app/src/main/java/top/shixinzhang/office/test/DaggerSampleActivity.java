package top.shixinzhang.office.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import top.shixinzhang.office.MyApplication;
import top.shixinzhang.office.test.howtouse.ContextPerson;
import top.shixinzhang.office.test.howtouse.DaggerDependencyComponent;
import top.shixinzhang.office.test.howtouse.DaggerMainComponent;
import top.shixinzhang.office.test.howtouse.DependencyComponent;
import top.shixinzhang.office.test.howtouse.DependencyMode;
import top.shixinzhang.office.test.howtouse.MainModule;
import top.shixinzhang.office.test.howtouse.Person;
import top.shixinzhang.office.test.howtouse.ViewPerson;
import top.shixinzhang.office.test.howtouse.qualifier.Coder;
import top.shixinzhang.office.test.howtouse.qualifier.ContextCoder;
import top.shixinzhang.office.test.howtouse.qualifier.NameCoder;

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

public class DaggerSampleActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();

    //3.查找当前类中带有 @Inject 注解的成员变量，知道要注入什么类型的变量
    @Inject
    Person mPerson;

    @Inject
    Person mPerson2;

    @Inject
    ContextPerson mContextPerson;

    @Inject
    ViewPerson mViewPerson;

    @Inject
    ViewPerson mViewPerson2;

    //    @Named("Context")
    @ContextCoder
    @Inject
    Coder mCoder;

    //    @Named("Name")  //调用对应标识的提供方法
    @NameCoder      //使用注解代替
    @Inject
    Coder mCoder2;

    @NameCoder
    @Inject
    Lazy<Coder> mLazyPerson;   //懒加载

    //1.构造桥梁对象，传入容器（去哪儿实例对象）  2.设置要注入给谁     3.查找要注入对象中要注入谁      4.去容器中找对应的提供方法，有就调用     5.没有就看被注入类的构造方法是否被 @Inject 修饰，悠久调用
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        testComponentDependency();
        //有依赖 Component 以后，就必须传递才能创建
//        //1.构造桥梁对象，传入容器
//        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
//        //2.标明要注入到当前 activity
//        component.inject(this);
//
        Log.i(TAG, mPerson.toString() + "\n" + mPerson2.toString());

        testQualifier();

        Log.i(TAG, mViewPerson.toString() + "\n" + mViewPerson2.toString());

        if (mLazyPerson == null) {
            Log.i(TAG, "目前 mLazyPerson 是空");
        } else {
            Log.i(TAG, "调用 get() 前：" + mLazyPerson.toString());
        }

        Coder person = mLazyPerson.get();  //调用该方法时才会创建，并且多次获取也得到的是同一个对象
        Coder person1 = mLazyPerson.get();
        Log.i(TAG, "lazy load \n" + person.toString() + "\n" + person1.toString());

//        ((MyApplication)getApplication()).getProgressDialog()
    }

    /**
     * 测试不同构造函数的注入
     */
    private void testQualifier() {
        Log.i(TAG, mCoder.toString() + "\n" + mCoder2.toString());
    }

    /**
     * 测试 component 间依赖
     */
    private void testComponentDependency() {
        DependencyComponent dependencyComponent = DaggerDependencyComponent.builder()
                .dependencyMode(new DependencyMode(getWindow().getDecorView()))
                .build();

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .dependencyComponent(dependencyComponent)
                .build()
                .inject(this);
    }
}
