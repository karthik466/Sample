package com.karthik.example.fragmentanim;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragementTwo extends Fragment {
  @Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	View v=inflater.inflate(R.layout.frag_two, container,false);
	return v;
}
}
