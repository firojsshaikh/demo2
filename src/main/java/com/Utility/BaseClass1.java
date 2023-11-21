package com.Utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass1 {

	public static WebDriver driver;
	public static Custome_ConfigDataProvider config;
	public static Custome_ExcelDataProvider excel;

	@BeforeSuite
	public void configSetup() throws IOException {
		config=new  Custome_ConfigDataProvider();
		excel=new Custome_ExcelDataProvider();
	}
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void browserOpen(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}

		driver.get(config.getBaseUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void browserClose() {
		driver.quit();
	}
}
