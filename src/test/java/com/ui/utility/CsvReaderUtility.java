package com.ui.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojos.UserCredentials;

public class CsvReaderUtility {

	public static  Iterator<UserCredentials> csvData(String fileName) {
		File file = new File(System.getProperty("user.dir") + "\\testData\\"+fileName);
		FileReader fileReader = null;
		CSVReader csvreader = null;
		String csvLine[];
		List<UserCredentials> userData = null;

		try {
			fileReader = new FileReader(file);
			csvreader = new CSVReader(fileReader);
			userData = new ArrayList<UserCredentials>();
			UserCredentials usercreds;
			csvreader.readNext();// Skip first line which contains just header (email , password) in CSV
			// Initialising and then checking if not null .
			// readNext() starts from second line here (data exists and not headers)
			while ((csvLine = csvreader.readNext()) != null) {
				usercreds = new UserCredentials(csvLine[0], csvLine[1]);
				userData.add(usercreds);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		catch (CsvValidationException | IOException e) {

			e.printStackTrace();
		}
		
		return userData.iterator();
	}
}