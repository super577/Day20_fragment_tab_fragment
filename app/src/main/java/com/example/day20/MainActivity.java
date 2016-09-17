package com.example.day20;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        ActionBar aBar=getActionBar();
        
        aBar.setDisplayShowHomeEnabled(false);
        aBar.setDisplayShowTitleEnabled(false);
        
        //设置Tab导航
        aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //添加tab选项
        aBar.addTab(aBar.newTab()
        .setText("tab01").setTabListener(this));
        aBar.addTab(aBar.newTab()
        .setText("tab02").setTabListener(this));
    }

    private Fragment frg01,frg02;
    String tags[]={"frg01","frg02"};
    //tab选中时执行
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		int pos=tab.getPosition();
		Log.i("TAG", "onTabSelected");
		/*if(pos==0){
		ft.replace(R.id.layoutId,new Fragment01());
		}else if(pos==1){
		ft.replace(R.id.layoutId,new Fragment02());
		}*/
		//================
		if(pos==0){
		frg01=new Fragment01();
		ft.add(R.id.layoutId,frg01,tags[0]);
		}else if(pos==1){
		frg02=new Fragment02();
	    ft.add(R.id.layoutId,frg02,tags[1]);
		}
	}
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		Log.i("TAG", "onTabUnselected");
		int pos=tab.getPosition();
		Fragment frg=
				getFragmentManager()
				.findFragmentByTag(tags[pos]);
		ft.remove(frg);
	}
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	    Log.i("TAG", "onTabReselected");
	}
}
