// Generated code from Butter Knife. Do not modify!
package com.sxk.demo.loginlib.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sxk.demo.loginlib.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.loginRemindCheckbox = Utils.findRequiredViewAsType(source, R.id.login_remind_checkbox, "field 'loginRemindCheckbox'", CheckBox.class);
    target.loginLoad = Utils.findRequiredViewAsType(source, R.id.login_load, "field 'loginLoad'", Button.class);
    target.loginUserCode = Utils.findRequiredViewAsType(source, R.id.login_user_code, "field 'loginUserCode'", EditText.class);
    target.loginUserPassword = Utils.findRequiredViewAsType(source, R.id.login_user_password, "field 'loginUserPassword'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.loginRemindCheckbox = null;
    target.loginLoad = null;
    target.loginUserCode = null;
    target.loginUserPassword = null;
  }
}
