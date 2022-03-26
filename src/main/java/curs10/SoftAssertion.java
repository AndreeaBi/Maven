package curs10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test(priority = 1)
	public void softAssert() {
		System.out.println("Soft assertion --> incepe aici");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		softAssert.assertAll();
		
		
		System.out.println("Soft assertion --> se termina aici");
	}
	
	@Test(priority = 2)
	public void hardAssert() {
		System.out.println("Hard assertion --> incepe aici");
		assertTrue(false);
		
		System.out.println("Hard assertion --> se termina aici");
	}
	
	

}
