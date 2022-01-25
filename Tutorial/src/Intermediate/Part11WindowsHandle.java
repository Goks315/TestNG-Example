package Intermediate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part11WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//1.Swith to Child Window
		String oldWindow = driver.getWindowHandle();
		
		WebElement Firstbutton = driver.findElement(By.id("home"));
		Firstbutton.click();
		
		Set<String> Handles = driver.getWindowHandles();
		for (String newwindow : Handles) {
			driver.switchTo().window(newwindow);
		}
		
		WebElement editButton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editButton.click();
		driver.close();
		
		//2.Count the Number of Windows
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultiple.click();
		
		int numberofWindows = driver.getWindowHandles().size();
		System.out.println("Number of windoes opened: "+numberofWindows);
		
        //3.Close Other Child Windows
		WebElement closebutton = driver.findElement(By.id("color"));
		closebutton.click();
		
		Set<String> newWindowHandles = driver.getWindowHandles();
		for (String allwindows : newWindowHandles) {
			if(!allwindows.equals(oldWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
			
		}
driver.quit();
	}

}
