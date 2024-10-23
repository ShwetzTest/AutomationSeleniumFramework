package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Environment;
import com.ui.utility.PropertiesUtil;

public class RetryAnalyzer implements IRetryAnalyzer {

	private static final int MAX_ATTEMPTS = Integer.parseInt(PropertiesUtil.readProperty(Environment.QA,"MAX_RETRY_ATTEMPTS"));
	
	//for json 
	//private static final int MAX_ATTEMPTS = Integer.parseInt(JSONUtility.readJSON(Environment.QA).getMAX_RETRY_ATTEMPTS());
	
	private int current_attempt = 1;

	@Override
	public boolean retry(ITestResult result) {
		
		if(current_attempt<=MAX_ATTEMPTS) {
			current_attempt++;
			return true; //Rerun the failed test
		}

		return false;
	}

}
