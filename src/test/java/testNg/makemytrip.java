package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class makemytrip {

	@Test()
	public void bookTicket() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();;
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[text()='Bangkok, Thailand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Nov 16 2022']")).click();
		driver.findElement(By.xpath("//label[@for='return']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Thu Nov 16 2022']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
