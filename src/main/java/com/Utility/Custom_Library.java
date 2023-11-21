package com.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Custom_Library extends BaseClass1 {
	public static ExtentTest Test;
	public static void custom_Click(WebElement element) {
		
		try {
			if(element.isEnabled()==true) {
				element.click();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_SendKeys(WebElement element, String value) {
		try {
			if(element.isEnabled()==true) {
				element.sendKeys(value);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_WindowHandles(String parentPageTitle) {
		try {
			Set<String> windows=driver.getWindowHandles();
			for(String w:windows) {
				String pagetitle=driver.getTitle();
				if(!pagetitle.equalsIgnoreCase(parentPageTitle)) {
					driver.switchTo().window(w);
				}
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_WindowHandles(int index) {
		try {
			Set<String> windows=driver.getWindowHandles();
			List<String> list=new ArrayList<String>(windows);
			String w=list.get(index);
			driver.switchTo().window(w);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custom_HandleDropDown(WebElement element, String visibleText) {
		try {
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
