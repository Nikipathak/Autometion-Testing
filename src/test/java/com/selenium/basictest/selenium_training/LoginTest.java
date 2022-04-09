package com.selenium.basictest.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://demo.testfire.net/login.jsp");
		
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		
		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		
		w.findElement(By.linkText("PERSONAL")).click();
		w.findElement(By.linkText("Deposit Products")).click();
		w.findElement(By.linkText("contact Altoro Mutual")).click();
		
		Thread.sleep(3000);
		
		w.findElement(By.linkText("sign off")).click();
		
		w.close();
		
		
		
	}

}
