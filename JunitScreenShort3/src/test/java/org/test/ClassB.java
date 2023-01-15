package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassB extends BaseClass3 {
	
	ExecutellPOM p = new ExecutellPOM();
	@Test
	public void test() throws AWTException, IOException {
		

		
		//WebElement Id4 = findElementById("location");
		
		getSelect(p.getLocation(), 5);
		
		//WebElement findElementById5 = findElementByXpath("//select[@name='hotels']");
		
		getSelect(p.getHotels(), 3);
		
		//WebElement findElementByClassName = findElementById("room_type");
		
		getSelect(p.getRoomtype(), 3);
		
		//WebElement findElementById6 = findElementById("room_nos");
		
		getSelect(p.getRoomnos(), 3);
		//WebElement findElementById7 = findElementByXpath("(//input[@type='text'])[2]");
		
		clear(p.getDatepickin());
		
		//keyPressContolPlusA(findElementById7);
		//keyReleaseControlPlusA(findElementById7);
		//backspce(findElementById7);
		
		String data3=getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 2);
		
	 sendKeys(p.getDatepickin(), data3);
	 
	 //WebElement findElementById8 = findElementByXpath("(//input[@type='text'])[3]");
		//click(findElementById8);
		//keyPressContolPlusA(findElementById8);
	//	keyReleaseControlPlusA(findElementById8);
	  
		//backspce(findElementById8);
	 
	 clear(p.getDatepickout());
	 
		String data4= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 3);
		
	 sendKeys(p.getDatepickout(), data4);
	 
		
		//WebElement findElementById9 = findElementById("adult_room");
		getSelect(p.getAdultroom(), 3);
		
		//WebElement findElementById10 = findElementById("child_room");
		
		getSelect(p.getChildroom(), 3);
		
	   // WebElement findElementById11 = findElementById("Submit");
		
	    click(p.getSubmit());

	}
	
	}
   

