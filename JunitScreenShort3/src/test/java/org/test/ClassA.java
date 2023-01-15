package org.test;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ClassA extends BaseClass3 {
	
	  ExecutellPOM p = new ExecutellPOM();
	
	
	@BeforeClass
	
	
	
	public static void beforeClass() throws IOException {
		

		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		
	}

	@Test

	public void tet() throws IOException {
		
		p.takeScreenShort(p.getLoginPage(), "F:\\Sakthivel files\\", "abcd");

		
		String data1 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls",
				"Name", 1, 0);

		String data2 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls",
				"Name", 1, 1);
		
		p.getUsername().sendKeys(data1);
		
		p.getPassword().sendKeys(data2);
		
		p.getLogin().click();

		close();
		
		/*WebElement element = findElementById("username");

		sendKeys(element, data1);

		WebElement element1 = findElementById("password");
		sendKeys(element1, data2);

		findElementByName("login").click();
*/
	}

}
