package com.zuo.demo.zuodemo.start;

import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zuo.demo.lib_common.arouter.ArouterConstans;
import com.zuo.demo.lib_common.base.activity.BaseActivity;
import com.zuo.demo.zuodemo.R;

import cc.shinichi.library.tool.common.HandlerUtils;


public class LoadingScreenActivity extends BaseActivity implements Handler.Callback {


    @Override
    public int getLayoutId() {
        return R.layout.activity_loading_screen_layout;
    }

    @Override
    protected void initView() {
        mToolbar.setVisibility(View.GONE);
        HandlerUtils.HandlerHolder handlerHolder = new HandlerUtils.HandlerHolder(this);
        handlerHolder.postDelayed(new Runnable() {
            @Override
            public void run() {
                handlerHolder.sendEmptyMessage(0);
            }
        }, 2000);
    }

    @Override
    public boolean handleMessage(Message msg) {
        if (msg.what == 0) {
            ARouter.getInstance().build(ArouterConstans.LoginActivity_loginlib)
                    .navigation();
            finish();
        }
        return true;
    }

}
