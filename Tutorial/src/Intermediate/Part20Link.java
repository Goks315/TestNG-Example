package Intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part20Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homelink=driver.findElement(By.linkText("Go to Home Page"));
		homelink.click();
		driver.navigate().back();
		
		//Find link html Without click
		WebElement wherelink=driver.findElement(By.partialLinkText("Find where"));
		String wheretogo = wherelink.getAttribute("href");
		System.out.println("Link is going to: "+wheretogo);
		
		//Broken or not
		WebElement brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		String title = driver.getTitle();
		
		if(title.contains("404"))
			System.out.println("Link is broken");
		else
			System.out.println("Link is not broken");
		
		driver.navigate().back();
		
		WebElement homelink1=driver.findElement(By.linkText("Go to Home Page"));
		homelink1.click();
		driver.navigate().back();
		
		//Count the links
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int count = totallinks.size();
		System.out.println("Total number of count is "+count);
		
			
	
		
		
	}

}
