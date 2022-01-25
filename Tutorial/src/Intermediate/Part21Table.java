package Intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part21Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		//1.Count the Columns
		List<WebElement> Columns= driver.findElements(By.tagName("th"));
		int noOfColumn = Columns.size();
		System.out.println("Number of columns in the table is : "+noOfColumn);
		
		//2.Count the Rows
		List<WebElement> Rows= driver.findElements(By.tagName("tr"));
		int noOfRow = Columns.size();
		System.out.println("Number of rows in the table is : "+noOfRow);
		
		//3.Progress percentage
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()=\'Learn to interact with Elements\']//following::td[1]"));
		String Progress =getPercent.getText();
		System.out.println("Progress percentage in the table : "+Progress);
		
		//4.Store the table percentage 
		List<WebElement>allProgress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList = new ArrayList<Integer>();
		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%","");
			numberList.add(Integer.parseInt(individualValue));
		}
		System.out.println(numberList);
		//5.Find the min value
		int smallval =Collections.min(numberList);
		System.out.println(smallval);
		
		//6.Write the xpath
		String smallvalString = Integer.toString(smallval)+"%";
		String finalpath ="//td[normalize-space()="+"\""+smallvalString+"\""+"]"+"//following::td[1]";
		System.out.println(finalpath);
		
		//7.click the checkbox
		WebElement check = driver.findElement(By.xpath(finalpath));
		Thread.sleep(3000);
		check.click();
		
		
		
	}

}
