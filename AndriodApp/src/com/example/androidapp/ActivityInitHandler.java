package com.example.androidapp;

import android.app.Activity;

public abstract class ActivityInitHandler {
	protected Activity activity=null;
	
	public ActivityInitHandler(Activity activi){
	  activity=activi;
	  initListeners();
	  initParamters();
	}
	
	protected abstract void initListeners();
	
	protected abstract void initParamters();
	
}
