package com.capg.ConferenceQ;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadOnlyTest {
	WebDriver driver;
	@Test
	public void readonly() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Srinivasfolder\\selenium\\chromedriver.exe");
	       driver=new ChromeDriver();
	   	   driver.manage().window().maximize();
	   	   driver.get("http://localhost:8085/ConferenceWeb/readonly.html");
	   	   Thread.sleep(2000);
	       
	   	  String txt = driver.findElement(By.name("name")).getAttribute("value");
	 
	   	  if(txt.equals("Capgemini")) {
	   		  System.out.println("good");
	   	  }
	   	  assertEquals("Capgemini", txt);
	}
}
