package org.test;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ExecutellPOM extends BaseClass3 {

	public ExecutellPOM() {
		
		PageFactory.initElements(driver, this);	
	}
	@FindBys({@FindBy(id = "username"),@FindBy(xpath = "//input[@id='username']")})
	private static WebElement username;
	@FindAll ({@FindBy(id = "password"),@FindBy(name = "sername")})
	private static WebElement password;
	
	@FindAll({@FindBy(id = "sername"),@FindBy(name = "login")})
	private WebElement login;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id ="room_type")
	private WebElement roomtype;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_nos")
	private WebElement roomnos;
	
	@FindBy(id ="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id ="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id ="adult_room")
	private WebElement adultroom;
	
	@FindBy(id ="child_room")
	private WebElement childroom;
	
	@FindBy(id ="Submit")
	private WebElement Submit;
	
    @FindBy(id ="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id ="continue")
	private WebElement continues; 
	
	@FindBy(id ="last_name")
	private WebElement last_name; 
	
	@FindBy(tagName ="textarea")
	private WebElement  address;
	
	@FindBy(id ="first_name")
	private WebElement firstname;  
	
	@FindBy(id ="cc_num")
	private WebElement  ccnum;
	
	@FindBy(id ="cc_type")
	private WebElement  cctype;
	
	@FindBy(id ="cc_exp_month")   
	private WebElement   ccexpmonth;
	
	@FindBy(id ="cc_exp_year")
	private WebElement   ccexpyear; 
	@FindBy(id ="book_now")
	private WebElement    booknow;
	@FindBy(id ="order_no")
	private WebElement    orderno;
	@FindBy(id ="cc_cvv")
	private WebElement   cccvv;
	

	public WebElement getDatepickout() {
		return datepickout;
	}

	public void setDatepickout(WebElement datepickout) {
		this.datepickout = datepickout;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getCccvv() {
		return cccvv;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath ="//html[@xmlns ='http://www.w3.org/1999/xhtml']")
	private static WebElement loginPage;


	public static WebElement getLoginPage() {
		return loginPage;
	}
	

}
