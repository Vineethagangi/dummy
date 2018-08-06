package com.capg.ConferenceQ;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calculator {

	
	
	
	
	@Before
	public void beforeScenario(){
		System.out.println("Before");
	}
	
	@After
	public void afterScenario(){
		System.out.println("After");
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
		 try {
			i_have_a_calculator();
			i_add_and(2, 3);
			the_result_should_be(7);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("The given numbers");
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("adding");
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the result is");
	}


	
}
