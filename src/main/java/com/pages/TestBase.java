package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver=null;
	public Properties prop;
	public boolean flag=false;
	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kishan das\\Desktop\\TestNG\\Final_Cucumber_BDD_POM\\resources\\utilities.properties");
		prop.load(fis);
	}
	
	public void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
}
