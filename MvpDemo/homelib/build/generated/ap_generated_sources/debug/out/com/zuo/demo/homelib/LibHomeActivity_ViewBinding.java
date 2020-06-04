// Generated code from Butter Knife. Do not modify!
package com.zuo.demo.homelib;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LibHomeActivity_ViewBinding implements Unbinder {
  private LibHomeActivity target;

  @UiThread
  public LibHomeActivity_ViewBinding(LibHomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LibHomeActivity_ViewBinding(LibHomeActivity target, View source) {
    this.target = target;

    target.mTvClickOn = Utils.findRequiredViewAsType(source, R.id.tv_click_on, "field 'mTvClickOn'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LibHomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvClickOn = null;
  }
}
