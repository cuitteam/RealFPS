package com.example.androidapp.intent;

import android.content.Context;
import android.content.Intent;

public class MyIntent extends Intent {

	private String message="";
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MyIntent(Context context, Class classes){
		super(context,classes);
	}
	
}
