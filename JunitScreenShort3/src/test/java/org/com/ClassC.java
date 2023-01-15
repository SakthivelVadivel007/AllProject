package org.com;

import org.openqa.selenium.WebElement;
import org.test.BaseClass3;
import org.testng.annotations.Test;

public class ClassC extends BaseClass3 {
	
   @Test
	private void test() {
getDriver();
loadUrl("https://www.facebook.com/");
maximize();

	}
   @Test
   private void test1() {
WebElement elementById = findElementById("email");
sendKeys(elementById, "sakthi");
WebElement elementById2 = findElementById("pass");
sendKeys(elementById2, "12345");
WebElement byName = findElementByName("login");
click(byName);
close();
}
}
