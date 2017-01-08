package com.example.olya.life.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.olya.life.Fragmens.ExampleFragment;

/**
 * Created by Olya on 09.01.2017.
 */

public  class TabsFragmentAdapter extends FragmentPagerAdapter {
    String [] tabs;
    public TabsFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs= new String[]{"1","Напоминания","2"};
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
               return ExampleFragment.getInstance();

            case 2:
                return ExampleFragment.getInstance();
            default:
                break;


        }
        return  null;
    }





    @Override
    public int getCount() {
        return tabs.length;
    }
}
