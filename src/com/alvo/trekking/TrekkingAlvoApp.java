package com.alvo.trekking;

import android.app.Application;

import com.bugsense.trace.BugSenseHandler;

public class TrekkingAlvoApp extends Application {
	@Override
	public void onCreate() {
		// if the app takes longer than 10s inside here it will crash
		super.onCreate();
		BugSenseHandler.initAndStartSession(getApplicationContext(), "f800b19c");
	}
}
