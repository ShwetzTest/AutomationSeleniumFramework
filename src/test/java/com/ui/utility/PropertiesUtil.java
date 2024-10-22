package com.ui.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Environment;

public class PropertiesUtil {
	
	public static String readProperty(Environment env ,String propertyName)  {
		
		//Read QA.properties file 
		File propfile = new File(System.getProperty(System.getProperty("user.dir")+"\\config\\"+env+".properties"));
		FileReader fileReader = null;
		Properties properties =new Properties();
		try {
			fileReader = new FileReader(propfile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		return properties.getProperty(propertyName.toUpperCase());
	}

}
