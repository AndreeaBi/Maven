package curs10;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 1)
	public void first() {
		System.out.println("first");
	}
	@Test(priority = 2)
	public void second() {
		System.out.println("second");
	}
	@Test(priority = 3)
	public void third() {
		System.out.println("third");
	}
	@Test(priority = 4)
	public void fourth() {
		System.out.println("fourth");
	}
	
	@Test //metodele care nu au prioritate ca parametru sunt rulate primele, in ordine alfabetic.
	//adica in cazul de fata, prima va fi rulata "ABC", apoi first, second etc.
	public void abc() {
		System.out.println("ABC");
	}

}
