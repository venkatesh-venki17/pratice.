package com.so.Studyonlinepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelCome {
	WebDriver driver;
	@FindBy(xpath="//a[text()=\"Log In\"]")
	WebElement login;
	
	
	public WelCome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonlogin()
	{
		login.click();
	}

}
