package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.Utility.BaseClass1;
import com.Utility.Custom_Library;

public class Test_001 extends BaseClass1{
	
	LoginPage login;
	@Test
	public void VerifyTest_001() throws InterruptedException {
		 login=new LoginPage(driver);
		 
		 String parentPage=driver.getTitle();
		 System.out.println(parentPage);
		
//		 Custom_Library.custom_Click(login.getButtonNewWindow());
//		 
//		 Custom_Library.custom_Click(login.getOpenTab());
//		 
//		 Custom_Library.custom_WindowHandles("parentPage");
//		// Custom_Library.custom_WindowHandles(1);
//		 
//		 System.out.println(driver.getTitle());
//		 
//		 Assert.assertEquals("All Courses", driver.getTitle());
		 
	}
	@Test
	public void Test_002() {
		Assert.assertTrue(false);;
	}
	
	

}
