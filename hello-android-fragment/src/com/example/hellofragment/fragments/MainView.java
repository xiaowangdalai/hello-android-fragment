package com.example.hellofragment.fragments;

import java.util.ArrayList;
import java.util.List;

import com.example.hellofragment.ChangeView;
import com.example.hellofragment.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainView extends Fragment {
	protected ChangeView mCv;
	
	public MainView(ChangeView cv) {
		mCv = cv;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.main_view, container, false);
		
		ViewPager pager = (ViewPager) view.findViewById(R.id.view_pager);
		
		final List<Fragment> fragments = new ArrayList<Fragment>();
		MainTab01 tab01 = new MainTab01(mCv);
		MainTab02 tab02 = new MainTab02(mCv);
		MainTab03 tab03 = new MainTab03(mCv);
		fragments.add(tab01);
		fragments.add(tab02);
		fragments.add(tab03);
		
		FragmentPagerAdapter adapter = new FragmentPagerAdapter(getChildFragmentManager()) {
			
			@Override
			public int getCount() {
				return fragments.size();
			}
			
			@Override
			public Fragment getItem(int i) {
				return fragments.get(i);
			}
		};
		
		pager.setAdapter(adapter);
		return view;
	}

}
