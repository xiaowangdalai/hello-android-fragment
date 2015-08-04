package com.example.hellofragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hellofragment.ChangeView;
import com.example.hellofragment.R;

public class MainTab01 extends MainView {

	public MainTab01(ChangeView cv) {
		super(cv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.main_tab_01, container, false);
		
		Button btn = (Button) v.findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(mCv != null) {
					mCv.change();
				}
			}
		});
		
		return v;
	}

}
