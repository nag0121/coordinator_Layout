package com.example.lenovo.coordinator_layout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    TabLayout tl_tabs;
    CollapsingToolbarLayout ctl_header;
    Toolbar toolbar = null;
    LinearLayout ll_draw,ll2,ll3,ll4,ll5;
    CoordinatorLayout cl_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar)findViewById(R.id.R_id_toolbar);
        ActionBar actionBar = getSupportActionBar();
        setSupportActionBar(toolbar);


        ctl_header=(CollapsingToolbarLayout)findViewById(R.id.ctl_main_main);

        ctl_header.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
        ctl_header.setExpandedTitleTextAppearance(R.style.expandedappbar);


        dynamicToolbarColor();

        toolbarTextAppernce();


    }


    private void dynamicToolbarColor() {

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.inadia);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                ctl_header.setContentScrimColor(R.attr.actionModeBackground);
                ctl_header.setStatusBarScrimColor(palette.getMutedColor(R.attr.colorPrimaryDark));
            }
        });
    }


    private void toolbarTextAppernce() {
        ctl_header.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
        ctl_header.setExpandedTitleTextAppearance(R.style.expandedappbar);
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_item, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);

//    }


}
