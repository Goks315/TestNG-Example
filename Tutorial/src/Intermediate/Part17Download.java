package Intermediate;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part17Download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downlink = driver.findElement(By.linkText("Download Text"));
		downlink.click();
		
		Thread.sleep(3000);
		
		File fileLocation = new File("‪C:\\Users\\Goks\\Downloads");
		
		File[] files = fileLocation.listFiles();
		
		for (File file : files) {
		
			if(file.getName().equals("file.txt"));
			System.out.println("File is Found");
			
		}
		
		}

	}
