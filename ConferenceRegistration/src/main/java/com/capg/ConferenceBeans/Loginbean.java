package com.capg.ConferenceBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginbean {
	
	WebDriver driver;
	
	@FindBy(how=How.ID,id="txtuname")
	private WebElement Username;

	@FindBy(how=How.ID,id="txtpwd")
	private WebElement Password;

	@FindBy(how=How.NAME,name="login")
	private WebElement Submit;
	
	@FindBy(how=How.NAME,name="reset")
	private WebElement Reset;
	

	
	public Loginbean() {
		// TODO Auto-generated constructor stub
	}

	public void submitClick() {
		Submit.click();
	}
	
	public void ResetClick() {
		Reset.click();
	}

	public String getUsername() {
		return Username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.Username.sendKeys(username);
	}

	public String getPassword() {
		return Password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.Password.sendKeys(password);
	}


	

	

	

}