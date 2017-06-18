package com.example.administrator.azuresong.module.Base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.adapter.ViewPagerAdapter;
import com.example.administrator.azuresong.module.Gank.GankFragment;
import com.example.administrator.azuresong.module.Meizi.MeiziFragment;
import com.example.administrator.azuresong.module.ZhihuDaily.ZhihuDailyFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/8 0008.
 */

public class BaseActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.bnv_menu)
    BottomNavigationView mBnvMenu;

    private MenuItem mMenuItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_tab_layout_ac);
        ButterKnife.bind(this);

        mBnvMenu.setOnNavigationItemSelectedListener(this);

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (mMenuItem != null) {
                    mMenuItem.setChecked(false);
                } else {
                    mBnvMenu.getMenu().getItem(0).setChecked(false);
                }
                mMenuItem = mBnvMenu.getMenu().getItem(position);
                mMenuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewpager);
    }

    private void setupViewPager(ViewPager viewpager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ZhihuDailyFragment());
        adapter.addFragment(new MeiziFragment());
        adapter.addFragment(new GankFragment());
        viewpager.setAdapter(adapter);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_zhihu:
                viewpager.setCurrentItem(0);
                break;
            case R.id.action_meizi:
                viewpager.setCurrentItem(1);
                break;
            case R.id.action_gank:
                viewpager.setCurrentItem(2);
                break;
        }
        return false;
    }

}
