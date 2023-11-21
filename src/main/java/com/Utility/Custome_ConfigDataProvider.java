package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Custome_ConfigDataProvider {
	Properties pro;
	public Custome_ConfigDataProvider() throws IOException {
		String ConfigPath=System.getProperty("user.dir")+"/Config/ConfigData.properties";
		FileInputStream fis=new FileInputStream(ConfigPath);
		
		 pro=new Properties();
		pro.load(fis);
		
	}

	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
		
	}
}
