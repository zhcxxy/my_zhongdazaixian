package com.example.zcx.zhongdazaixian.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.TextView;

import com.androidkun.PullToRefreshRecyclerView;
import com.example.zcx.zhongdazaixian.R;
import com.example.zcx.zhongdazaixian.base.BaseActivity;
import com.example.zcx.zhongdazaixian.net.NetModel;
import com.example.zcx.zhongdazaixian.net.NetPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<NetPresenter,NetModel> {


    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.tv_add)
    TextView mTvAdd;
    @BindView(R.id.pulltorefresh)
    PullToRefreshRecyclerView mPulltorefresh;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }


    @OnClick(R.id.tv_add)
    public void onViewClicked() {

    }
}
