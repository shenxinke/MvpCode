package com.zuo.demo.homelib;

import android.util.Log;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import java.lang.Object;
import java.lang.Override;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class LibHomeActivity$$ARouter$$Autowired implements ISyringe {
  private SerializationService serializationService;

  @Override
  public void inject(Object target) {
    serializationService = ARouter.getInstance().navigation(SerializationService.class);
    LibHomeActivity substitute = (LibHomeActivity)target;
    substitute.my_num = substitute.getIntent().getLongExtra("number", substitute.my_num);
    if (null != serializationService) {
      substitute.news = serializationService.parseObject(substitute.getIntent().getStringExtra("name"), new com.alibaba.android.arouter.facade.model.TypeWrapper<Object>(){}.getType());
    } else {
      Log.e("ARouter::", "You want automatic inject the field 'news' in class 'LibHomeActivity' , then you should implement 'SerializationService' to support object auto inject!");
    }
  }
}