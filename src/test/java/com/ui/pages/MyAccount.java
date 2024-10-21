package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.utility.BrowserUtility;

public final class MyAccount extends BrowserUtility {
	
	private static final By USERNAME = By.xpath("//a[@title=\"View my customer account\"]/span");

	public MyAccount(WebDriver driver) {
		super(driver);
		
	}
	
	public String  getUserName() {
		return getVisibleText(USERNAME);
	}

}
