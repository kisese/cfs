package com.example.cfs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CustomerCareActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 Intent intentYangu = new Intent(CustomerCareActivity.this, Webs.class);
		 intentYangu.putExtra("link", "http://www.callfast.co.ke/index.php/customer-care");
         startActivity(intentYangu);
	}
	
}
