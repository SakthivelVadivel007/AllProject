package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample  {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        WebElement findElement2 = driver.findElement(By.className("_3704LK"));
        findElement2.sendKeys("hp laptop");
        driver.findElement(By.className("_34RNph")).click();
	 Thread.sleep(6000);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String eachWindowId : windowHandles) {
			if (!windowHandle.equals(windowHandles)) {
				driver.switchTo().window(eachWindowId);
				
		driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'][1])")).click();
				
			}
		}
		WebElement findElement3 = driver.findElement(By.xpath("(//div[text()='₹36,990'])[1]"));
		String text2 = findElement3.getText(); 
		System.out.println(text2);
		driver.quit();
	
}
}
