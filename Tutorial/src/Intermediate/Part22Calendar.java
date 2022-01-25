package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part22Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calend = driver.findElement(By.id("datepicker"));
		calend.click();
//		calend.sendKeys("01/10/2022"+Keys.ENTER);
		
		WebElement nextbutton =driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
		nextbutton.click();
		
		WebElement nextbutton1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a"));//a[contains(text(),'10')]
		nextbutton1.click();
	}

}
