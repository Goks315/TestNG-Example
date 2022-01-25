package testNG;

import org.testng.annotations.Test;

public class Ex3Skip {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	@Test(priority=5,enabled=false)
	public void turnMusicOn() {
		System.out.println("Music On");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
}
