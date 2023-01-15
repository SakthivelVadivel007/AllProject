package org.test;



import java.util.List;

import org.openqa.selenium.WebElement;

import BaseClass.test.BaseClass2;
import io.cucumber.java.en.*;

public class StepDefinationClass extends BaseClass2 {

	@Given("user is on  home page")
	public void user_is_on_home_page() {
		
		
		getDriver();

		loadUrl("https://demo.guru99.com/test/web-table-element.php");

		maximize();
		
		//WebElement xpath = findElementByXpath("//table[@class = 'dataTable']//tr[5]");
		
		//System.out.println(xpath.getText());
		
		implicitylWait(5);
		
		List table = POM.getInstnce().getTable();
		
		//List<WebElement> list = findElementsByXpath("//table[@class = 'dataTable']//tr//td[1]");
		
		List dynamicTable = POM.getInstnce().getDynamicTable();
		
		//List<WebElement> findElement = findElementsByXpath("//table[@class = 'dataTable']/tbody/tr");
	
		for (int i = 0; i < table.size(); i++) {
			
			if (((WebElement) table.get(i)).getText().equalsIgnoreCase("Sun Pharma.")) {
				
				
				System.out.println(((WebElement) dynamicTable.get(i)).getText());
				
				
			}
		}
			
		
}}