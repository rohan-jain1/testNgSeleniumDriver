package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {

	
	@Test
	public void SelectDropDown() throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
	WebElement SelectDropDown =	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(SelectDropDown);
	
	
	List<WebElement> li = sel.getOptions();
	
	System.out.println(li.size());
	
	for(int i = 0 ; i<li.size() ; i++)
	{
		
		li.get(i).click();
		System.out.println(li.get(i).getText());
	}
	
	
	sel.selectByIndex(8);
	
	Thread.sleep(3000);
	
	sel.selectByValue("search-alias=beauty");
	
	sel.selectByVisibleText("Furniture");
		

	}

}
