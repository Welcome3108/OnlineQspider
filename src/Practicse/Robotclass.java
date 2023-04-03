package Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Robotclass {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			Thread.sleep(4000);
			js.executeScript("windows.scrollBy(0,800)");
			Thread.sleep(1000);
			
		}


	}

}
