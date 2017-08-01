package com.diglesia.hw2017mobiledev.lec8listdetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = v.findViewById(R.id.list_view);
        final String[] strings = new String[]{"hi", "this", "is", "fun"};
        listView.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, strings));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (getView().findViewById(R.id.detail_fragment_container) != null) {
                    DetailFragment fragment = DetailFragment.newInstance(strings[i]);
                    getFragmentManager().beginTransaction().replace(R.id.detail_fragment_container, fragment).commit();
                } else {
                    Intent intent = DetailFragmentActivity.newIntent(getContext(), strings[i]);
                    startActivity(intent);
                }
            }
        });

        return v;
    }

 }
