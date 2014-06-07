package com.alvo.trekking.models;

import java.util.Arrays;
import java.util.List;

public class Meme {
	
	private String src;
	private String titulo;
	
	private static List<Meme> memes;
	
	private Meme(String _src, String _titulo) {
		this.src = _src;
		this.titulo = _titulo;
	}
	
	public String src() {
		return this.src;		
	}
	
	public String titulo() {
		return this.titulo;
	}
	
	private static void init() {
		Meme[] tmp = {
			new Meme("assets/memes/meme_4.jpg", "Atente para as instruções."),
			new Meme("assets/memes/meme_2.jpg", "Cuidado para não ser deixado para trás."),
			new Meme("assets/memes/meme_3.jpg", "Não esqueça do filtro solar."),
			new Meme("assets/memes/meme_7.jpg", "Fique de olho na sua bateria."),
			new Meme("assets/memes/meme_8.jpg", "Hidrate-se!"),
			new Meme("assets/memes/meme_6.jpg", ""),
			new Meme("assets/memes/meme_1.jpg", "Enjoy! =)"),
		};
		memes = Arrays.asList(tmp);
	}
	
	public static List<Meme> list() {
		if(memes == null) init();
		return memes;
	}
	
	

}
