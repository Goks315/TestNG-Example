package Intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part16AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
        Thread.sleep(3000);
        
		List<WebElement> optionList= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));

		for (WebElement optionElements : optionList) {
			if(optionElements.getText().equals("Rest API")) {
				optionElements.click();
			System.out.println("Selecting "+optionElements.getText());
			break;
			}
			else {
				System.out.println("Else Part");
			}

		}
	}

}
