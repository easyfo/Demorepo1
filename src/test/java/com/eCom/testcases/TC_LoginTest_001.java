package com.eCom.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eCom.base.TestBaseClass;
import com.eCom.pages.DashboardPage;
import com.eCom.pages.LoginPage;

public class TC_LoginTest_001 extends TestBaseClass {
	LoginPage lgnp;
	DashboardPage dashbrdpg;
	
	public TC_LoginTest_001() throws IOException {
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		 lgnp=new LoginPage();
	}
	
	@Test(priority=1)
	public void logodisplay() {
		boolean flag=lgnp.display();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void logintest() throws IOException {
		dashbrdpg=lgnp.login(prop.getProperty("username"), prop.getProperty("password"));
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
	}
	
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	

}
