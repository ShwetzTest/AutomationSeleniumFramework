package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {
	
	private static final By EMAIL = By.id("email");
	private static final By PASSWORD = By.id("passwd");
	private static final By SUBMIT_BTN = By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public MyAccount doLoginWith(String email,String password) {
		enterText(EMAIL,email);
		enterText(PASSWORD,password);
		click(SUBMIT_BTN);
		MyAccount myAccount =new MyAccount(getD());
		return  myAccount;
	}

}
