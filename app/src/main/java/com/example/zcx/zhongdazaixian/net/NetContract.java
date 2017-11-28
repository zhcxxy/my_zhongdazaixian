package com.example.zcx.zhongdazaixian.net;

import com.example.zcx.zhongdazaixian.base.BaseModel;
import com.example.zcx.zhongdazaixian.base.BasePresenter;
import com.example.zcx.zhongdazaixian.base.BaseView;

/**
 * Created by ZCX on 2017/11/27.
 */

public class NetContract {

    interface View extends BaseView {
        void show(String data);
    }

    interface Model extends BaseModel {
        void onSuccess(String res);
        void onFaild(String err);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {


        @Override
        protected void onStrat() {

        }


    }
}