package org.com;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.test.BaseClass3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG extends BaseClass3 {
	
	@Test(enabled=false)
    public void beforeTest() {
getDriver();
loadUrl("https://adactinhotelapp.com/");
maximize();


}
    @Test
    public void afterClass() {
	System.out.println("@test");
	
	}
	@AfterTest
    public void afterTest() {
	System.out.println("afterTest");

}

	@BeforeClass(enabled= false)
    public void beforeClass() {
	System.out.println("beforeClass");

}
	/*
	@Test
    public void test() throws IOException {
		 String data1 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 0);
			
			String data2 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 1);
		
	                WebElement element = findElementById("username");
	             
	        		element.sendKeys("sakthivelvadivel");
	        		
	        		WebElement findElementById2 = findElementById("password");
	        		findElementById2.sendKeys("OT1F0L");
	        	
	        		WebElement Id3 = findElementByName("login");
	        		Id3.click();
	        		
	        		}
	        		*/


	@BeforeSuite
    public void beforeSuite() {
	System.out.println("beforeSuite");

}
	@AfterSuite
    public void afterSuite () {
	System.out.println("afterSuite");

}
	@BeforeMethod
    public void beforeMethod() {
	System.out.println("beforeMethod");

}
	@AfterMethod
    public void afterMethod() {
	System.out.println("afterMethod");

}
}