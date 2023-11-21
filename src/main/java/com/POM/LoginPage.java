package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
//firoj
	@FindBy(how=How.XPATH, using ="//button[@id='openwindow']")
	private WebElement buttonNewWindow;
	
	public WebElement getButtonNewWindow() {
		return buttonNewWindow;
	}
	
	@FindBy(how=How.ID, using="opentab")
	private WebElement openTab;
	
	public WebElement getOpenTab() {
		return openTab;
	}
	
	
	
}
