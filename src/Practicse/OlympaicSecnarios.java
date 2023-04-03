package Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlympaicSecnarios {

	public static void main(String[] args) throws Throwable {
		
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key,Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=olympic+games+tokyo+2020&oq=olympics+games+toj&aqs=chrome.2.69i57j0i10i22i30i625j0i10i22i30j0i390l4.13457j1j7&sourceid=chrome&ie=UTF-8#cobssid=s&wptab=si:AEcPFx4nGmQMsFo6Qd43BPm-8lY--pomZBWsdZPZyWGiI5BCFESu1PcSyW5aGNztSiakMwdLDtcUHE1rYf1Agvsmg0WHZiUakVlNVtdW8W5KseeyBnUyMB2py1FenI2nFPjEc_Gf63SHqW9Uy2vVAPCF1VkU_Co7a0xvPfyg5idT-A5uypiZ8E8%3D");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	    WebElement country = driver.findElement(By.xpath("//span[@class='tsp-el tsp-ml8 tsp-w']"));
	    country.click();
	    
	    
	    
	    
	    
		
	     
		

	}

}
