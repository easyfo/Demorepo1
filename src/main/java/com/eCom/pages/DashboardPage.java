package com.eCom.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCom.base.TestBaseClass;

public class DashboardPage extends TestBaseClass{
	PIMpage pim;
	public DashboardPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement admin;
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addemp;
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement leave;
	
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	
	
	public String verifyhomepage() {
		// TODO Auto-generated method stub
		return  driver.getTitle();
	}
	
	public AdminPage chkadmin() throws IOException {
		admin.click();
		return new AdminPage();
	}
	
	public void chkpim() throws IOException {
		{
//			PIM.click();
			Actions action=new Actions(driver);
			action.moveToElement(PIM).build().perform();
			addemp.click();
			
			
		}
		
}
	
	public LeavePg chkleave() {
		leave.click();
		return new LeavePg();
	}
	
	public void addempdetails(String fn,String mn, String ln) {
		firstName.sendKeys(fn);
		middleName.sendKeys(mn);
		lastName.sendKeys(ln);
		btnSave.click();
	}
	
	
}
