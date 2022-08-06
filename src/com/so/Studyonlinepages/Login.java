package com.so.Studyonlinepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='app_user_login']") 
	 WebElement loc_ph_no; 
	 @FindBy(xpath = "//input[@id='password-field']") 
	 WebElement loc_password; 
	 @FindBy(xpath = "//input[@name='commit']") 
	 WebElement loc_login_bn; 
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void typePassword(String ph)
	{
		loc_ph_no.sendKeys(ph);
	}
	public void typePhoneNumber(String pw)
	{
		loc_password.sendKeys(pw);
	}
	public void clickButton()
	{
		loc_login_bn.click();
	}
}
