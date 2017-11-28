package com.example.zcx.zhongdazaixian.designmodel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.zcx.zhongdazaixian.App;
import com.example.zcx.zhongdazaixian.base.BaseFragment;

/**
 * Created by ZCX on 2017/11/27.
 */

public class FragmentBuilder {
    private static volatile FragmentBuilder fragmentBuilder;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Fragment fragment;

    public FragmentBuilder() {
    }

    public static FragmentBuilder getInstance() {
        if (fragmentBuilder == null) {
            synchronized (FragmentBuilder.class){
                fragmentBuilder=new FragmentBuilder();            }
        }
        return fragmentBuilder;
    }

    public FragmentBuilder init(){
        manager = App.baseActivity.getSupportFragmentManager();
        transaction = manager.beginTransaction();
        return this;
    }

    public FragmentBuilder add(int containerId,Class<? extends BaseFragment> fragmentClass){
        String simpleName = fragmentClass.getSimpleName();
        fragment = manager.findFragmentByTag(simpleName);


        if (fragment == null) {
            try {
                fragment =fragmentClass.newInstance();
                transaction.add(containerId, fragment,simpleName);
                transaction.addToBackStack(simpleName);


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (App.baseFragment!=null){
            transaction.hide(App.baseFragment);
        }

        transaction.show(fragment);

        return this;
    }

    public void Builder(){
        App.baseFragment = (BaseFragment)fragment;
        transaction.commit();
    }
}
