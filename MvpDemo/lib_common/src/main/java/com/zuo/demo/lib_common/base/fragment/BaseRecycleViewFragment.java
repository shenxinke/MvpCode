package com.zuo.demo.lib_common.base.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.zuo.demo.lib_common.R;
import com.zuo.demo.lib_common.base.present.BaseRecycleViewPresent;
import com.zuo.demo.lib_common.base.view.BaseRecycleView;


/**
 * @author zuo
 * @filename: BaseRecycleViewFragment
 * @date: 2020/4/17
 * @description: 列表fragment基类
 * @version: 1.0
 */
public abstract class BaseRecycleViewFragment<T extends BaseQuickAdapter,V extends BaseRecycleView, P extends BaseRecycleViewPresent<V>> extends BaseFragment<V, P> implements OnRefreshListener, OnLoadMoreListener,BaseRecycleView,BaseQuickAdapter.OnItemClickListener,BaseQuickAdapter.OnItemChildClickListener {
	protected RecyclerView mRecyclerView;
	protected T mAdapter;//适配器
	protected Integer mPage = 1;//分页page
	protected String mTime = "0";//列表分页time

	@NonNull
	@Override
	public P createPresenter() {
		return (P) new BaseRecycleViewPresent<>(this);
	}

	protected abstract T createAdapter();

	@Override
	public int getLayoutId() {
		return R.layout.activity_recycleview;
	}

	@Override
	protected void initView() {
		initTitle();
		mRecyclerView = mRootView.findViewById(R.id.recyclerview);
		mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
		mRefreshLayout.setOnRefreshListener(this);
		mRefreshLayout.setOnLoadMoreListener(this);
		mAdapter = createAdapter();
		mAdapter.bindToRecyclerView(mRecyclerView);
		mAdapter.setEnableLoadMore(false);
		mAdapter.setOnItemClickListener(this);
		mAdapter.setOnItemChildClickListener(this);
	}

	public abstract void initTitle();

	@Override
	protected void initData() {
		if (checkNetWork()) {
			loadData(true);
		}
	}

	@Override
	public void onRefresh(@NonNull RefreshLayout refreshLayout) {
		if (checkNetWork()) {
			refreshLayout.setNoMoreData(false);
			hideErrorDataView();
			hideNoDataView();
			mTime = "0";
			mPage = 1;
			mAdapter.setNewData(null);
			loadData(false);
		}
	}


	@Override
	public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
		if (checkNetWork()) {
			loadData(true);
		}
	}


	@Override
	public boolean setEnableRefresh() {
		return true;
	}

	@Override
	public boolean setEnableLoadMore() {
		return true;
	}


	public abstract void loadData(boolean isLoadMore);

	protected void finishLoadData(boolean isLoadMore) {
		if (isLoadMore) {
			mRefreshLayout.finishLoadMore();
		} else {
			mRefreshLayout.finishRefresh();
		}
	}

	protected void noMoreData() {
		mRefreshLayout.finishLoadMoreWithNoMoreData();
	}

	protected void noMoreDataShowNoDataView() {
		noMoreData();
		if (mAdapter.getData().size() ==0){
			showNoDataView();
		}else{
			hideNoDataView();
		}
	}

	@Override
	public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {

	}

	@Override
	public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {

	}
}
