package com.POD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		//Calling for Sign Up
		LinksPOM lp = new LinksPOM(driver);
		lp.signup("9089089080", "testing", "checkauto@yopmail.com", "qwerty", 23346);
//		lp.searchLocation("chandigarh");
		lp.locate();
		lp.searchRestaurant("domino's");
		lp.end();
	}

}
