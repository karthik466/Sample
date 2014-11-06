package com.karthik.example.fragmentanim;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	LinearLayout container;
  @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
}
  
  public void showFragment(View v)
  {
	 container= (LinearLayout) findViewById(R.id.fragment_container);
	 FragmentManager fm=getFragmentManager();
	  FragmentTransaction ft;
	  
	  switch(v.getId())
	  {
	  case R.id.fragment1_button:
		  ft=fm.beginTransaction();
		  ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		  ft.replace(R.id.fragment_container, new FragementOne(), "One");
		  ft.commit();		  
		  break;
	  case R.id.fragment2_button:
		  ft=fm.beginTransaction();
		 //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
		  
		  //ft .setCustomAnimations(R.anim.bottom_to_top, R.anim.shake);
		  ft.replace(R.id.fragment_container, new FragementTwo(), "Two");
		  ft.commit();	
		  break;
	  case R.id.fragment3_button:
		  ft=fm.beginTransaction();
		  ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		  ft.replace(R.id.fragment_container, new FragementThree(), "Three");
		  ft.commit();	
		  break;
		  
	  }
  }
}
