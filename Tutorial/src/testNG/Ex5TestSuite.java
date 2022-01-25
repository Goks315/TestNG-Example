package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex5TestSuite {
	long startTime;
	long endTime;
	WebDriver driver ;
	
	@BeforeSuite
	public void openBrowser() {
		startTime =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in/");	
	}
	
	@Test
	public void openBing() {
			driver.get("https://www.bing.com");
	}
	
	@Test
	public void openYahoo() {
			driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
        endTime =System.currentTimeMillis();
		long totaltTime =endTime - startTime;
		System.out.println("Time takes : "+totaltTime);
	}

}
