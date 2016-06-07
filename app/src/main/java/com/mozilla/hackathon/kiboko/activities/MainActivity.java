package com.mozilla.hackathon.kiboko.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import com.mozilla.hackathon.kiboko.R;
import com.mozilla.hackathon.kiboko.controls.TabsPagerAdapter;
import com.mozilla.hackathon.kiboko.services.ChatHeadService;


public class MainActivity extends Activity {
    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = { "Topics", "Icons"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ChatHeadService.class);
        startService(intent);
        finish();

    }
}
