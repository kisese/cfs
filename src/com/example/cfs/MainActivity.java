package com.example.cfs;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button home;
	private Button about_us;
	private Button our_services;
	private Button our_clients;
	private Button request_quote;
	private Button customer_care;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		home = (Button)findViewById(R.id.btn_home);
		about_us = (Button)findViewById(R.id.btn_about_us);
		our_services = (Button)findViewById(R.id.btn_our_services);
		our_clients = (Button)findViewById(R.id.btn_our_clients);
		request_quote = (Button)findViewById(R.id.btn_request_quote);
		customer_care = (Button)findViewById(R.id.btn_customer_care);
		
		nav();
	}
	
	public void nav(){
		
		home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homeAct = new Intent(MainActivity.this, HomeActivity.class);
    			MainActivity.this.startActivity(homeAct);
			}
		});
		
	our_services.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homeAct = new Intent(MainActivity.this, ServicesActivity.class);
    			MainActivity.this.startActivity(homeAct);
			}
		});
	
	our_clients.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent homeAct = new Intent(MainActivity.this, ClientsActivity.class);
			MainActivity.this.startActivity(homeAct);
		}
	});
		
	about_us.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homeAct = new Intent(MainActivity.this, AboutActivity.class);
    			MainActivity.this.startActivity(homeAct);
			}
		});
	
	request_quote.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent homeAct = new Intent(MainActivity.this, QuotesActivity.class);
			MainActivity.this.startActivity(homeAct);
		}
	});
	
	customer_care.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent homeAct = new Intent(MainActivity.this, CustomerCareActivity.class);
			MainActivity.this.startActivity(homeAct);
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
