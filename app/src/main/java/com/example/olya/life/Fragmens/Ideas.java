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

public class Ideas extends Fragment {
    private static final int LAYOUT = R.layout.fragment;
    public static String title;
    private View view;
    private Context context;
    public static Ideas getInstance(Context context) {
        Bundle args = new Bundle();
        Ideas fragment = new Ideas();
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.ideas));
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
        Ideas.title = title;
    }
}