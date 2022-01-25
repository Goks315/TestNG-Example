package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//1.Alert 
		WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button\r\n"));
		AlertBox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//2.Confirm Alert 
		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBox.click();
		Alert Confirmalert = driver.switchTo().alert();
		Thread.sleep(2000);
		Confirmalert.dismiss();
		
		//3.Prompt Alert
		WebElement PromptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		PromptBox.click();
		Alert Promptalert = driver.switchTo().alert();
		Promptalert.sendKeys("Duck");
		Thread.sleep(2000);
		Promptalert.accept();
		


	}

}
