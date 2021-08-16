package com.eCom.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eCom.base.TestBaseClass;

import com.eCom.pages.DashboardPage;
import com.eCom.pages.LoginPage;
import com.eCom.pages.PIMpage;

public class TC_PIM_004 extends TestBaseClass{
	LoginPage lgnp;
	DashboardPage dashbrdpg = new DashboardPage();	
	//PIMpage PIM=new PIMpage();
	public TC_PIM_004() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		lgnp=new LoginPage();
		dashbrdpg=lgnp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(priority=1)
	public void chkemp() throws IOException {
		dashbrdpg.chkpim();
		
	}
	
	@Test(priority=2)
	public void addemployee() throws IOException {
		
		
		dashbrdpg.addempdetails("mythili", "kota", "prasanna");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
