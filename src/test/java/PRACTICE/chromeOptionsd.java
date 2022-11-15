package PRACTICE;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptionsd {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		//WebDriver drivrr=new ChromeDriver(option);
		//option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//option.setPageLoadStrategy(PageLoadStrategy.NONE);
		option.setExperimentalOption("use AutomationExtension", false);
		option.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		WebDriver driver=new ChromeDriver(option);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com");
	}

}
