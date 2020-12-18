package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown2 {

	public void SelectDropDown2() throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
	WebElement SelectDropDown =	driver.findElement(By.xpath("//select[@name='country']"));
	
	Select sel = new Select(SelectDropDown);
	
	
	List<WebElement> li = sel.getOptions();
	
	
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("rohan");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jain");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8976252842");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("h-602 Maheshwari Nagar, MIDC, Andheri-East");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("mumbai");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("Maharashtra");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohanjains@gmail.com");
	
	System.out.println(li.size());
	
	for(int i = 0 ; i<li.size() ; i++)
	{
		li.get(i).click();
		System.out.println(li.get(i).getText());
		if(li.get(i).getText().equals("INDIA")) {
//			System.out.println("");
			break;
		}
	}
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rohanjains@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret123");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("secret123");
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	


	}

}
