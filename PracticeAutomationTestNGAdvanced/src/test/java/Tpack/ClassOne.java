package Tpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {

	// How to run all the classes at one go - By using testng.xml
	// BeforeTest and AfterTest can be place any of the classes
//	@BeforeTest
//	public void testm() {
//		System.out.println("This will executed before every test module in the testng.xml file");
//
//	}

	
	@Test
	public void testOneA(String url) throws InterruptedException {
		System.out.println("testOneA Test of ClassOne got executed");
	
		
	}

	@Test
	public void testOneB(String url) throws InterruptedException {
		System.out.println("testOneB Test of ClassOne got executed");
		
		
	}
	
	@Test
	public void testOneC(String url) throws InterruptedException {
		System.out.println("testOneC Test of ClassOne got executed");
		
	}
	
	
	@Test
	public void testOneD(String url1) throws InterruptedException {
		System.out.println("testOneD Test of ClassOne got executed");
		
	} 

}
