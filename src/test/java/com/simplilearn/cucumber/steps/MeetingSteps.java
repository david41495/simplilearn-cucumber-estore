package com.simplilearn.cucumber.steps;

import io.cucumber.java.en.*;


public class MeetingSteps {
	@Given ("I made my account")
	public void i_made_my_account() {
		System.out.println("Account is succesfully created.");
	}
	
	@And ("I need to schedule a meeting")
	public void i_need_to_schedule_a_meeting() {
		System.out.println("Client meeting form is open.");
	}
	
	@Then ("I choose a date")
	public void i_choose_a_date() {
		System.out.println("Entered a date.");
	}
	
	@And ("I choose a time")
	public void i_choose_a_time() {
		System.out.println("Entered a time.");
	}
	
	@And ("I mark the number of attendees")
	public void i_mark_the_number_of_attendees() {
		System.out.println("Entered number of attendees.");
	}
	
	@Then ("I hit confirm to schedule")
	public void i_hit_confirm_to_schedule(String buttonlabel) {
		System.out.println("Clicked Button to confirm: " + buttonlabel);
	}

}
