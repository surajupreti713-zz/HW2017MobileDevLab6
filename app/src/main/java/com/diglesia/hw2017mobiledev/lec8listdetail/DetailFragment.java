package com.diglesia.hw2017mobiledev.lec8listdetail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment{

    public static DetailFragment newInstance(String text) {
        Bundle args = new Bundle();
        args.putString("text", text);
        DetailFragment f = new DetailFragment();
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView textView = v.findViewById(R.id.text_view);
        textView.setText(getArguments().getString("text"));

        return v;
    }
}
