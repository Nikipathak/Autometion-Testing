package com.selenium.basictest.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	
w.get("http://www.testyou.in/Login.aspx");

	w.findElement(By.cssSelector("#ctl00_CPHContainer_txtUserLogin")).sendKeys("Selenium99");
	w.findElement(By.cssSelector("#ctl00_CPHContainer_txtPassword")).sendKeys("Selenium99");
   
	
	

	//w.findElement(By.cssSelector("input.button")).click();

	//w.findElement(By.cssSelector("input.button")).click();
	//Thread.sleep(3000);
	w.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_btnLoginn\"]")).click();


	w.findElement(By.xpath("//*[@id=\"ctl00_headerTopStudent_lnkbtnSignout\"]")).click();
	
	//w.findElement(By.linkText("Logout")).click();
	w.close();
	

}
}
