package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//1.Select using Index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		//2.Select using Value
		select.selectByValue("2");
		Thread.sleep(2000);
		
		//3.Select using Text
		select.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		//4.Get all value of options
		List<WebElement> listOfOptions = select.getOptions();
		int Size = listOfOptions.size();
		System.out.println("Number of Options: "+Size);
		Thread.sleep(2000);
		
		//5.Select using sendKeys
		dropdown1.sendKeys("Loadrunner");
		Thread.sleep(2000);
		
		//6.Multiselect the Options
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectBox = new Select(multiselect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);


		
	}

}
