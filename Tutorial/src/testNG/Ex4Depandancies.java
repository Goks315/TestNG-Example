package testNG;

import org.testng.annotations.Test;

public class Ex4Depandancies {

	@Test(enabled=false)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondarySchool() {
		System.out.println("Higher Secondary School");
	}
	@Test(dependsOnMethods="higherSecondarySchool")
	public void college() {
		System.out.println("College");
	}
	
}
