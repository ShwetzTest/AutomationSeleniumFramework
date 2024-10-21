package com.ui.test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {
	
		HomePage homePage =new HomePage(Browser.CHROME);
		String loggedUser= homePage.goToLoginPage().doLoginWith("bapaxag214@adosnan.com", "password").getUserName();
	
	}

}
