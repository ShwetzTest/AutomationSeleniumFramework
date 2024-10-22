package com.ui.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Environment;
import com.google.gson.Gson;
import com.ui.pojos.EnvJSON;
import com.ui.pojos.configJson;

public class JSONUtility {
	
	public static String readJSON(Environment env) {
	
	Gson gson =new Gson();
	File jsonfile = new File(System.getProperty(System.getProperty("user.dir")+"\\config\\config.json"));
	FileReader jsonReader = null;
	try {
		jsonReader = new FileReader(jsonfile);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	configJson configJson = gson.fromJson(jsonReader,configJson.class); //correspnding pojo class of JSON
	EnvJSON envVar = configJson.getEnvironments().get(env);
	return envVar.getUrl();
}
}