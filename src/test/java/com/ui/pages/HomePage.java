package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.constants.Environment;
import com.ui.utility.BrowserUtility;
import com.ui.utility.JSONUtility;
import com.ui.utility.PropertiesUtil;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

	public HomePage(Browser browserName) {
		super(browserName);
		launchWebsite(PropertiesUtil.readProperty(Environment.QA,"URL"));
		// For JSON 
		
		launchWebsite(JSONUtility.readJSON(Environment.QA));
		maximizeBrowser();

	}

	public LoginPage goToLoginPage() {
		click(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getD());
		return loginPage;

	}

}
