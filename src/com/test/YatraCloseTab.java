package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class YatraCloseTab {

	
	@Test
	public void main() throws InterruptedException {
		// TODO Auto-generated method stub
//		Driver driver = new WebDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Talk To Us']"));
		
		element2.click();
		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("before 2000 ms");
		Thread.sleep(10000);
		System.out.println("after 2000ms");
		
		
		driver.switchTo().frame("iframeChatBot");  //inside in to the frame
		
//		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		driver.findElement(By.xpath("//button[text()='e-Tickets']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Start a new chat']")).click();
//		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.switchTo().defaultContent(); // coming out from frame
		
		
		driver.findElement(By.xpath("//div[text()='X']")).click();
//		driver.findElement(By.xpath("//div[@class='close tablecell']"));
		
		
		//div[text()='X']
//		driver.findElement(By.id("chatbot_close_button")).click();
	}

}
