package Practicse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {

	
		public static void main(String[] args) throws InterruptedException 
		{
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
		

	  
	  
	  
	  
		}
		
	
	}


