package com.so.Studyonlinepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	        @FindBy(xpath="//a[@id='navbarProfileDropdown']")
	        WebElement navbar;
			@FindBy(xpath="//a[text()='Log out']")
			WebElement logout;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void navabarProfileDown()
	{
		navbar.click();
	}
	public void loc_logout()
	{
		logout.click();
	}

}
