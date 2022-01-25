package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement Java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		Java.click();
		
		WebElement Selenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
        Selenium.click();
        
        boolean Seleniumselected = Selenium.isSelected();
        System.out.println(Seleniumselected);
        
		WebElement FirstElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if(FirstElement.isSelected()) {
			FirstElement.click();
			System.out.println("FirstElement Clicked");
		}
		WebElement SecondElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(SecondElement.isSelected()) {
			SecondElement.click();
			System.out.println("SecondElement Clicked");

		
	}
	}
}
