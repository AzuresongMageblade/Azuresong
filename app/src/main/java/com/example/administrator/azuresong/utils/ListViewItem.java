package com.example.administrator.azuresong.utils;

/**
 * Created by Administrator on 2017/6/18 0018.
 */

public class ListViewItem {

    private String zhihuTitle;
    private int zhihuImage;

    public ListViewItem(String zhihuTitle, int zhihuImage) {
        this.zhihuTitle = zhihuTitle;
        this.zhihuImage = zhihuImage;
    }

    public String getZhihuTitle() {
        return zhihuTitle;
    }

    public void setZhihuTitle(String zhihuTitle) {
        this.zhihuTitle = zhihuTitle;
    }

    public int getZhihuImage() {
        return zhihuImage;
    }

    public void setZhihuImage(int zhihuImage) {
        this.zhihuImage = zhihuImage;
    }
}
