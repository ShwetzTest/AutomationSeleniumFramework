package com.ui.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojos.UserCredentials;

public class ExcelReaderUtility {

	public static Iterator<UserCredentials> loginExcelData(String fileName) {

		File excelFile = new File(System.getProperty("user.dir") + "\\testData\\" + fileName);
		XSSFWorkbook xssf;
		XSSFSheet xssfsheet;
		List<UserCredentials> userList = null;
		Row row;
		Cell cellOne;
		Cell cellTwo;
		UserCredentials user;
		Iterator<Row> rowIterator;
		try {
			xssf = new XSSFWorkbook(excelFile);
			xssfsheet = xssf.getSheet("LoginData");
			rowIterator = xssfsheet.iterator();
			rowIterator.next(); // Skipping 1st row ie headers
			userList = new ArrayList<UserCredentials>();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				cellOne = row.getCell(0);
				cellTwo = row.getCell(1);
				
				user = new UserCredentials(cellOne.toString(), cellTwo.toString());
				userList.add(user);
				
			}
			
			xssf.close();
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return userList.iterator();

	}

}
