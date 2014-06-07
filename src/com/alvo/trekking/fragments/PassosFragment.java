package com.alvo.trekking.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alvo.trekking.R;

public class PassosFragment extends Fragment implements OnClickListener {
	
	private Button botao;
	private TextView contadorText;
	private long nPassos;
	
	public PassosFragment() {
		nPassos = 0;
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.passos_fragment, container, false);

    	contadorText = (TextView) v.findViewById(R.id.contadorText);
    	botao = (Button) v.findViewById(R.id.botaoContaPassos);
    	botao.setOnClickListener(this);
    	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();
    	refreshContador();
    }
    
    @Override
    public void onClick(View v) {
      switch (v.getId()) {
        case R.id.botaoContaPassos:
    		nPassos++;		
    		refreshContador();
            break;
        }
    }
    public void refreshContador() {
    	contadorText.setText(nPassos+ "");
    }
}
