package com.example.administrator.azuresong.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/18 0018.
 */

public class ListViewPagerAdapter extends PagerAdapter {

    List<ImageView> list = null;

    public ListViewPagerAdapter(List<ImageView> list) {
        this.list = list;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView(list.get(position));
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager) container).addView(list.get(position));
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }
}
