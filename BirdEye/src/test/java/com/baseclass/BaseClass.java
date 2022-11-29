package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();

}	
	
	public void maximizewindow() {
		driver.manage().window().maximize();

	}
	
	public void loadurl(String url) {
		driver.get(url);

	}
	public void type(WebElement element, String s) {
		element.sendKeys(s);
		

	}
	public void buttonclick(WebElement element) {
		element.click();
		

	}
	public void quitbrowser() {
		driver.close();

	}
	
	public String gettextmsg(WebElement element) {
		return element.getText();
		

	}
	public String currentUrl() {
		return driver.getCurrentUrl();

	}
	
}

