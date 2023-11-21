package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.Utility.Custom_ExtendReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Custom_Listener extends BaseClass1 implements ITestListener{

	
	
	
	
	ExtentReports extent=Custom_ExtendReport.getReport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case pass");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test case Fail");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test case Skip");
	}

	
	public String getScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		return ts.getScreenshotAs(OutputType.BASE64);
		
	}
}
