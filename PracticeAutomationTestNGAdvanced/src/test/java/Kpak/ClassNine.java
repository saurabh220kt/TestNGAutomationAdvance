package Kpak;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassNine {
	
	@Test(dataProvider="getData")
	public void loginTest(String username, String password) {
		System.out.println("User got successfully logged in using username: "+username+" and password: "+password);	
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "arun";
		data[0][1] = "password";
		
		data[1][0] = "baba";
		data[1][1] = "babaji";
		
		data[2][0] = "fuck";
		data[2][1] = "fuck@12";
		
		return data;
		
	}

}
