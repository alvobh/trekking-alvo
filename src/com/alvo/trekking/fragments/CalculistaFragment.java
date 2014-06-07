package com.alvo.trekking.fragments;

import com.alvo.trekking.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CalculistaFragment extends Fragment {

	public CalculistaFragment() {
		
	}
		
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.calculista_fragment, container, false);
    	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();
    }
}
