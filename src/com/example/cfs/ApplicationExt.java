package com.example.cfs;

import java.io.File;

import android.app.Application;
import android.os.Environment;


//save webview to the sd card

public class ApplicationExt extends Application{

	protected File extStorageAppBasePath;
	protected File extStorageAppCachePath;
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		//check if external storage is writable
		if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
			
			//retrieve the base path for the application in the external storage
			File extStorarageDir = Environment.getExternalStorageDirectory();
			
			if(extStorarageDir != null){
				//{SD_PATH}/Android/data/com.example.project_news
				extStorageAppBasePath = new File(extStorarageDir.getAbsolutePath() + 
						File.separator + "Android" + File.separator + "data" + 
						File.separator + getPackageName());
			}
			
			if(extStorageAppBasePath != null){
				//{SD_PATH}/Android/data/com.example.project_news
				extStorageAppCachePath = new File(extStorageAppBasePath.getAbsolutePath() + 
						File.separator + "cache");
				
				boolean isCachePathAvailable = true;
				
				if(!extStorageAppCachePath.exists()){
					//create the cache path on the external strorage
					isCachePathAvailable = extStorageAppCachePath.mkdirs();
				}
				
				if(!isCachePathAvailable){
					//unable to create cache path
					extStorageAppCachePath = null;
				}
			}
		}
	}


	@Override
	public File getCacheDir() {
		
		//for android 2.2 and higher
		if(extStorageAppCachePath != null){
			//use teh external storage of the cache
			return extStorageAppCachePath;
		}else{
			return super.getCacheDir();
		}
	}
	
	
}
