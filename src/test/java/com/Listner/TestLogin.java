package com.Listner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POD.LinksPOM;

@Listeners(TestListner.class)
public class TestLogin {
	WebDriver driver;
	
	@BeforeClass
	 public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");

		  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.get("https://www.swiggy.com/");
	  
	  }
	@Test(priority=1)
	 public void SignUp() throws InterruptedException {
		 LinksPOM lp = new LinksPOM(driver);
		 lp.signup("9089089080", "testing", "checkauto@yopmail.com", "qwerty", 23346);
	 }
	 
	 @Test(dependsOnMethods="SignUp")
	 public void SearchItem() throws InterruptedException {
		 LinksPOM lp = new LinksPOM(driver);
		 lp.locate();
		 lp.searchRestaurant("domino's");
	 }
		 
	 @AfterClass
	  public void closeBrowser() {
		 driver.close();
	  }
}
