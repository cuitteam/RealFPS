package com.example.andriodapp.windows;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;

@SuppressLint("NewApi")
public class MainView extends TableLayout  {

	public MainView(Context context) {
		super(context);
		ListView list=new ListView(context);
		list.setBackgroundColor(Color.GREEN);
		list.setAdapter(new ArrayAdapter(context, android.R.layout.simple_list_item_1, 0,getItemData() ));
        addView(list);
		Button t=new Button(context);
		t.setBackgroundColor(Color.BLACK);
		t.setText("teste");
		this.setBackgroundColor(Color.RED);
		this.addView(t);
		CheckBox check=new CheckBox(context);
		check.setBackgroundColor(Color.YELLOW);
		addView(check);
		
		Spinner  sp=new Spinner(context);
	    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
	            context,android.R.array.phoneTypes, android.R.layout.simple_dropdown_item_1line);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    sp.setAdapter(new ArrayAdapter(context, android.R.layout.simple_list_item_1, 0,getItemData() ));
		addView(sp);

		View v=null;
//		this.addView(list);
	}


	
	
	
	
  public List getItemData(){

	 ArrayList list=new ArrayList();
	 list.add("test");
	 list.add("test1");
	 return list;
  }
 
}
