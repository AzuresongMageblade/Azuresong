package com.example.administrator.azuresong.module.Base;

import android.os.Bundle;
import android.support.v4.app.Fragment;


/**
 * Created by Administrator on 2017/6/10 0010.
 */

public class BaseFragment extends Fragment {

    public static BaseFragment newInstance(String info) {
        Bundle args = new Bundle();
        BaseFragment fragment = new BaseFragment();
        args.putString("info", info);
        fragment.setArguments(args);
        return fragment;
    }
}
