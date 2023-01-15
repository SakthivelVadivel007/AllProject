package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class PageObjectModel  extends BaseClass3 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		ExecutellPOM p= new ExecutellPOM();
		WebElement username = p.getUsername();
		String data1 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 0);
		sendKeys(username, data1);
		WebElement password = p.getPassword();
		
		String data2 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 1);
		sendKeys(password, data2);
	    p.getLogin().click();
	 WebElement location = p.getLocation();
	 getSelect(location, 5);
	 WebElement hotels = p.getHotels();
	 getSelect(hotels, 3);
	 WebElement roomtype = p.getRoomtype();
	 getSelect(roomtype, 3);
	 WebElement roomnos = p.getRoomnos();
	 getSelect(roomnos, 3);
	 WebElement datepickin = p.getDatepickin();
	 datepickin.click();
	 keyPressContolPlusA(datepickin);
	keyReleaseControlPlusA(datepickin);
	backspce(datepickin);
	 String data3 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 2);
		sendKeys(datepickin, data3);
	WebElement datepickout = p.getDatepickout();
	datepickout.click();
	keyPressContolPlusA(datepickout);
	keyReleaseControlPlusA(datepickout);
	backspce(datepickout);
	 String data4 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 3);
				sendKeys(datepickout, data4);
				
				WebElement adultroom = p.getAdultroom();
				getSelect(adultroom, 3);
				WebElement childroom = p.getChildroom();
				getSelect(childroom, 3);
				p.getSubmit().click();
			p.getRadiobutton().click();
			p.getContinues().click();
			WebElement firstname = p.getFirstname();
			 String data5 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 4);
			sendKeys(firstname, data5);
			 WebElement last_name = p.getLast_name();
			 String data6 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 5);
			 sendKeys(last_name, data6);
			 WebElement address = p.getAddress();
			 String data8 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 6);
			 sendKeys(address, data8);
			 WebElement ccnum = p.getCcnum();
			 String data7 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 7);
			 sendKeys(ccnum, data7);
			 WebElement cccvv = p.getCccvv();
			 String data9 = getData("C:\\Users\\my pc\\eclipse-workspace\\JunitScreenShort3\\Xcel files\\Adactin 1.xls", "Name", 1, 8);
			 sendKeys(cccvv, data9);
			  WebElement cctype = p.getCctype();
			 getSelect(cctype, 3);
			 WebElement ccexpmonth = p.getCcexpmonth();
			 getSelect(ccexpmonth, 6);
			 WebElement ccexpyear = p.getCcexpyear();
			 getSelect(ccexpyear, 12);
			 p.getBooknow().click();
			 Thread.sleep(5000);
			 WebElement orderno = p.getOrderno();
			 String attribute = orderno.getAttribute("value");
			 System.out.println(attribute);
			 driver.close();		
	}
}
