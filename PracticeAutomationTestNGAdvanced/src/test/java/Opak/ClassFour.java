package Opak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassFour {

//	@BeforeSuite
//	public void method() {
//		System.out.println("Before all the classes in the suite");
//	}
	@Parameters({"URL"})
	@Test
	public void testThree(String url) throws InterruptedException {
		System.out.println("testThree Test of ClassFour got executed");
		
	}
}
