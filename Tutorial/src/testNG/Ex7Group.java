package testNG;

import org.testng.annotations.Test;

public class Ex7Group {
	@Test(groups= {"Apple"})
	public void apple1 () {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Apple"})
	public void apple2 () {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo1 () {
		System.out.println("Vivo Testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo2 () {
		System.out.println("Vivo Testing");
	}
	@Test(groups= {"Moto"})
	public void moto1 () {
		System.out.println("Moto Testing");
	}
	@Test(groups= {"Moto"})
	public void moto2 () {
		System.out.println("Moto Testing");
	}
	@Test(groups= {"Lenovo"})
	public void lenovo1 () {
		System.out.println("Lenovo Testing");
	}
	@Test(groups= {"Lenovo"})

	public void lenovo2() {
		System.out.println("Lenovo Testing");
	}
}
