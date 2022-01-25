package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex10Assert {

	String name ="Goks";
	@Test
	public void checkEqual() {
	Assert.assertEquals(name,"Gok");
	}
	
	
	
//		if (name.equals("Gok")){
//			System.out.println("Name is equal");
//		}else
//			System.out.println("Name is not equal");
//	}
}
