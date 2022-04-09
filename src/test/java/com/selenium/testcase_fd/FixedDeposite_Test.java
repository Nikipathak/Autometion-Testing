package com.selenium.testcase_fd;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class FixedDeposite_Test<FixedDepositeFixedObject>
{
	

	
	public class FixedDeposit_Test {
		
		FixedDepositPageObject fd;
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  fd=new FixedDepositPageObject();
		  
		  fd.openBrowser("chrome");
		  
		  fd.callPageFactoryElements_FD();
	  }
	  
	  @Test(priority = 0,description = "Test case to verify Fixed Deposit module for 1 lakhs")
	  public void fixedDeposit_1lakh() throws Exception {
		  
		  fd.openApplication();
		  
		  fd.handleTextBox(fd.principleTextBox, "100000");
		  
		  fd.handleTextBox(fd.interestTextBox, "6");
		  
		  fd.handleTextBox(fd.tenureTextBox, "3");
		  
		  fd.handleDropDownList(fd.tenurePeriodDropDown, "year(s)");
		  
		  fd.handleDropDownList(fd.frequencyDropDown, "Simple Interest");
		  
		  fd.handleClickEvent(fd.calculateBtn);
		  
		  fd.waitSec(2);
		  
		  Assert.assertEquals(fd.returnElementText(fd.outputValue), "118000.00");
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  fd.closeBrowser();
	  }

	}
}

