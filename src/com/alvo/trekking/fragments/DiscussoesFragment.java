package com.alvo.trekking.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alvo.trekking.R;

public class DiscussoesFragment extends Fragment {
	
	private TextView perguntaText;
	private String[] perguntas;
	
	public DiscussoesFragment() {
		String[] perguntasTmp = {
			"Qual é a bússola que você tem usado como guia em suas decisões?",
			"Qual seu maior sonho? Quantos passos você tem dado por dia em direção a ele?",
			"Como você tem levado sua vida - como um maratonista, um corredor de regularidade ou um concorrente aos 100m rasos?",
			"Por onde você tem andado? Pela trilha, em meio as pedras ou em meio aos espinhos?"
		};
		perguntas = perguntasTmp;
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.discussoes_fragment, container, false);
    	perguntaText = (TextView) v.findViewById(R.id.perguntaText);
    	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        int index = (int) (Math.random() * perguntas.length);
    	perguntaText.setText(perguntas[index]);
    }
}
