package com.ui.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest {

	HomePage homePage;

	@BeforeMethod(description = "Launch Home Page")
	public void setUp() {

		homePage = new HomePage(Browser.CHROME);
	}

	@Test(description = "Verifies if the valid user can login to the application", groups = { "e2e", "sanity" })
	public void Login() {

		assertEquals(homePage.goToLoginPage().doLoginWith("bapaxag214@adosnan.com", "password").getUserName(),
				"Hello Bello");

	}

}