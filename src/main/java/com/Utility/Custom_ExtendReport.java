package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Custom_ExtendReport {
	
	public static ExtentReports extent;
	public static ExtentReports getReport () {
		String reportpath=System.getProperty("user.dir")+"\\Report\\report.html";
		
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Demo Test Report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Test");
		extent.setSystemInfo("Module Name", "Test Login ");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
		
	}

}
