package com.example.administrator.azuresong.module.ZhihuDaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.module.Base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/8 0008.
 */

public class ZhihuActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.bnv_menu)
    BottomNavigationView mBnvMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_tab_layout_ac);
        ButterKnife.bind(this);

        mBnvMenu.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.d("TAG", item.getItemId() + " item was selected-------------------");
        return true;

    }


}
