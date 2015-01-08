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


public class RwandAirQuoteActivity extends Activity{
	
	private WebView browser;
	private String url_string;
	private String current_url;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		browser = (WebView)findViewById(R.id.webView1);
		
		Intent myIntentc = getIntent();
		url_string = "http://www.callfast.co.ke/index.php/2014-03-27-01-51-51/rwandair-cargo-quote-request";
	
			
		 DisplayWebViewTask task = new DisplayWebViewTask();
	     task.execute();
	     browser.setClickable(false);
	     browser.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				return event.getAction() == MotionEvent.ACTION_MOVE;
			}
		});
	    
	}
	

	
	
	private class MyBrowser extends WebViewClient{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			if(url == current_url)
			view.loadUrl(url);
			return true;
		}
	}
	
	
	private class DisplayWebViewTask extends AsyncTask<String, Void, String>{

		private ProgressDialog pDialog;
		
		

		@Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(RwandAirQuoteActivity.this);
            pDialog.setMessage("Fetching RSS Information ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.getSecondaryProgress();
            pDialog.show();
        }
		
		@Override
		protected String doInBackground(String... params) {
			browser.getSettings().setLoadsImagesAutomatically(true);
			browser.getSettings().setJavaScriptEnabled(true);
			browser.getSettings().getAllowFileAccess();
			browser.getSettings().getJavaScriptCanOpenWindowsAutomatically();
			browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
			browser.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
			browser.getSettings().setAppCacheEnabled(true);
			browser.loadUrl(url_string);
			
			
			
			//to be used for disabling links
			current_url = url_string;
			return url_string;
		}
		
	    @Override
				protected void onPostExecute(String result) {
			    	
			    	browser.setWebViewClient(new MyBrowser());
			    	 pDialog.dismiss();
					super.onPostExecute(result);
				}
	}
	
	  @Override
	  protected void onDestroy()
	  {
	    // Clear the cache (this clears the WebViews cache for the entire application)
	   // browser.clearCache(true);
	     
	    super.onDestroy();
	  }
	   
	  @Override
	  public File getCacheDir()
	  {
	    // NOTE: this method is used in Android 2.1
	     
	    return getApplicationContext().getCacheDir();
	  }
	  
	  //reduce webview memory footprint(
	  @Override
	  public void onDetachedFromWindow(){
		  super.onDetachedFromWindow();
		  
		  browser.removeAllViews();
		  if(browser != null){
			  browser.setTag(null);
			  browser.clearHistory();
			  browser.removeAllViews();
			  browser.destroy();
		  }
	  }
}

