package com.eCom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	 public TestBaseClass() throws IOException{
		prop=new Properties();
		FileInputStream ip=null;
		try {
			ip= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Mythili\\eComm\\src\\main\\java\\com\\eCom\\config\\config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		prop.load(ip);		
	}
	
	public void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Mythili\\eComm\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}


}
