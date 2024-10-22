package com.ui.dataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojos.UserCredentials;
import com.ui.pojos.UserCredentialsTestData;
import com.ui.utility.CsvReaderUtility;
import com.ui.utility.ExcelReaderUtility;

public class LoginDataProvider {
	
	@DataProvider(name="LoginTestDataProvider")
	public Iterator<Object[]> userData() throws FileNotFoundException {
		
		Gson gson =new Gson();
		File file =new File(System.getProperty("user.dir")+"\\testData\\loginData.json");
		FileReader fileReader =new FileReader(file);
		UserCredentialsTestData jsonData = gson.fromJson(fileReader,UserCredentialsTestData.class );
        // Data Provider can return data only in the form of Object array [1D or 2D]
		List<Object[]> userData = new ArrayList<Object[]>();
		//Iterate over json data 
		
		for(UserCredentials user :jsonData.getData() ) {
			userData.add(new Object[] {user});
		}
		
		return userData.iterator();
}
	
	@DataProvider(name="LoginCsvDataProvider")
	public Iterator<UserCredentials> loginCsvDataIterator() {
		return CsvReaderUtility.csvData("logindata.csv");
		 
		
	}
	
	
	@DataProvider(name="LoginExcelDataProvider")
	public Iterator<UserCredentials> loginExcelDataIterator() {
		return ExcelReaderUtility.loginExcelData("loginCreds.xlsx");
		 
		
	}
	
	
}