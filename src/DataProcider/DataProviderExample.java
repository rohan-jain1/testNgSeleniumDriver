package DataProcider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


	@DataProvider(name="EnterData")
	
	public Object[][] dataProvider() {
		
		
		return new Object[][] {{"afzalansari1187@gmail.com","Pass123"}, {"world","232423"}};
	}
	
	@Test(dataProvider="EnterData") 
	public void LoginData(String Uname , String Password){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHAN\\Desktop\\SeleniumTutorials\\SeleniumJars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(Password);
		
		driver.close();
	}
	

}
