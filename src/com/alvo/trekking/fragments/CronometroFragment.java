package com.alvo.trekking.fragments;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageButton;

import com.alvo.trekking.R;

public class CronometroFragment extends Fragment implements OnClickListener{
	
	private ImageButton play;
	private ImageButton pause;
	private ImageButton refresh;
	
	private Chronometer cronometro;
	
	private long inicio;
	private boolean ativo;

	public CronometroFragment() {
		
	}
		
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.cronometro_fragment, container, false);
    	
    	play    = (ImageButton) v.findViewById(R.id.play);
    	pause   = (ImageButton) v.findViewById(R.id.pause);
    	refresh = (ImageButton) v.findViewById(R.id.refresh);
    	
    	play.setOnClickListener(this);
    	pause.setOnClickListener(this);
    	refresh.setOnClickListener(this);
    	
    	cronometro = (Chronometer) v.findViewById(R.id.chronometer1);
    	
    	inicio = SystemClock.elapsedRealtime();
    	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();  
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.play:
			if(!ativo) cronometro.setBase(SystemClock.elapsedRealtime());
			ativo = true;
			cronometro.start();
			break;
		case R.id.pause:
			cronometro.stop();
			break;
		case R.id.refresh:
			cronometro.stop();
			cronometro.setBase(SystemClock.elapsedRealtime());
		}
	}
}
