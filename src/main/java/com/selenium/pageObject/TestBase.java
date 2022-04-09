package com.selenium.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver w;

	String application_url = "https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html";

	public void openBrowser(String br) throws Exception {

		if (br.equalsIgnoreCase("chrome")) {

			//WebDriverManager.chromedriver().setup();
			w = new ChromeDriver();
			w.manage().window().maximize();
			w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			

		} else if (br.equalsIgnoreCase("firefox")) {

			//WebDriverManager.firefoxdriver().setup();
			w = new FirefoxDriver();
			w.manage().window().maximize();
			w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			

		} 

	}

	public void closeBrowser() {

		w.close();
	}

	public void openApplication() {
		w.get(application_url);
	}

	public void handleTextBox(WebElement we,String value) {
		
		we.clear();
		we.sendKeys(value);

	}

	public void handleDropDownList(WebElement we,String value) {
		
		Select sc=new Select(we);
		sc.selectByVisibleText(value);

	}

	public void handleClickEvent(WebElement we) {
		
		we.click();
		
	}
	
	public void waitSec(int sec) throws Exception {
		
		sec=sec*1000;
		
		Thread.sleep(sec);
	}
	
	public void handleAlert() {
		
		try {
		w.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e) {
			
		}
	}
	
	public void handleFrame(String id) {
		w.switchTo().frame(id);
	}
	
	
	public void explicitWait(By we) {
		WebDriverWait wt=new WebDriverWait(w, 60);
		wt.until(ExpectedConditions.visibilityOfElementLocated(we));

	}
	
	
}
