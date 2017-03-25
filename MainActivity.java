package com.example.listviewcust;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity); 
		ListView lv=(ListView)findViewById(R.id.lView);
		
		lv.setAdapter(new MyAdapter(this)); 
		
	}
}