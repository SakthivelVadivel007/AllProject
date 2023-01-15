package POM.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BassClass.test.BaseClass2;

public class POM extends BaseClass2{
	
	private static POM instance;
	
	private POM() {
		PageFactory.initElements(driver, this);
			
		}
		
	public static POM getInstnce() {
		
		if (instance== null) {
			
			instance = new POM();
		}
	return instance;	
	}
	
	




	@FindBy (xpath ="(//a[@target = '_blank'])[1]")
	private WebElement linkedIn;
	
	@FindBy (xpath ="(//a[@target = '_blank'])[2]")
	private WebElement faceBook;


	@FindBy (xpath ="(//a[@target = '_blank'])[3]")
	private WebElement twitter;

	@FindBy (xpath ="(//a[@target = '_blank'])[4]")
	private WebElement youTube;
	
	
	@FindBy (xpath ="//input[@name = 'username']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@name = 'password']")
	private WebElement password;
	
	@FindBy (xpath ="//input[@id = 'search']")
	private WebElement search;
	
	
	
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getLinkedIn() {
		return linkedIn;
	}

	public WebElement getFaceBook() {
		return faceBook;
	}

	public WebElement getTwitter() {
		return twitter;
	}

	public WebElement getYouTube() {
		return youTube;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}	
	
	
	
}
