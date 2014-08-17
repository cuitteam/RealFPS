package com.example.andriodapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * 
 * @author Silent
 *
 *Mainly display the fps of the window
 */
public class FpsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.show_fps);
		FpsHandler fps=new FpsHandler(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
