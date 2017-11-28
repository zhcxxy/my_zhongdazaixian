package com.example.zcx.zhongdazaixian.net;

import com.example.zcx.zhongdazaixian.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by
 */
public class NetModel implements NetContract.Model{
    private static volatile NetModel netModel;
    private OkHttpClient client;

    private NetModel() {
        client = new OkHttpClient.Builder().build();
    }

    public static NetModel getInstance() {
        if (netModel == null) {
            synchronized (NetModel.class) {
                netModel = new NetModel();
            }
        }
        return netModel;
    }

    @Override
    public void onSuccess(String res) {

    }

    @Override
    public void onFaild(String err) {

    }

//    public void getData(String url, final NetContract.Model imodel) {
//        Request request = new Request.Builder().url(url).build();
//        Call call = client.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                imodel.onFaild(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                final String string = response.body().string();
//                App.baseActivity.runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        imodel.onSuccess(string);
//                    }
//                });
//
//            }
//        });
//    }
}