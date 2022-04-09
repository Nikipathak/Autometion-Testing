package com.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BrowserCode {

  
	  @Test(priority = 0,description = "Test Case to verify application on chrome browser")
	  public void chrome() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
		  ChromeDriver w = new ChromeDriver();
		  w.get("https://blazedemo.com/");	  
		  Thread.sleep(1000);  
		  
	  }
	  
	  @Test(priority = 1,description = "Test Case to verify application on firefox browser")
	  public void firefox() throws Exception {
		  
		  System.setProperty("webdriver.gecko.driver", ".\\BrowserDriver\\geckodriver.exe");	  
		  FirefoxDriver w = new FirefoxDriver();
		  w.get("https://blazedemo.com/");	  
		  Thread.sleep(1000);
		  
		  
	  }
	  
//	  @Test(priority = 2,description = "Test Case to verify application on edge browser")
//	  public void edge() throws Exception {
//		  
//		  System.setProperty("webdriver.edge.driver", ".\\Browser_Driver\\msedgedriver.exe");	  
//		  EdgeDriver w = new EdgeDriver();
//		  w.get("https://blazedemo.com/");	  
//		  Thread.sleep(1000);
//		  
	  }
	  
	