package org.test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassD extends BaseClass3 {
	
	ExecutellPOM p = new ExecutellPOM();
	
	@Test
	public void test() throws IOException, InterruptedException {
		String data5= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 4);
		//WebElement findElementById14 = findElementById("first_name");
		
		sendKeys(p.getFirstname(), data5);
		
		String data6= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 5);
		//WebElement findElementById15 = findElementById("last_name");
		sendKeys(p.getLast_name(), data6);
		
		String data7= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 6);
		//WebElement findElementById16 = findElementById("address");
		sendKeys(p.getAddress(), data7);
		String data8= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 7);
		//WebElement findElementById17 = findElementById("cc_num");
		sendKeys(p.getCcnum(), data8);
		
		String data9= getData("C:\\\\Users\\\\my pc\\\\eclipse-workspace\\\\JunitScreenShort3\\\\Xcel files\\\\Adactin 1.xls",
				"Name", 1, 8);
		//WebElement findElementById21 = findElementById("cc_cvv");
		sendKeys(p.getCccvv(), data9);
		
		//WebElement findElementById18 = findElementById("cc_type");
		
		getSelect(p.getCctype(), 3);
		
		//WebElement findElementById19 = findElementById("cc_exp_month");
		getSelect(p.getCcexpmonth(), 6);
		
		//WebElement findElementById20 = findElementById("cc_exp_year");
	    getSelect(p.getCcexpyear(), 12);
		
	//	WebElement findElementById22 = findElementById("book_now");
		click(p.getBooknow());
		
		//Thread.sleep(8000);
		
	implicitylWait(5);
		
		//WebElement findElementById23 = findElementById("order_no");
	
	getAttribute(p.getOrderno());
		//String attribute = findElementById23.getAttribute("value");
	
		//System.out.println(attribute);
	System.out.println(getAttribute(p.getOrderno()));
	



	
		close();
	}

}
