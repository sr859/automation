package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[2]/a")
private WebElement buttonclick;
public WebElement getButtonclick() {
	return buttonclick;
}
public void setButtonclick(WebElement buttonclick) {
	this.buttonclick = buttonclick;
}
}
