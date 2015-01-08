package com.example.cfs;

import java.io.File;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ClientsActivity  extends Activity{
	
	private Button list;
	private Button testi;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clients);
		
		list = (Button)findViewById(R.id.btn_svc_trans);
		testi = (Button)findViewById(R.id.btn_svc_cnf);
		
		list.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ClientsActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-14-46-54/our-clients");
                 startActivity(intentYangu);	
			}
		});
		
		
		testi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ClientsActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-14-46-54/clients-testimonials");
                 startActivity(intentYangu);	
			}
		});
	}
}
