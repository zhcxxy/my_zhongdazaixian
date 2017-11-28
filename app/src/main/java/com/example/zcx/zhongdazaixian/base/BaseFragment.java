package com.example.zcx.zhongdazaixian.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zcx.zhongdazaixian.utils.TUtil;

/**
 * Created by ZCX on 2017/11/27.
 */

public  abstract class BaseFragment<P extends BasePresenter,M extends BaseModel>  extends Fragment{
    public P presenter;
    public M model;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        presenter = TUtil.getT(this, 0);
        model = TUtil.getT(this, 1);
        if (this instanceof BaseView) {
            presenter.setVM(model,this);
        }

        view = inflater.inflate(getLayoutIdFragment(), container, false);
        initView(view);
        initData();
        return view;
    }

    protected abstract void initData();

    protected abstract int getLayoutIdFragment();

    protected abstract void initView(View view);


}

