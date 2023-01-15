package org.test;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sakthi {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BaseClass c = new BaseClass();
		
		c.getDriver();
		c.loadUrl("https://adactinhotelapp.com/");
		c.maximie();
		
		String data1 = c.getData("C:\\Users\\my pc\\eclipse-workspace\\Kavaskii\\Xcel Files\\Adactin 1.xls", "Name", 1, 0);
		
		String data2 = c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls", "Name", 1, 1);
		
		WebElement element = c.findElementById("username");
		c.sendKeys(element, data1);
		
		WebElement findElementById2 = c.findElementById("password");
		c.sendKeys(findElementById2, data2);
		
	
		WebElement Id3 = c.findElementByName("login");
		Id3.click();
	

		WebElement Id4 = c.findElementById("location");
		c.getSelect(Id4, 5);
		WebElement findElementById5 = c.findElementByXpath("//select[@name='hotels']");
		c.getSelect(findElementById5, 3);
		WebElement findElementByClassName = c.findElementById("room_type");
		c.getSelect(findElementByClassName, 3);
		WebElement findElementById6 = c.findElementById("room_nos");
		c.getSelect(findElementById6, 3);
		WebElement findElementById7 = c.findElementByXpath("(//input[@type='text'])[2]");
		findElementById7.click();
		c.keyPress(findElementById7);
		c.keyRelease(findElementById7);
		c.backspce(findElementById7);
		String data3= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 2);
	 c.sendKeys(findElementById7, data3);
	 WebElement findElementById8 = c.findElementByXpath("(//input[@type='text'])[3]");
		c.click(findElementById8);
		c.keyPress(findElementById8);
		c.keyRelease(findElementById8);
		c.backspce(findElementById8);
		String data4= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 3);
	 c.sendKeys(findElementById8, data4);
	 
		
		WebElement findElementById9 = c.findElementById("adult_room");
		c.getSelect(findElementById9, 3);
		WebElement findElementById10 = c.findElementById("child_room");
		c.getSelect(findElementById10, 3);
	    WebElement findElementById11 = c.findElementById("Submit");
	    
		WebElement findElementById12 = c.findElementById("radiobutton_0");
		c.click(findElementById12);
		WebElement findElementById13 = c.findElementById("continue");
		c.click(findElementById13);
		String data5= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 4);
		WebElement findElementById14 = c.findElementById("first_name");
		c.sendKeys(findElementById14, data5);
		
		String data6= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 5);
		WebElement findElementById15 = c.findElementById("last_name");
		c.sendKeys(findElementById15, data6);
		
		String data7= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 6);
		WebElement findElementById16 = c.findElementById("address");
		c.sendKeys(findElementById16, data7);
		String data8= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 7);
		WebElement findElementById17 = c.findElementById("cc_num");
		c.sendKeys(findElementById17, data8);
		
		String data9= c.getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\Kavaskii\\\\Xcel Files\\\\Adactin 1.xls",
				"Name", 1, 8);
		WebElement findElementById21 = c.findElementById("cc_cvv");
		c.sendKeys(findElementById21, data9);
		
		WebElement findElementById18 = c.findElementById("cc_type");
		c.getSelect(findElementById18, 3);
		WebElement findElementById19 = c.findElementById("cc_exp_month");
		c.getSelect(findElementById19, 6);
		
		WebElement findElementById20 = c.findElementById("cc_exp_year");
		c.getSelect(findElementById20, 12);
		
		WebElement findElementById22 = c.findElementById("book_now");
		c.click(findElementById22);
		
		Thread.sleep(6000);
		WebElement findElementById23 = c.findElementById("order_no");
		String attribute = findElementById23.getAttribute("value");
		System.out.println(attribute);
		c.close();
	}
	

}
