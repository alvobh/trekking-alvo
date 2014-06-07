package com.alvo.trekking.fragments;

import java.math.BigDecimal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alvo.trekking.R;
import com.udojava.evalex.Expression;

public class CalculadoraFragment extends Fragment implements OnClickListener {

	EditText expressionText;
	TextView tvResult;

	String lastResult;

	public CalculadoraFragment() {

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.calculadora_fragment, container,
				false);

		expressionText = (EditText) v.findViewById(R.id.etNum1);
		tvResult = (TextView) v.findViewById(R.id.tvResult);	
		inicializaBotoes(v);
		
		return v;
	}
	
	public void inicializaBotoes(View v) {
		ImageView limpa = (ImageView) v.findViewById(R.id.zera);
		limpa.setOnClickListener(this);
		
		int[] botoes = {
				R.id.um,
				R.id.dois,
				R.id.tres,
				R.id.quatro,
				R.id.cinco,
				R.id.seis,
				R.id.sete,
				R.id.oito,
				R.id.nove,
				R.id.zero,
				R.id.soma,
				R.id.menos,
				R.id.multiplicacao,
				R.id.divisao,
				R.id.igual,
				R.id.ponto
		};
		for(int id : botoes) {
			Button botao = (Button) v.findViewById(id);
			botao.setOnClickListener(this);
		}	
	}
	
	public void escondeKeyboard(View v) {
		InputMethodManager inputManager = (InputMethodManager) getActivity()
	            .getSystemService(Context.INPUT_METHOD_SERVICE);
	    inputManager.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
	}

	public void calcula() {
		String expr = expressionText.getText().toString();
		expr = expr.replace(",", ".");
		lastResult = evaluate(expr);
		
		expressionText.setText("");
		tvResult.setText(lastResult + "");
	}

	public String evaluate(String exp) {
		try {
			BigDecimal result = null;
			Expression expression = new Expression(exp);
			result = expression.eval();
			return result.floatValue() + "";			
		} catch(Exception e) {
			return "ERRO";
		}
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.igual:
			calcula();
			break;
		case R.id.zera:
			expressionText.setText("");
			break;
		default:
			String botao = ((Button) v).getText().toString();
			expressionText.append(botao); 
		}
		
	}


}
