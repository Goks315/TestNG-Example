package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part19Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstImage.click();
		driver.navigate().back();
		
		
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		if(brokenImage.getAttribute("naturalWidth").equals(0)) {
			System.out.println("Image Broken");
		}
		else
			System.out.println("Image Not broken");
		
	}

}
