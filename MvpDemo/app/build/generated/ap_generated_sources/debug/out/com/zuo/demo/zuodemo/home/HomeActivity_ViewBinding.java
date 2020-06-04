// Generated code from Butter Knife. Do not modify!
package com.zuo.demo.zuodemo.home;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yinglan.alphatabs.AlphaTabsIndicator;
import com.zuo.demo.zuodemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.alphaTabsIndicator = Utils.findRequiredViewAsType(source, R.id.alphaIndicator, "field 'alphaTabsIndicator'", AlphaTabsIndicator.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.alphaTabsIndicator = null;
  }
}
