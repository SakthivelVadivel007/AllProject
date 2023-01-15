package org.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass extends BaseClass2 {


@Given("User is on the flipkart login page")
public void user_is_on_the_flipkart_login_page() {
	getDriver();
	loadUrl("https://www.facebook.com/");
	maximize();
}
@When("User should enter valid username nd password")
public void user_should_enter_valid_username_nd_password() {
	findElementById("email").sendKeys("sakthivel");
    findElementById("pass").sendKeys("4069000");
}

@When("User should enter the login button")
public void user_should_enter_the_login_button() {
	
	findElementByName("login").click();
	
}

@Then("User should verify the success massage")
public void user_should_verify_the_success_massage() {
	
	System.out.println("successfully opened");
	close();
}

}
