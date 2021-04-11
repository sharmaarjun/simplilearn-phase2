package com.POD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LinksPOM {
	WebDriver driver;
	
	// For Sign UP
	@FindBy(className="r2iyh")
	WebElement signup;
	@FindBy(id="mobile")
	WebElement phfield;
	@FindBy(id="name")
	WebElement namefield;
	@FindBy(id="email")
	WebElement emailfield;
	@FindBy(id="password")
	WebElement pwdfield;
	@FindBy(linkText="CONTINUE")
	WebElement cont;
	@FindBy(id="otp")
	WebElement otpfield;
	@FindBy(linkText="VERIFY OTP")
	WebElement verify;
	
	// For Search
	@FindBy(id="location")
	WebElement address;
	@FindBy(className="_1fiQt")
	WebElement locateMe;

	@FindBy(linkText="Search")
	WebElement searchbar;
	@FindBy(className="_2BJMh")
	WebElement enter2;
	

	public LinksPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void signup(String ph,String na, String em, String pwd, int otp) throws InterruptedException {
		signup.click();
		phfield.sendKeys(ph);
		namefield.sendKeys(na);
		emailfield.sendKeys(em);
		pwdfield.sendKeys(pwd);
		cont.click();
		Thread.sleep(3000);
		otpfield.sendKeys(String.valueOf(otp));
		verify.click();
		
	}
	
	// ------------- Search in Swiggy ---------------------- >>
	
		public void searchLocation(String loc) throws InterruptedException {
//			address.sendKeys(loc);
//			Thread.sleep(5000);
//			address.sendKeys(Keys.DOWN);
//			address.sendKeys(Keys.RETURN);
			
//			WebElement enter = driver.findElement(By.id("location"));
//			enter.sendKeys(loc);
//			Thread.sleep(5000);
//			enter.sendKeys(Keys.DOWN);
//			enter.sendKeys(Keys.RETURN );			
				
		}
		public void locate() throws InterruptedException {
			locateMe.click();
			Thread.sleep(5000);
		}
		
		public void searchRestaurant(String search) throws InterruptedException {
			searchbar.click();
			Thread.sleep(3000);
			enter2.sendKeys(search);
			Thread.sleep(3000);
			enter2.sendKeys(Keys.DOWN);
			enter2.sendKeys(Keys.RETURN);
			Thread.sleep(5000);
		}
		
	
	public void end() {
		driver.quit();
	}

	
}
