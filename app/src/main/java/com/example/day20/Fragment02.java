package com.example.day20;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class Fragment02 extends Fragment {

	public Fragment02() {
		Log.i("TAG", "Fragment02()");
		// Required empty public constructor
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v=inflater.inflate(
		R.layout.fragment_fragment02, container, false);
	    TextView tv=(TextView) v.findViewById(R.id.text02);
	    tv.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					Toast.makeText(getActivity(),
					((TextView)v).getText(),
					0).show();
				}
				return true;
			}
		});
	    return v;
	}

}
