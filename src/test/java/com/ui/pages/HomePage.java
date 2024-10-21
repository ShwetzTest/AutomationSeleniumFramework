package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.ui.utility.BrowserUtility;

public final class HomePage extends BrowserUtility{
	
	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");
	
	
	public HomePage(Browser browserName) {
		super(browserName);
		launchWebsite("http://www.automationpractice.pl/index.php");
		maximizeBrowser();
		
	}

	
	public LoginPage goToLoginPage() {
		click(SIGN_IN_LOCATOR);
		LoginPage loginPage =new LoginPage(getD());
		return loginPage;
		
	}

}
