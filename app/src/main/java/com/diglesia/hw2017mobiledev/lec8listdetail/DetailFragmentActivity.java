package com.diglesia.hw2017mobiledev.lec8listdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class DetailFragmentActivity extends AppCompatActivity {

    public static Intent newIntent(Context context, String text) {
        Intent i = new Intent(context, DetailFragmentActivity.class);
        i.putExtra("text", text);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = DetailFragment.newInstance(getIntent().getStringExtra("text"));
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
