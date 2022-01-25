package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
	WebElement SendBox = driver.findElement(By.id("email"));
	SendBox.sendKeys("test@gmail.com"+Keys.ENTER);
	WebElement AppendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
    AppendBox.sendKeys("Gowtham");
    WebElement GetBox = driver.findElement(By.name("username"));
    String val = GetBox.getAttribute("value");
	System.out.println(val);
	Thread.sleep(2000);
	WebElement ClearBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	ClearBox.clear();
	WebElement DisableBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	boolean dis = DisableBox.isEnabled();
	System.out.println(dis);
		

	}

}
