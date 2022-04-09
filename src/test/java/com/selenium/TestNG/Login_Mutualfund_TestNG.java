package com.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_Mutualfund_TestNG {
 
	
	WebDriver w;
  @BeforeTest
  public void precondition() 
  {
	  System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
	  w=new ChromeDriver();
 
  }
 
  @Test(priority=0,description = "Test Case to verify login functionality with 'admin' user" ,groups="LoginModule",invocationCount=1)
  public void loginAdmin()throws Exception
  
  {
	  w.get("https://demo.testfire.net/login.jsp");
		
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		
		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		
		w.findElement(By.linkText("PERSONAL")).click();
		w.findElement(By.linkText("Deposit Products")).click();
		w.findElement(By.linkText("contact Altoro Mutual")).click();
		
		Thread.sleep(3000);
		
		w.findElement(By.linkText("Sign Off")).click();
		
		
  }
  @Test(priority=1,description = "Test Case to verify login functionality with 'tuser' user",groups="LoginModule")

public void Testuser()throws Exception
  
  {
	  w.get("https://demo.testfire.net/login.jsp");
		
		w.findElement(By.id("uid")).sendKeys("tuser");
		w.findElement(By.id("passw")).sendKeys("tuser");
		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();	
		w.findElement(By.linkText("PERSONAL")).click();
		w.findElement(By.linkText("Deposit Products")).click();
		w.findElement(By.linkText("contact Altoro Mutual")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Sign Off")).click();
		
		
		
  }
  
  @Test(priority=2,description = "Test Case to verify login functionality with 'jsmith' user",groups="loginModule")

  public void jsmith()throws Exception
    
    {
  	  w.get("https://demo.testfire.net/login.jsp");
  		
  		w.findElement(By.id("uid")).sendKeys("jsmith");
  		w.findElement(By.id("passw")).sendKeys("Demo1234");
  		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();	
  		w.findElement(By.linkText("PERSONAL")).click();
  		w.findElement(By.linkText("Deposit Products")).click();
  		w.findElement(By.linkText("contact Altoro Mutual")).click();
  		Thread.sleep(3000);
  		w.findElement(By.linkText("Sign Off")).click();
  		
  		
  		
    }
  
  @Test(priority=3,description = "Test Case to verify login functionality with 'invalid' user" ,enabled=false)

  public void invalid()throws Exception
    
    {
  	  w.get("https://demo.testfire.net/login.jsp");
  		
  		w.findElement(By.id("uid")).sendKeys("test");
  		w.findElement(By.id("passw")).sendKeys("Test1234");
  		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();	
  		w.findElement(By.linkText("PERSONAL")).click();
  		w.findElement(By.linkText("Deposit Products")).click();
  		w.findElement(By.linkText("contact Altoro Mutual")).click();
  		Thread.sleep(3000);
  		w.findElement(By.linkText("Sign Off")).click();
  		
  		
  		
    }
  @AfterTest 
  public void postcondition() {
	  w.close(); 
  }

}
