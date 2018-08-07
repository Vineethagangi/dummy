package com.capg.StepDefinationfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.ConferenceBeans.Loginbean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination {
	private WebDriver driver;
	private Loginbean PageBean;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivasfolder\\selenium\\chromedriver.exe");
	}

	@Given("^I have a registration form$")
	public void i_have_a_registration_form() throws Throwable {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vineetha_Module3/ConferenceRegistration/login.html");
		Thread.sleep(2000);
		PageBean = new Loginbean();
		PageFactory.initElements(driver, PageBean);
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {

		PageBean.setUsername("Vineetha");
		PageBean.setPassword("Vinitha");
		PageBean.submitClick();
	}

	@Then("^the result should be opening of login page$")
	public void the_result_should_be_opening_of_login_page() throws Throwable {

		Assert.assertEquals("Google", driver.getTitle());
	}
	@After
	public void afterScenario() {
		driver.close();
	}

}
