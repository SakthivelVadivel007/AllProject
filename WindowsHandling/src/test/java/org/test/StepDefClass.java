package org.test;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import BassClass.test.BaseClass2;
import POM.test.POM;
import io.cucumber.java.en.Given;

public class StepDefClass extends BaseClass2 {

	@Given("user is on windows handling main page")
	public void user_is_on_windows_handling_main_page() throws AWTException {

		getDriver();
		loadUrl("https://demo.automationtesting.in/Register.html");
		maximize();

		implicitylWait(10);

		POM.getInstnce().getFirstName().sendKeys("sakthivel");

		POM.getInstnce().getSecondNamme().sendKeys("vadivel");

		POM.getInstnce().getAddress().sendKeys("omr, karapakkam");

		POM.getInstnce().getEmail().sendKeys("abcdffgg000@gmail.com");

		POM.getInstnce().getPhoneno().sendKeys("6575788877");

		POM.getInstnce().getRadiobutton().click();

		POM.getInstnce().getHobbies().click();
		
		try {
			getSelectByIndex(POM.getInstnce().getLaunguge(),5);
			
		} catch (UnexpectedTagNameException e) {
		}
		
		
		/*try {

			POM.getInstnce().getLaunguge().click();

			// getSelectByisibleText(POM.getInstnce().getLaunguge(), "Arabic");

			// getSelectByIndex(POM.getInstnce().getLaunguge(), 7);

			// getSelectByIndex(POM.getInstnce().getLaungugessss(), 1);

			POM.getInstnce().getLaungugessss().click();

			findElementByXpath("(//div[@class= 'form-group'])[13]").click();
			// moveToElement(POM.getInstnce().getLaungugessss());

			
		} catch (NoSuchElementException e) {

		}*/


		getSelectByIndex(POM.getInstnce().getSkills(), 3);

		POM.getInstnce().getSelectCountry().click();

		findElementByXpath("//input[@type = 'search']").sendKeys(Keys.SHIFT, "india", Keys.ENTER);
		// POM.getInstnce().getSelectCountry().sendKeys("india");


		

		getSelectByIndex(POM.getInstnce().getDobYear(), 81);


		getSelectByIndex(POM.getInstnce().getDobMonth(), 5);


		getSelectByIndex(POM.getInstnce().getDobDay(), 20);

		POM.getInstnce().getPassword().sendKeys("666666");

		POM.getInstnce().getConfirmPassword().sendKeys("666666");

		POM.getInstnce().getSubmit().click();

	}

}