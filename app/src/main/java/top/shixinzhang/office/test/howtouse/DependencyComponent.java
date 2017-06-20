package top.shixinzhang.office.test.howtouse;

import android.view.View;

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

@Component(modules = DependencyMode.class)
public interface DependencyComponent {

    View proView();
}
