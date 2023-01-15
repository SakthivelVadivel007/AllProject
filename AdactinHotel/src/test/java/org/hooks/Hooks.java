package org.hooks;

import java.io.IOException;

import BaseClass.test.BaseClass2;
import POM.test.POM;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks extends BaseClass2{
	
	@Before()

@Given("User should open the chrome browser")
public void user_should_open_the_chrome_browser() {
		
		System.out.println(" brfore hooks");
}

		

	}


