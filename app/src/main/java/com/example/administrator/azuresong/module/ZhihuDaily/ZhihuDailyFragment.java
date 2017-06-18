package com.example.administrator.azuresong.module.ZhihuDaily;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.adapter.ListViewAdapter;
import com.example.administrator.azuresong.module.Base.BaseFragment;
import com.example.administrator.azuresong.utils.ListViewItem;

import java.util.LinkedList;
import java.util.List;

public class ZhihuDailyFragment extends BaseFragment {

    private Context mContext;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private List<ListViewItem> mData = null;
    private LayoutInflater inflater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fragment_zhihu_daily, null);
        listView = (ListView) view.findViewById(R.id.listview_zhihu_daily);
        View pagerView = inflater.inflate(R.layout.head_viewpager, null);
        ViewPager viewPager = (ViewPager) pagerView.findViewById(R.id.head_view_pager);

        mData = new LinkedList<ListViewItem>();
        mData.add(new ListViewItem("长风几万里", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("吹度玉门关", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("天生弱智难自弃", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("天生弱智难自弃", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("天生弱智难自弃", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("天生弱智难自弃", R.mipmap.ic_launcher));
        mData.add(new ListViewItem("天生弱智难自弃", R.mipmap.ic_launcher));

        listViewAdapter = new ListViewAdapter((LinkedList<ListViewItem>) mData, mContext);
        listView.setAdapter(listViewAdapter);

        return view;
    }


}