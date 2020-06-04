package com.sxk.demo.loginlib.activity;

import android.Manifest;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sxk.demo.loginlib.R;
import com.sxk.demo.loginlib.R2;
import com.sxk.demo.loginlib.bean.PostInfoBean;
import com.sxk.demo.loginlib.net.CommonService;
import com.zuo.demo.lib_common.arouter.ArouterConstans;
import com.zuo.demo.lib_common.base.activity.BaseActivity;
import com.zuo.demo.lib_common.utils.permissions.OnPerMissionResult;
import com.zuo.demo.lib_common.utils.permissions.PermissionsUtil;

import java.util.List;

import butterknife.BindView;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import pub.devrel.easypermissions.EasyPermissions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Route(path = ArouterConstans.LoginActivity_loginlib)
public class LoginActivity extends BaseActivity implements View.OnClickListener, EasyPermissions.PermissionCallbacks {

    @BindView(R2.id.login_remind_checkbox)
    CheckBox loginRemindCheckbox;
    @BindView(R2.id.login_load)
    Button loginLoad;
    @BindView(R2.id.login_user_code)
    EditText loginUserCode;
    @BindView(R2.id.login_user_password)
    EditText loginUserPassword;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login_layout;
    }

    @Override
    protected void initView() {
        mToolbar.setVisibility(View.GONE);
        loginLoad.setOnClickListener(this);
        String userCode = loginUserCode.getText().toString().trim();
        String userPassword = loginUserPassword.getText().toString().trim();
        LogUtils.d(userCode);
        LogUtils.d(userPassword);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_load) {
//            getTestData();
//            getRxJava();
//            getPermission();
        }
    }

    private void getPermission() {
        String[] perms = {Manifest.permission.WRITE_EXTERNAL_STORAGE
                , Manifest.permission.CAMERA
                , Manifest.permission.READ_PHONE_STATE
                , Manifest.permission.ACCESS_COARSE_LOCATION
                , Manifest.permission.ACCESS_FINE_LOCATION};
        PermissionsUtil.getInstance().getPermission(this, perms, new OnPerMissionResult() {
            @Override
            public void onPermissionGranted() {
                ToastUtils.showShort("权限全部获取成功");
            }

            @Override
            public void onNoPermission() {
                //没有权限的话，先提示，点确定后弹出系统的授权提示框
                int PERMISSIONS_REQUEST_CODE = 1000;
                EasyPermissions.requestPermissions(LoginActivity.this, "拍照过程需要用到相机权限"
                        ,PERMISSIONS_REQUEST_CODE, perms);
            }
        });
    }


    private void getRxJava() {
        Observable.range(2, 10)
                // 该例子发送的事件序列特点：
                // 1. 从3开始，一共发送10个事件；
                // 2. 第1次延迟2s发送，之后每隔2秒产生1个数字（从0开始递增1，无限个）
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        LogUtils.d("开始采用subscribe连接");
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        LogUtils.d("接收到了事件" + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtils.d("对Error事件作出响应");
                    }

                    @Override
                    public void onComplete() {
                        LogUtils.d("对Complete事件作出响应");
                    }

                });


    }

    private void getTestData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.kuaidi100.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CommonService commonService = retrofit.create(CommonService.class);
        Call<PostInfoBean> postInfoBeanCall = commonService.getPostInfo("yuantong", "11111111111");
        postInfoBeanCall.enqueue(new Callback<PostInfoBean>() {
            @Override
            public void onResponse(Call<PostInfoBean> call, Response<PostInfoBean> response) {
                LogUtils.d(response.body().toString());
            }

            @Override
            public void onFailure(Call<PostInfoBean> call, Throwable t) {

            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @androidx.annotation.NonNull String[] permissions, @androidx.annotation.NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @androidx.annotation.NonNull List<String> perms) {
        if (requestCode == 1000) {
            ToastUtils.showShort("权限获取成功");
        }
    }

    @Override
    public void onPermissionsDenied(int requestCode, @androidx.annotation.NonNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            ToastUtils.showShort("权限被彻底禁止");
        } else {
            ToastUtils.showShort("权限被禁止");
        }
    }


}
