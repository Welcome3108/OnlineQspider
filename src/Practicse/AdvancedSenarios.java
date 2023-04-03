package Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSenarios {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_0e']")).click();
	

	}

}
