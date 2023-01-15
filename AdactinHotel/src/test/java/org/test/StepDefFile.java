package org.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import BaseClass.test.BaseClass2;
import BaseClass.test.BaseClass3;
import POM.test.POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefFile extends BaseClass2 {


@When("user  is on the Adactin hotel login page")
public void user_is_on_the_adactin_hotel_login_page() throws IOException {
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
	maximize();
	
	takeScreenShort(POM.getInstnce().getScreenShort(), "F:\\Sakthivel files\\", "Login Page");
}
	
	
	@When("User should enter valid {string}  and {string}")
	public void user_should_enter_valid_and(String string, String string2) {

		POM.getInstnce().getUsername().sendKeys(string);
		POM.getInstnce().getPassword().sendKeys(string2);

	}

	@When("User should enter the login button")
	public void user_should_enter_the_login_button() {

		POM.getInstnce().getLogin().click();

	}

	@Then("User should navigate to search hotel page")
	public void user_should_navigate_to_search_hotel_page() {

		System.out.println("users navigate search hotel page ");
		
	}
	

@Given("User is on the Adactin Search hotel login page")
public void user_is_on_the_adactin_search_hotel_login_page() {
	
	System.out.println("user is on hotel search pge");
}

@When("User select the valid Location")
public void user_select_the_valid_location() {
	
	
	getSelect(POM.getInstnce().getLocation(), 5);
}

@When("User select the valid  Hotels")
public void user_select_the_valid_hotels() {
	
	getSelect(POM.getInstnce().getHotels(), 3);
}

@When("User select the valid Room Type")
public void user_select_the_valid_room_type() {
	
	getSelect(POM.getInstnce().getRoomtype(), 3);
	
}

@When("User select the valid Number of Rooms")
public void user_select_the_valid_number_of_rooms() {
	
	getSelect(POM.getInstnce().getRoomnos(), 3);
}

@When("User select the validAdults per Room")
public void user_select_the_valid_adults_per_room() {
;
getSelect(POM.getInstnce().getAdultroom(), 3);

}

@When("User select the valid Children per Room")
public void user_select_the_valid_children_per_room() {

getSelect(POM.getInstnce().getChildroom(), 3);

}

@And("User enter the valid {string} and {string}")
public void user_enter_the_valid_and(String string3, String string4) {

	POM.getInstnce().getDatepickin().clear();
	sendKeys(POM.getInstnce().getDatepickin(), string3);
	
	POM.getInstnce().getDatepickout().clear();
	sendKeys(POM.getInstnce().getDatepickout(), string4);
	
}


@When("User  enter the search button")
public void user_enter_the_search_button() {

POM.getInstnce().getSubmit().click();

}

@Then("User should navigate the success massage")
public void user_should_navigate_the_success_massage() {

System.out.println("success");

}

@When("User should click radio button")
public void user_should_click_radio_button() {


POM.getInstnce().getRadiobutton().click();

}


@Given("User is on the Adactin hotel Select  page")
public void user_is_on_the_adactin_hotel_select_page() {

System.out.println("user is on hotel select page");

}

@When("User should enter continue button")
public void user_should_enter_continue_button() {
	implicitylWait(7);
	POM.getInstnce().getContinues().click();

}

}
