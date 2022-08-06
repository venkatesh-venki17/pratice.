package com.so.studyonlineAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.so.Studyonlinepages.Home;
import com.so.Studyonlinepages.Login;
import com.so.Studyonlinepages.WelCome;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.studyonlinetech.com");
		
		WelCome w=new WelCome(driver);
		w.clickonlogin();
		
		 Login l=new Login(driver);
		 l.typePassword("9036862088");
		 l.typePhoneNumber("360360360");
		 l.clickButton();
		
		  Home o=new Home(driver);
         o.navabarProfileDown();
         o.loc_logout();
         
        // driver.close();
	}

}
