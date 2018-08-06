package com.capg.ConferenceQ;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class App 
{
	
	WebDriver driver;
	//creating a reference variable for the interface
	@Test
	public void ExampleForAlert() throws InterruptedException {
    {
    	System.setProperty("webdriver.chrome.driver","D:\\Srinivasfolder\\selenium\\chromedriver.exe");
       driver=new ChromeDriver();
   	   driver.manage().window().maximize();
   	   driver.get("http://localhost:8085/ConferenceWeb/ConferenceRegistartion.html");
   	   Thread.sleep(2000);
       
   	   
   	 driver.findElement(By.id("txtFirstName")).sendKeys("Gangishetty");
   	 driver.findElement(By.id("txtLastName")).sendKeys("Vineetha");
   	 driver.findElement(By.id("txtEmail")).sendKeys("Vineethagangishetty@gmail.com");
	 driver.findElement(By.id("txtPhone")).sendKeys("9848223363");
	 
	 
	 
	 
		WebElement element=driver.findElement(By.name("size"));
		Select se=new Select(element);
		se.selectByValue("two");
		
	 	 driver.findElement(By.id("txtAddress1")).sendKeys("sri venkateshwara PG");
	 	 driver.findElement(By.id("txtAddress2")).sendKeys("Indranagar");
	 	 
	 	WebElement element2=driver.findElement(By.name("city"));
		Select se2=new Select(element2);
		se2.selectByValue("Chennai");
		
		
	 	WebElement element3=driver.findElement(By.name("state"));
		Select se3=new Select(element3);
		se3.selectByValue("Telangana");
		
	   	 driver.findElement(By.name("memberStatus")).click();
	   	 driver.findElement(By.linkText("Next")).click();	
	   	Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		   
   	 driver.findElement(By.id("txtCardholderName")).sendKeys("Gangishetty Vineetha");
   	
   	 driver.findElement(By.id("txtDebit")).sendKeys("123456");
	 driver.findElement(By.name("cvv")).sendKeys("1234567890");
	 driver.findElement(By.id("txtMonth")).sendKeys("08");
	 driver.findElement(By.id("txtYear")).sendKeys("2012");
	 
 	 driver.findElement(By.id("btnPayment")).click();

 	 
 	Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		
		
		
		
		
    }
	}
}