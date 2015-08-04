package com.example.hellofragment;

import com.example.hellofragment.fragments.MainTab01;
import com.example.hellofragment.fragments.MainView;
import com.example.hellofragment.fragments.SecondView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ChangeView iChangeView = new ChangeView() {
			
			@Override
			public void change() {
				Fragment fragment = new SecondView();
				
				FragmentManager fm = getSupportFragmentManager();
				fm.beginTransaction().replace(R.id.main_layout, fragment).commit();
			}
		};
		
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.addToBackStack(null);
		MainTab01 tab01 = new MainTab01(iChangeView);
//		ft.add(R.id.main_layout, new MainView(iChangeView)).commit();
		ft.add(R.id.main_layout, tab01).commit();
	}

	
}
