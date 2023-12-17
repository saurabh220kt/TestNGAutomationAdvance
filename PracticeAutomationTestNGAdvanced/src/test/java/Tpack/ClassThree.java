package Tpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassThree {

//	@AfterSuite
//	public void method() {
//		System.out.println("After all the classes in the suite");
//	}
//	
//	@AfterTest
//	public void testte() {
//		System.out.println("This will be executed after the test module");
	
	@Test
	public void testThree() {
		System.out.println("testThree Test of ClassThree got executed");
	}
}
