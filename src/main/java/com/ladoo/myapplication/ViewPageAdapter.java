package com.ladoo.myapplication;


import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 153 on 20/02/2016.
 */
public class ViewPageAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<Fragment>();
    ArrayList<String> tabTitles=new ArrayList<String>();
    public void addFragment(Fragment fragments,String titles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(titles);

    }
    public ViewPageAdapter(FragmentManager fm)
    {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    public CharSequence getPageTitle(int position)
    {
        return tabTitles.get(position);

    }
}
