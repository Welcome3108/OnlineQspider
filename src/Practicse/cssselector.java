package Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	private static final String Sysyem = null;

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
         
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        /*WebElement data=driver.findElement(By.id("username"));
        Thread.sleep(3000);
        data.sendKeys("admin");
        data.clear();
		
//        driver.get("https://demo.actitime.com/login.do");
//        driver.manage().window().maximize();
        WebElement data1=driver.findElement(By.name("pwd"));
        Thread.sleep(3000);
        data1.sendKeys("manager");
        Thread.sleep(3000);
        data1.clear();
        
        //Dimension  is a Class
        Dimension dim=data1.getSize();
        System.out.println(dim.getHeight()+"------------"+dim.getWidth());
        
       //To get Location 
        Point loc=data.getLocation();
        System.out.println(loc.getX()+"---------------"+loc.getY());
        
        //To get dimnsion
        Rectangle rec = data.getRect();
        System.out.println(rec.getHeight()+"---------------"+rec.getWidth());
        System.out.println(rec.getX()+"------------"+rec.getY()); */
      
        //isDisplyed
      WebElement logo = driver.findElement(By.className("atLogoImg"));
      if(logo.isDisplayed())
      {
    	  System.out.println("logo is Displaying");
    	  
      }
      else
      {
    	  System.out.println("Logo is not Displaying");
      }
      
      //IsEnabled
      WebElement username = driver.findElement(By.id("username"));
      if(username.isEnabled())
      {
    	  username.sendKeys("admin");
      }
      else
      {
    	  System.out.println("The Elemnts is not present");
      }
      
      //To isSelected or Not
      WebElement check = driver.findElement(By.name("remember"));
    		  //check.click();
      if(check.isSelected())
      {
    	  System.out.println("Check");
      }
      else
      {
    	  System.out.println("Uncheck");
      }
      
      //To print tagname
      WebElement tag = driver.findElement(By.id("username"));
      System.out.println(tag.getTagName());
      
      
      
        
      
        
        
	}

}
