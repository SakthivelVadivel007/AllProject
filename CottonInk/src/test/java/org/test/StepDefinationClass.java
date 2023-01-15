package org.test;

import BaseClass.test.BaseClass2;
import io.cucumber.java.en.*;

public class StepDefinationClass extends BaseClass2 {

	@Given("user is on cottoink signin home page")
	public void user_is_on_cottoink_signin_home_page() {

		getDriver();

		loadUrl("https://www.cottonink.co.id/");

		maximize();
	}

	@Given("user should move courser to signin icon")
	public void user_should_move_courser_to_signin_icon() {

		moveToElement(POM.getInstnce().getUserIcon());
		moveToElement(POM.getInstance().getSignIn());
		
	}

	@When("user should click signin in dropdown")
	public void user_should_click_signin_in_dropdown() {

		

		click(POM.getInstance().getSignIn());

	}

	@When("user is navigte to signin\\/signup page")
	public void user_is_navigte_to_signin_signup_page() {

		System.out.println("user is on signin page");

	}

	@When("user should enter email address {string} and password {string}")
	public void user_should_enter_email_address_and_password(String string, String string2) {

		sendKeys(POM.getInstance().getEmail(), string);

		sendKeys(POM.getInstance().getPassword(), string2);
	}

	@Then("user should click signin button")
	public void user_should_click_signin_button() {

		implicitylWait(7);
click(POM.getInstance().getSignInClick());
	}

}
