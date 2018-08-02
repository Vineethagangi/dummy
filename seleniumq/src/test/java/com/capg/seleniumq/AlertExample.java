package com.capg.seleniumq;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AlertExample {
	static Logger logger = Logger.getLogger(AlertExample.class.getName());
	WebDriver driver,driver2,driver3;
	//creating a reference variable for the interface
	@Test
	public void ExampleForAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Srinivasfolder\\selenium\\chromedriver.exe");//giving the path for chrome driver
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:8081/selenium/pizza.html");
		WebElement element=driver.findElement(By.id("sel"));
		Select se=new Select(element);
		se.selectByVisibleText("Tomato");
		se.selectByVisibleText("Panner");
		List<WebElement> allSelectedOptions=se.getAllSelectedOptions();
		for(WebElement webElement:allSelectedOptions)
		{
			logger.info(""+webElement.getText());
		}
		//driver2=new ChromeDriver();
		//driver3=new ChromeDriver();
		//creating object for driver class
		//driver.manage().window().maximize();//to maximise chrome window
		//driver.get("http://localhost:8081/selenium/Alerts.html");
		//driver2.manage().window().maximize();
		//driver3.manage().window().maximize();
		//driver2.get("http://www.amazon.in");
		//driver3.get("http://www.flipkart.in");
		 Thread.sleep(2000);//stopping window to sleep for sometime
		//driver.findElement(By.xpath("//button[@onclick="+"'alertFunction()']")).click();//calling function from html page
		//driver2.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		// driver2.findElement(By.className("nav-input")).click();
		// driver.findElement(By.name("q")).sendKeys("mobile");
		// driver.findElement(By.name("btnK")).click();
		// driver3.findElement(By.className("LM6RPg")).sendKeys("mobile");
		// driver3.findElement(By.className("vh79eN")).click();
		//Alert alert=driver.switchTo().alert();
		//logger.info(alert.getText());//getting text and placing it in search box 
		//alert.accept();//directly clicks ok in the opened window
	logger.info("done");
	driver.close();
	}
	}


