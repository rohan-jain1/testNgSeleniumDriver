package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FillForm {

	
	@Test
	public void FillForm(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(3000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		
	//	driver.findElement(By.name("q")).sendKeys("Testing");
		
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
	//	driver.findElement(By.name("pass")).sendKeys("1234567");
		
	//	driver.findElement(By.name("login")).click();
		
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("rohan");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jain");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8976252842");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rohanjains@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("h-602 Maheshwari Nagar, MIDC, Andheri-East");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohanjains@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("secret123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		name="email"
//				name='password'
//				name='confirmPassword'
		
		
		
//		driver.findElement(By.)
		
//		driver.close();
		
		
		
		

	}

}
