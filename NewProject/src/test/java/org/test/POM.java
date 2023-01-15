package org.test;








import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.test.BaseClass2;

public class POM<WebElements> extends BaseClass2 {
	
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


@FindBy (xpath = "//table[@class = 'dataTable']//tr//td[1]")

private List <WebElement> table;

@FindBy (xpath = "//table[@class = 'dataTable']/tbody/tr")


private List  <WebElement> dynamicTable;

public List<WebElement> getTable() {
	return table;
}

public List<WebElement> getDynamicTable() {
	return dynamicTable;
}









/*
public WebElement getDynamicTable() {
	
	
	return dynamicTable;
}



public WebElement getTable() {
	return table;
}*/


}
