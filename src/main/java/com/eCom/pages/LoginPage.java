package com.eCom.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCom.base.TestBaseClass;

public class LoginPage extends TestBaseClass{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	

	//Create object Repsitory
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btn;
	
	@FindBy(xpath ="//div[@id='divLogo']")
	WebElement logo;
	

 public DashboardPage login(String un,String pw) throws IOException {
	 username.sendKeys(un);
	 password.sendKeys(pw);
	 btn.click();
	 
	 return new DashboardPage();
 }
 
 
 
 

public boolean display() {
	// TODO Auto-generated method stub
	return logo.isDisplayed();
}
	

}
