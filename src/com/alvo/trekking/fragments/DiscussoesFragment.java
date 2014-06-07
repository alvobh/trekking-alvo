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
			"Qual seu maior sonho?\n\nQuantos passos você tem dado por dia em direção a ele?",
			"Como você tem levado sua vida?\n\nComo um maratonista, um corredor de regularidade ou um concorrente aos 100m rasos?",
			"Por onde você tem andado?\n\nPela trilha, em meio as pedras ou em meio aos espinhos?",
			"Se você pudesse convidar qualquer pessoa da história para fazer este trekking com você, quem você convidaria?",
			"Se pudesse escolher qualquer lugar do mundo para viver, para onde você iria?",
			"Qual foi o ponto mais alto desta viagem até agora?\n\nE o mais baixo?",
			"O que pode fazer de nós melhores pessoas?",
			"O gênio da lâmpada vai realizar um sonho seu e impedir que todos os outros aconteçam. Qual você escolheria?",
			"Se você morresse hoje, qual seria o seu legado?\n\nPelo que você seria lembrado?",
			"Se tivesse que escolher uma única coisa para mudar no mundo, o que seria?",
			"Liberdade ou segurança? Conforto ou possibilidades?",
			"Pelo que você luta?\n\nOque você tem buscado?"			
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
