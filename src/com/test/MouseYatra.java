package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseYatra {
	
	@Test
	public void main() throws InterruptedException {
//		Driver driver = new WebDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Talk To Us']"));
		
		element2.click();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("iframeChatBot");  //inside in to the frame
		
		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); // coming out from frame
		
		driver.findElement(By.id("chatbot_close_button")).click();
	}
}
