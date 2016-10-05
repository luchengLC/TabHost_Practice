package com.example.lc.tabhost_practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(R.id.tabhost);

        TabHost.TabSpec tab1 =tabHost.newTabSpec("tab1").setIndicator("已接电话").setContent(R.id.tab01);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2").setIndicator("呼出电话",getResources().getDrawable(R.drawable.b)).setContent(R.id.tab02);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("Tab3").setIndicator("未接电话").setContent(R.id.tab03);
    }

}