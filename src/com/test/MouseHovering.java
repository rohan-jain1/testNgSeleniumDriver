package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering {


	@Test
	public void MouseHovering() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
		
		WebElement AccountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(AccountList).perform();
		
		String s = driver.findElement(By.xpath("//span[text()='Your Account']")).getText();
		
		
		System.out.println(s);
				
				
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();

	}

}
