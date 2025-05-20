package com.simplilearn.cucumber.steps;

import io.cucumber.java8.En;

public class OrderSteps implements En {

	public OrderSteps() {
		
		Given("the user has paid for the order through internet banking", () -> {
			System.out.println("STEP 1: Given");
		});

		When("the user enters the email and password in the form", () -> {
			System.out.println("STEP 2: When");
		});

		When("the user clicks the login button", () -> {
			System.out.println("STEP 3: When");
		});

		Then("the user will be navigated to the home page", () -> {
			System.out.println("STEP 4: Then");
		});
	}

}
