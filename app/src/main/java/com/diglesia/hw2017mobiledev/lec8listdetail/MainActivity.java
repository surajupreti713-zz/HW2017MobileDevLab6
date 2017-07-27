package com.diglesia.hw2017mobiledev.lec8listdetail;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new ListFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
