package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Ex8Parameter {
	@Test
	@Parameters("name")
	public void printName(String name) {
		System.out.println("The Name is : "+name);
	}

}
