package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkart {

WebDriver driver =new ChromeDriver();
	@BeforeTest()
	public void sinup()
	{
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
	}
		@Test()
		public void clickOnpopup() throws InterruptedException
		{
	
			Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		@Test()
		public void ClickOnCart() throws InterruptedException
		{
			Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		WebElement element=driver.findElement(By.xpath("//div[text()='Missing Cart items?']"));
		String expected = element.getText();
		String actual="Missing Cart items?";
		if(expected.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
