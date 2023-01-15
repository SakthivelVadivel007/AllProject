package org.test;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassC  extends BaseClass3{
	
	ExecutellPOM p = new ExecutellPOM();
	
	@Test
	public  void afterClass()  {
		
		
		//findElementById("radiobutton_0").click();
		p.getRadiobutton().click();
		
		//findElementById("continue").click();
		
	p.getContinues().click();
	

	}
}