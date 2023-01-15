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
	
	




	@FindBy (xpath ="(//input[@type ='text'])[1]")
	private WebElement firstName;
	
	@FindBy (xpath ="(//input[@type ='text'])[2]")
	private WebElement secondNamme;

	@FindBy (xpath ="(//textarea[@rows= '3'])[1]")
	private WebElement address;

	@FindBy (xpath ="//input[@type='email']")
	private WebElement email;
	
	@FindBy (xpath="(//input[@type= 'tel'])[1]")
	private WebElement phoneno;
	
	@FindBy (xpath ="(//input[@type='radio'])[1]")
	private WebElement radiobutton;
	
	@FindBy (xpath ="(//input[@value='Cricket'])")
	private WebElement hobbies;
	
	@FindBy (xpath="//div[contains(@class, 'ui')]")
	private WebElement launguge;
	
	@FindBy (xpath="//a[text()= 'English']")
	private WebElement laungugessss;
	
	
	
	@FindBy (xpath ="(//select[@type = 'text'])[1]")
	private WebElement skills;
	
	@FindBy (xpath ="(//select[@type = 'text'])[2]")
	private WebElement country;
	
	@FindBy (xpath ="(//span[@role= 'combobox'])")
	private WebElement selectCountry;
	
	@FindBy (xpath ="(//select[@type= 'text'])[3]")
	private WebElement dobYear;
	
	@FindBy (xpath ="(//select[@type= 'text'])[4]")
	private WebElement dobMonth;
	
	@FindBy (xpath ="(//select[@type= 'text'])[5]")
	private WebElement dobDay;
	
	@FindBy (xpath ="(//input[@type= 'password'])[1]")
	private WebElement password;
	
	
	@FindBy (xpath ="(//input[@type= 'password'])[2]")
	private WebElement confirmPassword;
	
	
	
	@FindBy (xpath ="(//button[@type= 'submit'])[1]")
	private WebElement submit;


	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondNamme() {
		return secondNamme;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLaunguge() {
		return launguge;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getDobYear() {
		return dobYear;
	}

	public WebElement getDobMonth() {
		return dobMonth;
	}

	public WebElement getDobDay() {
		return dobDay;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getLaungugessss() {
		return laungugessss;
	}

	
	
	
	
	
}
