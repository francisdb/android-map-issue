package com.example.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		
		//Set the pager with an adapter
		ViewPager pager = (ViewPager)findViewById(R.id.pager);
		pager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager(), this));

		//Bind the title indicator to the adapter
		com.viewpagerindicator.TabPageIndicator titleIndicator = (com.viewpagerindicator.TabPageIndicator)findViewById(R.id.indicator);
		titleIndicator.setViewPager(pager);
	}

}
