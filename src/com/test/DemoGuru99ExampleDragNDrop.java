package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoGuru99ExampleDragNDrop {

	
	@Test
	public void DemoGuru99ExampleDragNDrop() {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //Run Time polymorphism
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize(); //Maximize Window
		
		System.out.println(driver.getTitle());
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target = driver.findElement(By.id("loan"));
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driver.findElement(By.id("amt7"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target4 = driver.findElement(By.id("bank"));
		
//		WebElement src2 = driver.findElement(By.xpath("//a[text()=' OWNER'S EQUITY ']"));
//		WebElement target2 = driver.findElement(By.id("amt8"));
		
//		WebElement src3 = driver.findElement(By.xpath("//a[text()=' OWNER'S EQUITY ']"));
//		WebElement target3 = driver.findElement(By.id("amt8"));
		
		
		Actions act = new Actions(driver);
		
//		act.clickAndHold(src)
//		.pause(Duration.ofSeconds(2))
//		.moveToElement(target)
//		.pause(Duration.ofSeconds(2))
//		.release().build().perform();
		
		act.dragAndDrop(src, target).build().perform();
		act.dragAndDrop(src2, target2).build().perform();
		act.dragAndDrop(src3, target3).build().perform();
		act.dragAndDrop(src4, target4).build().perform();
		

	}

}
