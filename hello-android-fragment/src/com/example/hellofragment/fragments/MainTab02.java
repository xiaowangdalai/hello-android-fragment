package com.example.hellofragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hellofragment.ChangeView;
import com.example.hellofragment.R;

public class MainTab02 extends MainView {

	public MainTab02(ChangeView cv) {
		super(cv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_tab_02, container, false);
	}

}
