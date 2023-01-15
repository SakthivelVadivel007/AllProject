package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class23 {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get ("\"https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.close();
	}

}
