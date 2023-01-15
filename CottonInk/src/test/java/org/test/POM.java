package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.test.BaseClass2;

public class POM extends BaseClass2 {
	
	private static POM instance;
	
private POM () {
	
	PageFactory.initElements(driver, this);
	
}

public static POM getInstnce() {
	
	if (instance==null) {
		instance = new POM();
		
	}
	
	return instance;
	
}

@FindBy (xpath = "//span[@class = 'img-user-icon']")

private WebElement userIcon;


@FindBy (xpath = "(//a[text()='Sign In'])[1]")

private WebElement signIn;


public static POM getInstance() {
	return instance;
}

public WebElement getUserIcon() {
	return userIcon;
}

public WebElement getSignIn() {
	return signIn;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignInClick() {
	return signInClick;
}

@FindBy (id = "email_signin")

private WebElement email;


@FindBy (id = "password_signin")

private WebElement password;


@FindBy (xpath = "//button[text()='SIGN IN']")

private WebElement signInClick;





}
