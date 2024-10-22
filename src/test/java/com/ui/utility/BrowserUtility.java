package com.ui.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.Browser;

public abstract class BrowserUtility {

	private WebDriver d;

	public BrowserUtility(WebDriver driver) {

		this.d = driver;

	}

	public BrowserUtility(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			d = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			d = new EdgeDriver();
		}

		else {

			System.err.print("Unable to validate the browser name");
		}
	}

	public BrowserUtility(Browser browserName) {

		if (browserName == Browser.CHROME) {

			d = new ChromeDriver();
		}

		else if (browserName == Browser.EDGE) {

			d = new EdgeDriver();
		}

		else if (browserName == Browser.FIREFOX) {

			d = new FirefoxDriver();
		}

		else {

			System.err.print("Unable to validate the browser name");
		}
	}

	public WebDriver getD() {
		return d;
	}

	public void launchWebsite(String url) {

		d.get(url);
	}

	public void maximizeBrowser() {

		d.manage().window().maximize();
	}

	public void click(By locator) {
		WebElement element = d.findElement(locator);
		element.click();

	}

	public void enterText(By locator, String text) {
		WebElement element = d.findElement(locator);
		element.sendKeys(text);
	}

	public String getVisibleText(By locator) {
		WebElement element = d.findElement(locator);
		return element.getText();
	}

}
