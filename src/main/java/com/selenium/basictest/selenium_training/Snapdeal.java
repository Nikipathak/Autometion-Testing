package com.selenium.basictest.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal
{
	public static void main(String[] args) throws InterruptedException
	
{
		System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("http://www.google.com");
		w.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		w.findElement(By.xpath("/html/body"));

		
		
		
	}

}
