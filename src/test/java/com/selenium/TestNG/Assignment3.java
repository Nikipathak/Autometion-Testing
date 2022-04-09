package com.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment3 {
	WebDriver w;
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
	  w=new ChromeDriver();
 
  }

  
  

  @Test (priority=0,description = "Test Case to verify login functionality with 'admin' user" ,groups="Login")
  public void beforeTestTest() {
	  w.get("https://www.policyx.com/");
      
		
		
      
      WebElement pageLabel=w.findElement(By.xpath( "//*[@id=\"page1\"]/section[1]/div/div/div[2]/h1"));
	   String pageLabelText=pageLabel.getText();
	  
    
	  // String pageLabelText=pageLabel.getText();
	   Assert.assertTrue(pageLabelText.contains("Login"),"page Label doesn't contain login");
    
	   
	   
    String pageTitle=w.getTitle();
	  
	  
	  
  }
  @AfterTest
  public void afterTest()
  {
	  
  }
  


 

	  
	  
  
}
