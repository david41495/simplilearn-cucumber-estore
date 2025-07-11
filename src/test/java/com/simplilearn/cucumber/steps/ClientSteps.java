  package com.simplilearn.cucumber.steps;

import io.cucumber.java.en.*;

public class ClientSteps {
	
	@Given ("I am on the client creation form")
	public void i_am_on_the_client_creation_form() {
		System.out.println("Client creation form is open.");
	}
	
	@Then ("I enter my name")
	public void i_enter_my_name() {
		System.out.println("Entered client name.");
	}
	
	@And ("I enter my email")
	public void i_enter_my_email() {
		System.out.println("Entered client email.");
	}
	
	@And ("I create a password")
	public void i_create_a_password() {
		System.out.println("Created password.");
	}
	
	@Then ("I re enter my password")
	public void i_re_enter_my_password() {
		System.out.println("Re-entered password.");
	}
	
	@And ("I enter my address")
	public void i_enter_my_address() {
		System.out.println("Entered address.");
	}
	
	@When ("I hit create account")
	public void i_hit_create_account(String buttonlabel) {
		System.out.println("Clicked Button: " + buttonlabel);
	}
	
	@Then ("I created my new account")
	public void i_created_my_new_account() {
		System.out.println("Account created");
	}

}
