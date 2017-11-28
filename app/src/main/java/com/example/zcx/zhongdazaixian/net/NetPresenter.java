package com.example.zcx.zhongdazaixian.net;

import com.google.gson.Gson;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class NetPresenter extends NetContract.Presenter{
    private NetContract.Model iModel;
    private NetContract.View iView;

    public NetPresenter(NetContract.View iView) {
        this.iView = iView;
    }

    public void request(String url){
        NetModel.getInstance().getData(url, new NetContract.Model() {
            @Override
            public void onSuccess(String res) {
                iView.show(res);
            }

            @Override
            public void onFaild(String err) {

            }
        });
    }
}