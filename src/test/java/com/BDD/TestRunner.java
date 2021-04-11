package com.BDD;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

// Facing Issue while adding extent-report. For extent-report, Kindly view TestBDD link in source code


@RunWith(Cucumber.class)
@CucumberOptions(
//		features="C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestSwiggyAssignment\\src\\test\\java\\OnboardingFeatures\\Onboarding.feature",
		features="C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestSwiggyAssignment\\src\\test\\java\\OnboardingFeatures",
//		features="C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestSwiggyAssignment\\src\\test\\java\\OnboardingFeatures\\test.feature",
		glue= {"SwiggyDefinitions"}
//		,tags= "@order"
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,tags= "@signup or @otp or @login"
//		,tags= "@signup or @launch or @close or @otp"
//				,plugin= {"io.cucumber.junit.CucumberOptions.plugin:target\\cucumber-reports\\MyExReport.html"}
//		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/MyExtentReport.html"}
		)

public class TestRunner {
}
