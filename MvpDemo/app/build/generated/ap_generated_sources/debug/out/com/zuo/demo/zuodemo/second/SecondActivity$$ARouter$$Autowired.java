package com.zuo.demo.zuodemo.second;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import java.lang.Object;
import java.lang.Override;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class SecondActivity$$ARouter$$Autowired implements ISyringe {
  private SerializationService serializationService;

  @Override
  public void inject(Object target) {
    serializationService = ARouter.getInstance().navigation(SerializationService.class);
    SecondActivity substitute = (SecondActivity)target;
    substitute.my_num = substitute.getIntent().getLongExtra("number", substitute.my_num);
    substitute.news = (net.NewsDetail.ListBean) substitute.getIntent().getSerializableExtra("name");
  }
}
