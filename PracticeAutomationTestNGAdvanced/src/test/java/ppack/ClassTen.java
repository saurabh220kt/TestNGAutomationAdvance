package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTen {

	@Test
	public void testTen() {
		
		//TestExecution has started here
		int a=1;
		int b=5,c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(a==1) {
	
			Assert.assertTrue(b<c);
			
		}else if(a==2) {
		
		Assert.assertTrue(b>c);
		
		}else if(a==3) {
		
		throw new SkipException("Test Skipped");
	}
		driver.close();
		
		//Text Execution Finished here
		
}
	@Test
	public void testTenB() {
		
		//TestExecution has started here
		int a=2;
		int b=5,c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(a==1) {
	
			Assert.assertTrue(b<c);
			
		}else if(a==2) {
		
		Assert.assertTrue(b>c);
		
		}else if(a==3) {
		
		throw new SkipException("Test Skipped");
	}
		driver.close();
		
		//Text Execution Finished here
		
}
	@Test
	public void testTenC() {
		
		//TestExecution has started here
		int a=3;
		int b=5,c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(a==1) {
	
			Assert.assertTrue(b<c);
			
		}else if(a==2) {
		
		Assert.assertTrue(b>c);
		
		}else if(a==3) {
		
		throw new SkipException("Test Skipped");
	}
		driver.close();
		
		//Text Execution Finished here
		
}
}
