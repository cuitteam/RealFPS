package com.example.andriodapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * 
 * @author Silent
 * Show welcome page with some views for user to interactive
 */
public class WelcomePageHandler extends ActivityInitHandler {
	private Spinner sp=null;
	private Button startButton=null;

	public WelcomePageHandler(Activity activi) {
		super(activi);
	}

	@Override
	public void initListeners() {
		sp=(Spinner)activity.findViewById(R.id.spinner1);
		startButton=(Button)activity.findViewById(R.id.button1);
		sp.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
    //logic
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}});
		
      
		
		startButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
 
//				System.out.println("clicked");
				FpsActivity fps=new FpsActivity();
                Intent fpsIntent= new Intent(activity, FpsActivity.class);  
				activity.startActivity(fpsIntent);
			}
			
		});
	}

	@Override
	public void initParamters() {
      sp.setAdapter(new ArrayAdapter(activity, android.R.layout.simple_dropdown_item_1line, scanProcessList()));
	}
	
	
	/**
	 * 
	 * @return
	 * prepare the processList of device
	 */
	private List scanProcessList(){
		//logic call the service of andriod
		List list=new ArrayList();
		list.add("test");
		list.add("test1");
		return list;
	}

}
