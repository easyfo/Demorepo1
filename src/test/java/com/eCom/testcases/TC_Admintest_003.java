package com.eCom.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eCom.base.TestBaseClass;
import com.eCom.pages.AdminPage;
import com.eCom.pages.DashboardPage;
import com.eCom.pages.LoginPage;


public class TC_Admintest_003 extends TestBaseClass{
	LoginPage lgnp;
	DashboardPage dashbrdpg;
	AdminPage adminpg;
	public TC_Admintest_003() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		lgnp=new LoginPage();
		 adminpg= new AdminPage();
		 dashbrdpg=lgnp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifychkbox() throws InterruptedException {
		try {
			dashbrdpg.chkadmin();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		adminpg.verifyone();
		Thread.sleep(4000);
			
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
	
}
