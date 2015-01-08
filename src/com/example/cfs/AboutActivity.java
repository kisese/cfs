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

public class AboutActivity extends Activity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		Button introduction = (Button)findViewById(R.id.btn_about_intro);
		Button vmcv = (Button)findViewById(R.id.btn_about_vmcv);
		Button wwd = (Button)findViewById(R.id.btn_about_wwd);
		Button mngmt_staff = (Button)findViewById(R.id.btn_about_mngmt);
		
		introduction.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentIntro = new Intent(AboutActivity.this, Webs.class);
                 intentIntro.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-12-40-52/introduction");
                 startActivity(intentIntro);	
			}
		});
		
		vmcv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentVmcv = new Intent(AboutActivity.this, Webs .class);
                 intentVmcv.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-12-40-52/vision-mission-core-values");
                 startActivity(intentVmcv);
			}
		});
		
		mngmt_staff.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentYangu = new Intent(AboutActivity.this, Webs.class);
                 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-12-40-52/management-staff");
                 startActivity(intentYangu);
			}
		});
		
		
		wwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 Intent intentWwd = new Intent(AboutActivity.this, Webs.class);
                 intentWwd.putExtra("link", "http://www.callfast.co.ke/index.php/2014-01-18-12-40-52/what-we-do");
                 startActivity(intentWwd);
			}
		});

	}
	
}
