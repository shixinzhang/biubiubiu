package top.shixinzhang.office.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import top.shixinzhang.office.test.howtouse.DaggerMainComponent;
import top.shixinzhang.office.test.howtouse.MainComponent;
import top.shixinzhang.office.test.howtouse.MainModule;
import top.shixinzhang.office.test.howtouse.Person;

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

    //3.查找当前类中带有 @Inject 注解的成员变量，知道要注入什么类型的变量
    @Inject
    Person mPerson;

    //1.构造桥梁对象，传入容器（去哪儿实例对象）  2.设置要注入给谁     3.查找要注入对象中要注入谁      4.去容器中找对应的提供方法，有就调用     5.没有就看被注入类的构造方法是否被 @Inject 修饰，悠久调用
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1.构造桥梁对象，传入容器
        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        //2.标明要注入到当前 activity
        component.inject(this);

        Toast.makeText(this, mPerson.toString(),Toast.LENGTH_SHORT).show();
    }
}
