package PRACTICE;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scfreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[2]"));
		File ele = element.getScreenshotAs(OutputType.FILE);
		File mfile=new File("./screenshot/screen4.png");
		FileUtils.copyFile(ele, mfile);

	}

}
