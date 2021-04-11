package com.Listner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListner implements ITestListener {
	Logger log = new Logger();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" has started");
		log.writeLogs("Start testing\n");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is success");
		log.writeLogs("Successful testing\n");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is failed");
		log.writeLogs("Failed result testing");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" has skipped");
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" has started");
		log.createLogger("Testing2");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		String crtDt = dtf.format(dateTime);
		
		log.writeLogs("Starting");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" has finished");
		log.closeLogger();
	}

}
