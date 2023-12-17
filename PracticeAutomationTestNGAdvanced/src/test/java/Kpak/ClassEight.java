package Kpak;

import org.testng.annotations.Test;

public class ClassEight {
	
	@Test
	public void flipkart() {
		System.out.println("flipkart");
	}

	@Test(timeOut=5000)
	public void amazon() throws InterruptedException {
		System.out.println("Amazon");
		Thread.sleep(4000);
	}
	@Test
	public void macys() {
		System.out.println("macys");
	}
	
	@Test
	public void walmart() {
		System.out.println("walmart");
	}
}
