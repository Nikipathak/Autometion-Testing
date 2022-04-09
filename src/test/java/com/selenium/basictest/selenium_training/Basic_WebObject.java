package com.selenium.basictest.selenium_training;
import java.util.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import java.util.*;
public class Basic_WebObject {
	 WebDriver w;
	private List<WebElement> dataDropDown;
  @BeforeTest
  public void Precondition() 
  {
	  System.setProperty("webdriver.chrome.driver",".\\BrowserDriver\\chromedriver.exe");
		 w=new ChromeDriver();
		
	
	}

  
  
  @Test(priority=0,description="test case to handle textbox")
  public void handleTextBox()
  {
	 
	w.get("http://demo.automationtesting.in/Register.html");
		WebElement firstName=w.findElement(By.cssSelector("input[ng-model='FirstName']"));
		  
		
		firstName.clear();
		firstName.sendKeys("steve");
		
		w.findElement(By.cssSelector("input[ng-model='LastName']")).clear();
		w.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("jones");
		
	  
  }
  
  
  @Test(priority=1,description="test case to handle textbox area")

  public void handleTextBoxArea()
  {
	 
		
		w.findElement(By.cssSelector("textarea[ng-model='Adress")).clear();
		w.findElement(By.cssSelector("textarea[ng-model='Adress")).sendKeys("sample test area");
		
	  
  }
  
  
  
  
  @Test(priority=2,description="test case to handle radio button")

  public void handleRadioButton()
  {
	 
		
		w.findElement(By.cssSelector("input[value='feMale']")).click();
		}
  
  @Test(priority=3,description="test case to handle checkbox")

  public void handleCheckBox()
  {
	 
		
		w.findElement(By.cssSelector("input[value='Cricket']")).click();
		}
  
  
  @Test(priority=4,description="test case to handle dropdownlist")
  public void handleDropDownList()
  {
	 
		//WebElement Skills=w.findElement(By.id("Skills"));
		//Select sel=new Select(Skills);
     // sel.selectByVisibleText("Java");
	  
	  
	  WebElement Skills=w.findElement(By.id("Skills"));
	  Select sel=new Select(Skills);
	  
	  List<WebElement> dataDropDown =sel.getOptions();
	  int numberOfValue=dataDropDown.size();
	   System.out.println("\n value from skills dropdown:\n");
	   
	   
	  //using for loop 
	  /*for(int i=0;i<numberOfValue;i++)
	   * {
	   * System.out.println(DataDropDown.get(i).ghetText());
	   * }*/
  
	  
	  //using  for each loop
	  /* for (WebElement data:data.DropDown )
	   * {
	   * System.out.println(data.getText());
	   
	 } */
  
  
  //Using Iterator
	   
	   java.util.Iterator<WebElement> it=dataDropDown.iterator();
  while(it.hasNext())
{
System.out.println(it.next().getText());
}

} 
  
  
  @Test(priority=4,description="test case to handlelist box ")
  public void handleListBox() throws Exception
  {
	  List<WebElement> li=w.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
	  int li_size=li.size();
	  for(int i=1;i<li_size;i++)
	  {
		  WebElement  listBox_Value=w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
	         System.out.println(listBox_Value);
	  }
	  
	  
  Thread.sleep(2000);
  
  
  }
  @AfterTest
  public void afterTest()
  {
	  
	
  }

}
