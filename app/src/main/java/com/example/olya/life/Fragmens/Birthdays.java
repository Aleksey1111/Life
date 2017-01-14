package com.example.olya.life.Fragmens;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olya.life.R;

/**
 * Created by Olya on 13.01.2017.
 */

public class Birthdays extends Fragment {
    private static final int LAYOUT = R.layout.fragment;
    private static String title;
    private View view;
    public Context context;
    public static Birthdays getInstance(Context context) {

        Bundle args = new Bundle();
        Birthdays fragment = new Birthdays();
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.birthdays));
        fragment.setArguments(args);
        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;

    }

    public void setContext(Context context) {
        this.context = context;
    }

    public static void setTitle(String title) {
        Birthdays.title = title;
    }
}