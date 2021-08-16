package com.eCom.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCom.base.TestBaseClass;

public class AdminPage extends TestBaseClass{

	public AdminPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="ohrmList_chkSelectAll")
	WebElement chkbox;
	
	@FindBy(xpath="//input[@name='chkSelectRow[]']")
	List<WebElement> chkboxs;
	
	public void verifychkbox() {
		chkbox.click();
		
	}
	
	public void verifyone() {
		
		for(WebElement check:chkboxs)
			
			
		{
				String number=check.getAttribute("id");
				if(number.equals("ohrmList_chkSelectRecord_37"))
				{
					check.click();
			}
			
			}
		}
	}
	
	


