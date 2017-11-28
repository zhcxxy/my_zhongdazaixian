package com.example.zcx.zhongdazaixian.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.zcx.zhongdazaixian.App;
import com.example.zcx.zhongdazaixian.utils.TUtil;

/**
 * Created by ZCX on 2017/11/27.
 */

public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends AppCompatActivity {

    private P mPresenter;
    private M mModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutID());
        App.baseActivity = this;
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);

        if(this instanceof BaseView){
            mPresenter.setVM(mModel,this);
        }

        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutID();
}
