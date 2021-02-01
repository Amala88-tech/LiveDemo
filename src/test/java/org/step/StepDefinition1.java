package org.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition1 {
	@Given("Validating the parallel execution.")
	public void validating_the_parallel_execution() {
		System.out.println("Checking 1st method");
	}

	@Then("Its done.")
	public void its_done() {
		System.out.println("Checking 2nd method");
	}

}
