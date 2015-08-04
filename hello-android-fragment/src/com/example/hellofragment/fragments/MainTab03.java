package com.example.hellofragment.fragments;

import com.example.hellofragment.ChangeView;
import com.example.hellofragment.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainTab03 extends MainView {

	public MainTab03(ChangeView cv) {
		super(cv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_tab_03, container, false);
	}

}
