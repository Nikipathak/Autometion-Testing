package com.selenium.TestNG;

import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssert_Login {
	WebDriver w;
  @Test
  public void LoginAdmin() throws  Exception
  {
	  
		w.get("https://demo.testfire.net/login.jsp");
       
		WebElement signInButton=w.findElement(By.id("LoginLink"));
       Assert.assertTrue(signInButton.isDisplayed(),"sign in Link not display");
      
      String pageTitle=w.getTitle();
      String pageURL=w.getCurrentUrl();
      
      Assert.assertEquals(pageTitle,"Altoro Mutual");
      Assert.assertTrue(pageURL.contains("login.jsp"),"URL is different");
      
		
      
      WebElement pageLabel=w.findElement(By.xpath( "/html/body/table/tbody/tr[2]/td[2]/div/h1 "));
	   String pageLabelText=pageLabel.getText();
	   Assert.assertTrue(pageLabelText.contains("Login"),"page Label doesn't contain login");
	   
	   w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
 		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();	

	
      

	  
  }
  
  @Test(priority=1,description = "Test Case to verify login functionality with 'admin' user" ,groups="LoginModule",invocationCount=3)
  public void loginAdmin()throws Exception
  
  {
		Thread.sleep(3000);
	      String pageURL=w.getCurrentUrl();

	      Assert.assertTrue(pageURL.contains("main.jsp"),"URL is different");
	      
			
	      
	      WebElement pageLabel=w.findElement(By.xpath( "/html/body/table[2]/tbody/tr/td[2]/div/h1 "));
		   String pageLabelText=pageLabel.getText();
	      Assert.assertEquals(pageLabelText.contains("Admin"), "page label does not contaon admin");
			w.findElement(By.linkText("Sign Off")).click();

			//Reporter.log("Admin test case executed!!!",true);
  }
  
  @BeforeTest
  public void beforeTest() 
  
  {
	  System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
	  w=new ChromeDriver();
 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
