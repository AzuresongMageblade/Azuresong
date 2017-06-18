package com.example.administrator.azuresong.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.module.Base.BaseAdapter;
import com.example.administrator.azuresong.utils.ListViewItem;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/6/18 0018.
 */

public class ListViewAdapter extends BaseAdapter {

    private LinkedList<ListViewItem> mListViewItems;
    private Context mContext;

    private TextView zhihuTitle;
    private ImageView zhihuImage;

    public ListViewAdapter(LinkedList<ListViewItem> mListViewItems, Context mContext) {
//    public ListViewAdapter(LinkedList<ListViewItem> mListViewItems, BaseActivity mBaseActivity) {
        this.mListViewItems = mListViewItems;
        this.mContext = mContext;
//        this.mContext = mBaseActivity;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return mListViewItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = LayoutInflater.from(mContext).inflate(R.layout.item_zhihu, parent, false);
//        convertView = inflater.inflate(R.layout.item_zhihu, parent, false);
        zhihuTitle = (TextView) convertView.findViewById(R.id.zhihu_title);
        zhihuImage = (ImageView) convertView.findViewById(R.id.zhihu_img);
        zhihuTitle.setText(mListViewItems.get(position).getZhihuTitle());
        zhihuImage.setBackgroundResource(mListViewItems.get(position).getZhihuImage());
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        //返回listview的类型数量
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
