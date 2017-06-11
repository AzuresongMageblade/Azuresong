package com.example.administrator.azuresong.module.Meizi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.module.Base.BaseFragment;

public class MeiziFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meizi, null);
        TextView tvInfo = (TextView) view.findViewById(R.id.text_meizi);
        tvInfo.setText("Meizi");
        return view;
    }

}
