package Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {



	private static final String TAB = null;
	private static final String ENTER = null;
	private static CharSequence SPACE;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gurumavin.in/educator-account");
		Thread.sleep(3000);

		driver.findElement(By.id("email-label")).sendKeys("educator@educator.com",Keys.TAB,"educatorpassword",Keys.SPACE,Keys.TAB,Keys.ENTER);
	

	
	}

}
