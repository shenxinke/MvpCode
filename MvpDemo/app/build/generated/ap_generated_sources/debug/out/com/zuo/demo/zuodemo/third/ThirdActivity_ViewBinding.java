// Generated code from Butter Knife. Do not modify!
package com.zuo.demo.zuodemo.third;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zuo.demo.zuodemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ThirdActivity_ViewBinding implements Unbinder {
  private ThirdActivity target;

  private View view7f08014a;

  private View view7f0800a3;

  private View view7f0800a4;

  private View view7f0800a5;

  private View view7f0800a6;

  private View view7f0800a7;

  private View view7f08014b;

  @UiThread
  public ThirdActivity_ViewBinding(ThirdActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ThirdActivity_ViewBinding(final ThirdActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_click, "field 'tvClick' and method 'onViewClicked'");
    target.tvClick = Utils.castView(view, R.id.tv_click, "field 'tvClick'", TextView.class);
    view7f08014a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_1, "field 'iv1' and method 'onViewClicked'");
    target.iv1 = Utils.castView(view, R.id.iv_1, "field 'iv1'", ImageView.class);
    view7f0800a3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_2, "field 'iv2' and method 'onViewClicked'");
    target.iv2 = Utils.castView(view, R.id.iv_2, "field 'iv2'", ImageView.class);
    view7f0800a4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_3, "field 'iv3' and method 'onViewClicked'");
    target.iv3 = Utils.castView(view, R.id.iv_3, "field 'iv3'", ImageView.class);
    view7f0800a5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_4, "field 'iv4' and method 'onViewClicked'");
    target.iv4 = Utils.castView(view, R.id.iv_4, "field 'iv4'", ImageView.class);
    view7f0800a6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_5, "field 'iv5' and method 'onViewClicked'");
    target.iv5 = Utils.castView(view, R.id.iv_5, "field 'iv5'", ImageView.class);
    view7f0800a7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_click_1, "field 'tvClick1' and method 'onViewClicked'");
    target.tvClick1 = Utils.castView(view, R.id.tv_click_1, "field 'tvClick1'", TextView.class);
    view7f08014b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ThirdActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvClick = null;
    target.iv1 = null;
    target.iv2 = null;
    target.iv3 = null;
    target.iv4 = null;
    target.iv5 = null;
    target.tvClick1 = null;

    view7f08014a.setOnClickListener(null);
    view7f08014a = null;
    view7f0800a3.setOnClickListener(null);
    view7f0800a3 = null;
    view7f0800a4.setOnClickListener(null);
    view7f0800a4 = null;
    view7f0800a5.setOnClickListener(null);
    view7f0800a5 = null;
    view7f0800a6.setOnClickListener(null);
    view7f0800a6 = null;
    view7f0800a7.setOnClickListener(null);
    view7f0800a7 = null;
    view7f08014b.setOnClickListener(null);
    view7f08014b = null;
  }
}
