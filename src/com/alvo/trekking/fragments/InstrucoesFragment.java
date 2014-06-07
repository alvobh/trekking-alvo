package com.alvo.trekking.fragments;

import java.util.List;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.alvo.trekking.R;
import com.alvo.trekking.models.Meme;

public class InstrucoesFragment extends Fragment implements OnClickListener{
	
	private ImageView proximo;
	private ImageView anterior;
	private ImageView imagem;
	
	private List<Meme> memes;
	private int current;

	public InstrucoesFragment() {
		
	}
		
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        
    	View v = inflater.inflate(R.layout.instrucoes_fragment, container, false);
    	
    	proximo  = (ImageView) v.findViewById(R.id.proximaInstrucao);
    	anterior = (ImageView) v.findViewById(R.id.anteriorInstrucao);
    	imagem   = (ImageView) v.findViewById(R.id.imagemInstrucao);
    	
    	return v;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        memes = Meme.list();
        current = 0;
        atualizaImagem();
    }

    private void atualizaImagem() {
    	if(current <= memes.size() - 1 && current >= 0) {
    		Meme atual = memes.get(current);
    		String src = getActivity().getApplicationContext().getFilesDir().getAbsolutePath();
    		anterior.setVisibility(View.VISIBLE);
    		proximo.setVisibility(View.VISIBLE);
    		imagem.setImageURI(Uri.parse(src + "/" + atual.src()));
    	}
    	
		if(current == 0)
			anterior.setVisibility(View.INVISIBLE);
			
    	if(current == memes.size() - 1)
    		proximo.setVisibility(View.INVISIBLE);
    	
    }
    
	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.progress_horizontal:
			current++;
			atualizaImagem();
			break;
		case R.id.anteriorInstrucao:
			current--;
			atualizaImagem();
		}
	}
}
