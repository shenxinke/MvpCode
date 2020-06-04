package com.sxk.demo.loginlib.net;


import com.sxk.demo.loginlib.bean.PostInfoBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CommonService {
	@GET("query")
	Call<PostInfoBean> getPostInfo(@Query("type") String type, @Query("postid") String postid);
}
