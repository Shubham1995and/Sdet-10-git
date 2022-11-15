package PRACTICE;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledropDown {
	
	public static void main(String[]arg)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.xpath("//option[@value='search-alias=amazon-devices']")).click();
		
		
	}

}
