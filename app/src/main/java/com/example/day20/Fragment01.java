package com.example.day20;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 我现在随便改一个试试看
 */
public class Fragment01 extends Fragment {

	public Fragment01() {
		Log.i("TAG", "Fragment01()");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_fragment01, container, false);
	}

}
