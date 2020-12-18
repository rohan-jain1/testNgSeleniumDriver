package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	@Test
	public void OpenBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
	//	driver.findElement(By.name("q")).sendKeys("Testing");
		
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
	//	driver.findElement(By.name("pass")).sendKeys("1234567");
		
	//	driver.findElement(By.name("login")).click();
		
	////	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");
		
	//	driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		
		String ToodayDeal = driver.findElement(By.xpath("(//a[contains(text(),'Today')])")).getText();
		
		System.out.println(ToodayDeal);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Today')])")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back(); //click on back button on browser
		
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
