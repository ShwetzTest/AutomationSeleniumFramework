package com.ui.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pojos.UserCredentials;

public class LoginTest {

	HomePage homePage;

	@BeforeMethod(description = "Launch Home Page")
	public void setUp() {

		homePage = new HomePage(Browser.CHROME);
	}

	@Test(description = "Verifies if the valid user can login to the application", groups = { "e2e", "sanity" },dataProviderClass = com.ui.dataProvider.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")
	public void Login(UserCredentials user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmail(),user.getPassword()),
				"Hello Bello");

	}
	
	
	@Test(description = "Verifies if the valid user can login to the application", groups = { "e2e", "sanity" },dataProviderClass = com.ui.dataProvider.LoginDataProvider.class,dataProvider = "LoginCsvDataProvider")
	public void LoginCsvTest(UserCredentials user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmail(),user.getPassword()),
				"Hello Bello");

	}
	
	@Test(description = "Verifies if the valid user can login to the application", groups = { "e2e", "sanity" },dataProviderClass = com.ui.dataProvider.LoginDataProvider.class,dataProvider = "LoginExcelDataProvider",
			retryAnalyzer = com.ui.listeners.RetryAnalyzer.class)
	public void LoginExcelTest(UserCredentials user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmail(),user.getPassword()),
				"Hello Bello");

	}

}