package com.example.thinkpad.viewpagerdemo;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class myPageAdapter extends PagerAdapter {
    private ArrayList<View> viewList;
    private ArrayList<String> titleList;
    public myPageAdapter(){
    }
    public myPageAdapter(ArrayList<View> viewList){
        super();
        this.viewList=viewList;
    }
    public myPageAdapter(ArrayList<View> viewList,ArrayList<String> titleList){
        super();
        this.viewList=viewList;
        this.titleList=titleList;
    }
    @Override
    public int getCount(){
        return viewList.size();
    }
    @Override
    public boolean isViewFromObject(View v,Object o){
        return v==o;
    }
    @Override
    public Object instantiateItem(ViewGroup container,int position){
        container.addView(viewList.get(position));
        return viewList.get(position);
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView(viewList.get(position));
    }
    @Override
    public CharSequence getPageTitle(int position){
        return titleList.get(position);
    }
}