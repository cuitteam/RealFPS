package com.example.andriodapp.windows;

import java.util.ArrayList;
import java.util.List;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
/*
 * 	//study url:http://api.apkbus.com/resources/tutorials/views/index.html
 */
public class RealFpsView extends LinearLayout {
   private 	String[] itemList=new String[]{"选择进程","天天飞车","DOTA 传奇","Heading","Heading"};
   	
	
	public RealFpsView(Context context) {
		super(context);
		Spinner  sp=new Spinner(context);
		sp.setAdapter(new ArrayAdapter(context, android.R.layout.simple_list_item_1, 0,getSpinnerItem() ));
        
		Button start=new Button(context);
		start.setHeight(300);
        start.setText("Start");
        addView(sp, Gravity.TOP);
//        row1.setGravity() left， center,right
//        row1.addView(sp, LayoutParams.WRAP_CONTENT);
		addView(start,Gravity.BOTTOM);
		Service t=null;
//		BroadcastReceiver re=null;
//		ContentProvider p=null;
//		ContentResolver  resolver=null;
//		Intent s=null;
//		TableRow tr=null;
		View view=null;
		LayoutParams lp=null;
	}
	
	
	private List getSpinnerItem(){
		 ArrayList list=new ArrayList();
	     for(String itemNmae:itemList){
	    	 list.add(itemNmae);
	     }
		 return list;
	}

}
