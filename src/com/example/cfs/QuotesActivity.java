package com.example.cfs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuotesActivity extends Activity{
	
	private Button rwandAir;
	private Button other;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quotes);
		
		rwandAir = (Button)findViewById(R.id.btn_svc_gsa);
		other = (Button)findViewById(R.id.btn_svc_trans);
		
		rwandAir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent rwandair = new Intent(QuotesActivity.this, RwandAirQuoteActivity.class);
    			QuotesActivity.this.startActivity(rwandair);
			}
		});
		
		other.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent rwandair = new Intent(QuotesActivity.this, OtherQuoteActivity.class);
    			QuotesActivity.this.startActivity(rwandair);
			}
		});
	}
	
}
