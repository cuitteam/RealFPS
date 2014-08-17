package com.example.andriodapp.logic;

import android.app.Activity;

/**
 * 
 * @author Silent
 * Deal the logic of the specific window
 */
public abstract class LogicDeal {
	protected Activity activity=null;
	
	public LogicDeal(Activity activi){
	  activity=activi;
	}
	
	public abstract void executeLogic();
	
	
}
