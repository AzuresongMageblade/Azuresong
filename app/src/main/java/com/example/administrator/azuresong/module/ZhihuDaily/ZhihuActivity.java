package com.example.administrator.azuresong.module.ZhihuDaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;

import com.example.administrator.azuresong.R;
import com.example.administrator.azuresong.adapter.ViewPagerAdapter;
import com.example.administrator.azuresong.module.Base.BaseActivity;
import com.example.administrator.azuresong.module.Base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/8 0008.
 */

public class ZhihuActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.bnv_menu)
    BottomNavigationView mBnvMenu;

    private MenuItem mMenuItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_tab_layout_ac);
        ButterKnife.bind(this);

        mBnvMenu.setOnNavigationItemSelectedListener(this);

        mViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
        setupViewPager(mViewpager);
    }

    private void setupViewPager(ViewPager viewpager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(BaseFragment.newInstance("新闻"));
        adapter.addFragment(BaseFragment.newInstance("图书"));
        adapter.addFragment(BaseFragment.newInstance("发现"));
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.d("TAG", item.getItemId() + " item was selected-------------------");
        switch (item.getItemId()) {
            case R.id.action_zhihu:
                mViewpager.setCurrentItem(0);
                break;
            case R.id.action_meizi:
                mViewpager.setCurrentItem(1);
                break;
            case R.id.action_gank:
                mViewpager.setCurrentItem(2);
                break;
        }
        return false;
    }
}
