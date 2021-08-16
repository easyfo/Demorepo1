package com.eCom.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eCom.base.TestBaseClass;
import com.eCom.pages.AdminPage;
import com.eCom.pages.DashboardPage;
import com.eCom.pages.LoginPage;
import com.eCom.pages.PIMpage;

public class TC_DashboardTest_002 extends TestBaseClass{
	LoginPage lgnp;
	DashboardPage dashbrdpg;
	AdminPage adminpg;
	
	public TC_DashboardTest_002() throws IOException {
				super();
			}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		 lgnp=new LoginPage();
		 adminpg= new AdminPage();
		 dashbrdpg=lgnp.login(prop.getProperty("username"), prop.getProperty("password"));
		 
		 	}
	
	@Test(priority=1)
	public void verifytitleTest() {
		String verifytitle=dashbrdpg.verifyhomepage();
		Assert.assertEquals(verifytitle, "OrangeHRM", "expected title not matched");
	}
	
	@Test(priority=2)
	public void verifyAdminTest() throws IOException {
		dashbrdpg.chkadmin();
	}
	
	@Test(priority=2)
	public void veriyPim() throws IOException {
		dashbrdpg.chkpim();		
	}
	
	@Test(priority=3)
	public void verifyleave() {
		dashbrdpg.chkleave();
	}
	
	
	
@AfterMethod
public void teardown() {
	driver.quit();
}
}
