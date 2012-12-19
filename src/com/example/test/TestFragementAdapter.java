package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.gms.maps.SupportMapFragment;
import com.viewpagerindicator.IconPagerAdapter;

class TestFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
    protected static final String[] CONTENT = new String[] { "1", "2", "3" };

    private int mCount = CONTENT.length;

    private final Context context;
    
    public TestFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(final int position) {
    	
    	if(position == 0){
    		return new SupportMapFragment();
    	}

		Fragment fragment = new Fragment(){
			@Override
			public View onCreateView(LayoutInflater inflater,
					ViewGroup container, Bundle savedInstanceState) {
				TextView tv = new TextView(context);
				tv.setText("TEST");
				if(position == 1){
					tv.setBackgroundColor(Color.WHITE);
				}else{
					tv.setBackgroundColor(Color.YELLOW);
				}
				return tv;
			}
		};
		return fragment;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return CONTENT[position % CONTENT.length];
    }
    
    @Override
    public int getIconResId(int index) {
    	return 0;
    }
}