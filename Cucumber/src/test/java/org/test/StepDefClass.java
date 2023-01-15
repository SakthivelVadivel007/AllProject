package org.test;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass extends BaseClass2{
	

@Given("User is on the instagram login page")
public void user_is_on_the_instagram_login_page() {
	
	loadUrl("https://www.instagram.com/accounts/login/");
	maximize();
	
}

@When("User should enter valid {string} and {string}")
public void user_should_enter_valid_and(String usernme, String password) {
	findElementByName("username").sendKeys(usernme);
	findElementByName("password").sendKeys(password);

	
}

@When("User should enter valid username nd password")
public void user_should_enter_valid_username_nd_password() {
	
	//findElementByName("username").sendKeys("sakthiggd");
	//findElementByName("password").sendKeys("44567888");
}

@When("User should enter the login button")
public void user_should_enter_the_login_button() {
	findElementByXpath("//div[text()='Log In']").click();
}

@Then("User should verify the success massage")
public void user_should_verify_the_success_massage() {
	System.out.println("success");
	close();
}

}
