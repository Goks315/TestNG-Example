package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1.Get XY Position
		WebElement getPosition = driver.findElement(By.id("position"));
		Point xypoint = getPosition.getLocation();
		int x = xypoint.getX();
		int y = xypoint.getY();
		System.out.println("X value is: "+x+" Y Value is: "+y);
		
		//2.Find the Color
		WebElement getColor = driver.findElement(By.id("color"));
		String color = getColor.getCssValue("background-color");
		System.out.println("Button Color is: "+color);
		
		//3.Button Height & Width
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("Button Height is: "+height+"Button Width is: "+width);
		
		//4. Go to Home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();


	}

}
