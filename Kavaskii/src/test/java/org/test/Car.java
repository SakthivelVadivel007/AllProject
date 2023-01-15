package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Car {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	
		WebElement element = driver.findElement(By.id("Skills"));
		
		Select se = new Select(element);
		List<WebElement> options = se.getOptions();
	for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
	}
	
	File file = new File("C:\\Users\\my pc\\eclipse-workspace\\Kavaskii\\Xcel Files\\sakyhi.xls");
	
	Workbook book = new HSSFWorkbook();
	Sheet createSheet = book.createSheet("Name");
	for (int i = 0; i < options.size(); i++) {
		Row createRow = createSheet.createRow(i);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(options.get(i).getText());
		
	}
	
	FileOutputStream stream = new FileOutputStream(file);
	book.write(stream);
			
			
		}
		
	}


