package com.example.andriodapp.windows;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainView extends ListView {

	public MainView(Context context) {
		super(context);
	}
	
	
	
	
  public List getItemData(){
	  Button t=new Button(getContext());
	  t.setText("Button");
	  t.setBackgroundColor(Color.WHITE);
	 ArrayList list=new ArrayList();
	 list.add("test");
	 list.add("test1");
	 list.add(t);
	 return list;
  }
 
}
