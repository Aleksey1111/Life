package com.example.olya.life.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.olya.life.Fragmens.Birthdays;
import com.example.olya.life.Fragmens.ExampleFragment;
import com.example.olya.life.Fragmens.Ideas;
import com.example.olya.life.Fragmens.Todo;

import java.util.Map;

/**
 * Created by Olya on 09.01.2017.
 */

public  class TabsFragmentAdapter extends FragmentPagerAdapter {
    private Map <Integer, Fragment> tabs;
    private Context context;
    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs.put(0,ExampleFragment.getInstance(context));
        tabs.put(1,Todo.getInstance(context));
        tabs.put(2, Ideas.getInstance(context));
        tabs.put(3, Birthdays.getInstance(context));

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
       return tabs.get()


        }
        return  null;
    }





    @Override
    public int getCount() {
        return tabs.length;
    }
}
