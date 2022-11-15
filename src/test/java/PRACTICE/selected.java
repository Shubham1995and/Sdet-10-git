package PRACTICE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		//element.click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//option[text()='Baby']")).click();
Select sc=new Select(element);
 List<WebElement> an = sc.getOptions();
System.out.println(an);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.flipkart.com/");
	}

}
