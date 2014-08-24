package com.example.andriodapp;

import com.example.andriodapp.intent.MyIntent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FpsHandler extends ActivityInitHandler {
    private Button back=null;
    private TextView txt=null;
	public FpsHandler(Activity activi) {
		super(activi);
	}

	@Override
	public void initListeners() {
		back=(Button)activity.findViewById(R.id.button1);
		txt=(TextView)activity.findViewById(R.id.textView1);
//		txt.setBackgroundColor(Color.GREEN);
		activity.getCallingActivity();
		//MyIntent myIntent=(MyIntent)activity.getIntent();
	//	txt.append(" processName:"+myIntent.getMessage());
		back.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//this way will not create a new activity, it will use the previous activity??
		     Intent backIntent=new Intent(activity,MainActivity.class);
		     activity.startActivity(backIntent);
			}
			
		});
	}

	@Override
	public void initParamters() {
		//initLogic  like show the fps 
		Object wifi=activity.getSystemService(Activity.WALLPAPER_SERVICE);
		System.out.println("sdfds");
	}

}
