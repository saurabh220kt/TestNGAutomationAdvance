package Opak;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Text Execution Started: "+result.getName());	
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution Ended");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Successfull for Test: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		//Take a ss
		//Updating test failure status into the reports
		//Update in logs
		
		System.out.println("Test Execution Failed for Test: "+result.getName());
		
	}
	
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test Execution Skipped for Test: "+result.getName());
		}
	

}
