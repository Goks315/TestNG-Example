package Intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part15Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> listofElements = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = listofElements.size();
		System.out.println(size);
		
		Actions actions = new Actions(driver);
		
//		actions.keyDown(Keys.CONTROL)
//		.click(listofElements.get(0))
//		.click(listofElements.get(1))
//		.click(listofElements.get(2))
//		.click(listofElements.get(3))
//		.build().perform();
		
		actions.clickAndHold(listofElements.get(0))
		.clickAndHold(listofElements.get(1))
		.clickAndHold(listofElements.get(2))
		.clickAndHold(listofElements.get(3))
		.clickAndHold(listofElements.get(4))
		.build().perform();
	}

}
