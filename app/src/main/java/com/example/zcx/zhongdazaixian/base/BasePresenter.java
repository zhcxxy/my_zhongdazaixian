package com.example.zcx.zhongdazaixian.base;

import android.content.Context;

/**
 * Created by ZCX on 2017/11/27.
 */

public abstract class BasePresenter<M,V> {
//    public Context context;
    public M iModel;
    public V iView;

    public void setVM( M iModel, V iView) {
        this.iModel = iModel;
        this.iView = iView;
        this.onStrat();
    }

    protected abstract void onStrat();

}
