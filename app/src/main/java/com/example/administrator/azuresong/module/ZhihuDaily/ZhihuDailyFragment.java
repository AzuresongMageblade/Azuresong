package com.example.administrator.azuresong.module.ZhihuDaily;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.module.Base.BaseFragment;

public class ZhihuDailyFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zhihu_daily, null);
        TextView tvInfo = (TextView) view.findViewById(R.id.text);
        tvInfo.setText("ZhihuDialy");
        return view;
    }

}
