package com.example.andriodapp.windows;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
/*
 * 	//study url:http://api.apkbus.com/resources/tutorials/views/index.html
 */
public class RealFpsView extends TableLayout {
   private 	String[] itemList=new String[]{"选择进程","天天飞车","DOTA 传奇","Heading","Heading"};
   	
	
	public RealFpsView(Context context) {
		super(context);
		Spinner  sp=new Spinner(context);
		sp.setAdapter(new ArrayAdapter(context, android.R.layout.simple_list_item_1, 0,getSpinnerItem() ));
        Button start=new Button(context);
        start.setText("Start");
		addView(sp);
		addView(start);
	}
	
	
	private List getSpinnerItem(){
		 ArrayList list=new ArrayList();
	     for(String itemNmae:itemList){
	    	 list.add(itemNmae);
	     }
		 return list;
	}

}
