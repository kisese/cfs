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


public class ServicesActivity extends Activity{
	
	private Button transport;
	private Button cnf;
	private Button warehousing;
	private Button importsexports;
	private Button gsa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.services);
		
		transport = (Button)findViewById(R.id.btn_svc_trans);
		cnf = (Button)findViewById(R.id.btn_svc_cnf);
		warehousing = (Button)findViewById(R.id.btn_svc_warehousing);
		importsexports = (Button)findViewById(R.id.btn_scv_ine);
		gsa = (Button)findViewById(R.id.btn_svc_gsa);
		
		
		transport.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ServicesActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/our-services/transport-2");
                 startActivity(intentYangu);	
			}
		});
		
		cnf.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ServicesActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/our-services/clearing-and-forwading-2");
                 startActivity(intentYangu);	
			}
		});
		
		importsexports.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ServicesActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/our-services/imports-and-exports-2");
                 startActivity(intentYangu);	
			}
		});
		
		warehousing.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ServicesActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/our-services/warehousing-2");
                 startActivity(intentYangu);	
			}
		});
		
		gsa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(ServicesActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/our-services/rwandair-general-sales-agent-gsa");
                 startActivity(intentYangu);	
			}
		});

	}
	
}
