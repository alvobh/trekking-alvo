package com.alvo.trekking.fragments;

import com.alvo.trekking.R;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Chronometer;
import android.widget.ImageButton;

public class CalculadoraFragment extends Fragment implements OnClickListener{
	

	public CalculadoraFragment() {
		
	}
		
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.calculadora_fragment, container, false);
    	
   	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();  
    }

	@Override
	public void onClick(View v) {
//		switch(v.getId()) {
//		case R.id.play:
//			cronometro.start();
//			break;
//		case R.id.pause:
//			cronometro.stop();
//			break;
//		case R.id.refresh:
//			cronometro.stop();
//			cronometro.setBase(inicio);
//		}
	}
}
