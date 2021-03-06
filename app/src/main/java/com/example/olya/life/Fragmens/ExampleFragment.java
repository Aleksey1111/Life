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
 * Created by Olya on 09.01.2017.
 */

public class ExampleFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment;
    public static String title;

    private Context context;
   private View view;
    public static ExampleFragment getInstance(Context context) {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.history));
        fragment.setArguments(args);

        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;

    }

    public static void setTitle(String title) {
        ExampleFragment.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
