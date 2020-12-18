package com.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	
	
	
	@Test
	public static void AlertHandler() throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		Thread.sleep(3000);
		
		Alert alrt = driver.switchTo().alert();
		
		alrt.accept();
		
		String Message = driver.findElement(By.id("demo")).getText();
		
		System.out.println(Message);
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		Thread.sleep(3000);
		alrt.dismiss();
		
String MessageCancel = driver.findElement(By.id("demo")).getText();
		
		System.out.println(MessageCancel);


	}

}
//http://demo.guru99.com/test/delete_customer.php
//	https://www.testandquiz.com/selenium/testing.html