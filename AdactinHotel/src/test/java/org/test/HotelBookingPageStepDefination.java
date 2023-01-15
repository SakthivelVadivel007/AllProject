package org.test;

import BaseClass.test.BaseClass2;
import POM.test.POM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBookingPageStepDefination extends BaseClass2 {
	


@When("User should enter  {string} , {string}, Billig {string}, {string} and {string}")
public void user_should_enter_billig_and(String string, String string2, String string3, String string4, String string5) {

POM.getInstnce().getFirstName().sendKeys(string);
POM.getInstnce().getLastName().sendKeys(string2);
POM.getInstnce().getAddress().sendKeys(string3);
POM.getInstnce().getCcnum().sendKeys(string4);
POM.getInstnce().getCccvv().sendKeys(string5);
}

@When("User should Select CreditCardType")
public void user_should_select_credit_card_type() {
	
	getSelect(POM.getInstnce().getCctype(), 2);
	

	
}

@When("User should Select Expiry Date \\(month and year)")
public void user_should_select_expiry_date_month_and_year() {
	
	getSelect(	POM.getInstnce().getCcexpmonth(), 3);
	
	getSelect(	POM.getInstnce().getCcexpyear(), 12);
}

@When("User should click booknow button")
public void user_should_click_booknoe_button() {
	
	POM.getInstnce().getBooknow().click();
}

@Then("user should verify order number")
public void user_sould_verify_order_number() {
	
	System.out.println("user should verify order no");
	
}


@Then("user  enter the logout button")
public void user_enter_the_logout_button() {
	
	POM.getInstnce().getLogout().click();
	
	close();
}

}
