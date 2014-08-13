package com.example.andriodapp;

import com.example.andriodapp.windows.MainView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MainView mainView=new MainView(this.getBaseContext());
		mainView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,mainView.getItemData()))	;
		setContentView(mainView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
