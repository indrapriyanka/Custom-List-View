package com.example.listviewcust;

import java.io.File;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	LayoutInflater inflater;
	
	String path="/storage/sdcard1/DCIM/Camera/";
	File f=new File(path);
	String[] list=f.list();
	
	public MyAdapter(MainActivity mainActivity) {
		// TODO Auto-generated constructor stub
		
		inflater=LayoutInflater.from(mainActivity);
		
	}
 
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		convertView=inflater.inflate(R.layout.adapter, null);
		
		ImageView img=(ImageView)convertView.findViewById(R.id.imgView);
		TextView tv=(TextView)convertView.findViewById(R.id.tView);
		
		tv.setText(list[position]); 
		
		
		
		File ff=new File(path+list[position]);
		img.setImageURI(Uri.fromFile(ff));  
		
		
		
		
		return convertView;
	}

}
