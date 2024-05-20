package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount {

WebDriver ldriver;

public myaccount(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	
@FindBy(xpath="//input[@id='email_create']") WebElement createemailid;
@FindBy(xpath="//span[normalize-space()='Create an account']") WebElement submitbtn;
	
	
public void createemailaddress(String emailAdd) {
		createemailid.sendKeys(emailAdd);
}
	
public void clicksubmitbtn() {
	submitbtn.click();
}	
}
