package org.test;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.testng.Assert;

import BassClass.test.BaseClass2;
import POM.test.POM;
import io.cucumber.java.en.Given;

public class StepDefClass extends BaseClass2 {

	@Given("user is on windows handling main page")

	@Given("user is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() {

		getDriver();
		loadUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		maximize();

		implicitylWait(30);

		POM.getInstnce().getLinkedIn().click();

		//POM.getInstnce().getFaceBook().click();

		//POM.getInstnce().getTwitter().click();

		POM.getInstnce().getYouTube().click();

		String windowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();
	
		List<String> list = new ArrayList(windowHandles);
	
		

	//String l = list.get(1);
	
	//driver.switchTo().window(l);

		for (String allwindow : list) {
			String title = driver.getTitle();
			//String title = driver.switchTo().window(list.get(4)).getTitle();
		
			System.out.println(title);
			
			//Assert.assertEquals(title, "you tube");
			
			//if (!allwindow.equalsIgnoreCase(windowHandle)) {
				
				//String title2 = driver.switchTo().window(allwindow).getTitle();
				Assert.assertEquals(title, "OrangeHRM Inc - YouTube");
			
				//if (title.equals("YouTube")) {
					driver.switchTo().window(allwindow);
		}	
					POM.getInstnce().getSearch().sendKeys("today trending");
					findElementByXpath("//button[@id ='search-icon-legacy']").click();
				//}
				
				
			//}
			
		
			
				//driver.switchTo().window(list.get(1));
				


				//if (title.contains("OrangeHRM Inc - YouTube")) {}
			

		
		/*driver.switchTo().window(windowHandle);

		POM.getInstnce().getUserName().sendKeys("Admin");

		POM.getInstnce().getPassword().sendKeys("admin123"); */

	}

}