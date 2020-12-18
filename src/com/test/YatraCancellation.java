package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YatraCancellation {

	
	@Test
	public void main() throws InterruptedException {
		// TODO Auto-generated method stub
//		Driver driver = new WebDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
//
		Thread.sleep(5000);

//		driver.findElement(By.xpath("//div[text()='X']")).click();
		System.out.println("closeTableclsee");
		driver.switchTo().frame("notification-frame-b8a48c62");
		driver.findElement(By.xpath("//div[@class='close tablecell']")).click();
		
		
		
		
		//div[text()='X']
//		driver.findElement(By.id("chatbot_close_button")).click();
	}

}
