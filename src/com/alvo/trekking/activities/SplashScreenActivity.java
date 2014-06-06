package com.alvo.trekking.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.alvo.trekking.R;

public class SplashScreenActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_activity);
		new ThreadInicializacao().execute();
	}
	
	private class ThreadInicializacao extends AsyncTask<Void, Void, Void> {
		
		private long TIME = 1200;
		
		@Override
		protected Void doInBackground(Void... params) {
			try {
				Thread.sleep(TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
			startActivity(intent);
			finish();
		}
	}

}
