package com.POD;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class mainTestNG {
	
	WebDriver driver;
	
	
  @BeforeClass
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestSwiggyAssignment\\driver\\chromedriver.exe");

	  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 // driver.get("https://www.swiggy.com/");
  
  }
	 
	 @Test(priority=1)
	 public void SignUp() throws InterruptedException {
		 driver.get("https://www.swiggy.com/");
		 LinksPOM lp = new LinksPOM(driver);
		 lp.signup("9089089080", "testing", "checkauto@yopmail.com", "qwerty", 23346);
	 }
	 
	 @Test(priority=2)
	 public void SearchItem() throws InterruptedException {
		 driver.get("https://www.swiggy.com/");
		 LinksPOM lp = new LinksPOM(driver);
		 lp.locate();
		 lp.searchRestaurant("domino's");
	 }
	 
//  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

//  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @AfterClass
  public void closeBrowser() {
	 driver.quit();
	 }

}
