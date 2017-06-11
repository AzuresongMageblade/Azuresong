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

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_base, null);
//        TextView tvInfo = (TextView) view.findViewById(R.id.textView);
//        tvInfo.setText(getArguments().getString("info"));
//        tvInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Don't click me.please!.", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        return view;
//    }


}
