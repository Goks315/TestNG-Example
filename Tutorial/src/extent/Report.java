package extent;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	
	WebDriver driver ;
	ExtentReports extentReport ;
	ExtentSparkReporter htmlReporter ;
	ExtentTest testCase ;
	
	
	@Test
	public void openGoogle() throws IOException {
		testCase =extentReport.createTest("Verify Google Title");
		driver.get("https://www.google.co.in/");	
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");	
		}	
	}
	
	@Test
	public void openBing() {
		testCase =extentReport.createTest("Verify Bing Title");
			driver.get("https://www.bing.com");
			String title = driver.getTitle();
			if(title.equals("bing")) {
				System.out.println("Passed");
			}else {
				System.out.println("Failed");	
			}	
	}
	
	@Test
	public void openYahoo() throws IOException {
		testCase =extentReport.createTest("Verify Yahoo Title");
			driver.get("https://www.yahoo.com");
			String title = driver.getTitle();
			if(title.equals("yahoo")) {
				System.out.println("Passed");
			}else {
				System.out.println("Failed");	
			}	
	}
	
	@BeforeSuite
	public void openBrowser() throws IOException{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		extentReport = new ExtentReports();
		 htmlReporter = new ExtentSparkReporter("ExtentReporter.html");
	    extentReport.attachReporter(htmlReporter);
		 driver = new ChromeDriver();
	}
	


	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReport.flush();
       
	}
}
