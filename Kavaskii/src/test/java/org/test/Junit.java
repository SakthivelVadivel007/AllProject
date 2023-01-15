package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void afterClass() {
    driver.close();
	}
	
	
	@Before
	public void before() throws IOException {
	
	TakesScreenshot screenshort = (TakesScreenshot) driver;
		WebElement element1 = driver.findElement(By.xpath("//div[contains(@class,'_95k9')]"));
File screenshotAs = element1.getScreenshotAs(OutputType.FILE);
File file = new File("F:\\Sakthivel files\\before.png");
FileUtils.copyFile(screenshotAs, file);

	}
	
    
	@Test
	public void test()  {    
		
    WebElement findElement = driver.findElement(By.id("email"));
    findElement.sendKeys("sakthi");
    WebElement findElement1 = driver.findElement(By.id("pass"));
    findElement1.sendKeys("12345");
    WebElement findElement2 = driver.findElement(By.name("login"));
    findElement2.click();
    
    
	}

	public void after() throws IOException {

	
	TakesScreenshot screenshort = (TakesScreenshot) driver;
	WebElement element = driver.findElement(By.className("_4-u5 _30ny"));
	File screenshot = element.getScreenshotAs(OutputType.FILE);
	File file = new File("F:\\Sakthivel files\\after.png");
	FileUtils.copyFile(screenshot, file);

	}
	}
