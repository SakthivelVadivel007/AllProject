package BaseClass.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {


	 protected static WebDriver driver;
  static String  data;

 
	public static  void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}
	public static void loadUrl(String url) {
    driver.get(url);
    
   
}
	
	public void close() {
		driver.close();
	}
		
	public  void quit() {
driver.quit();
	}
	
	public void clear(WebElement  element) {
		
		element.clear();

	}
	
	public static void maximize() {
driver.manage().window().maximize();
}	
	public WebElement findElementById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	
	}
		
		
	public WebElement findElementByName(String name) {
	WebElement findElement = driver.findElement(By.name(name));
	return findElement;		
	}
	public WebElement findElementByClassName(String className) {
WebElement findElement = driver.findElement(By.className(className));
return findElement;

	}
	public WebElement findElementByXpath(String xpath) {
	WebElement findElement = driver.findElement(By.xpath(xpath));
	return findElement;
}

	public WebElement findElementBytageName(String tagName) {
	WebElement findElement = driver.findElement(By.tagName(tagName));
	return findElement;
}

	public WebElement findElementBylinkText(String linkText) {
WebElement findElement = driver.findElement(By.linkText(linkText));
return findElement;

	}	
	public WebElement findElementBypartialLinkText(String partialLinkText) {
	WebElement findElement = driver.findElement(By.partialLinkText(partialLinkText));
	return findElement;

	}
	
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void navigateto(String url) {
	driver.navigate().to(url);
	}
	public 	List<WebElement> options(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	
	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public Alert alertsSendKeys(String name) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		return alert;
	} 
	
	public Alert alertGetText(String getText) {
Alert alert = driver.switchTo().alert();
String text = alert.getText();
return alert;

	}
	
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		 actions.moveToElement(element).perform();
	}
	
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
	 ac.doubleClick(element).perform();

	}
	
	public void contextClick(WebElement element) {
	Actions a = new Actions(driver);
	a.contextClick(element).perform();

	}
	
	public static WebElement JavascriptExecutor(WebElement element,char name) {
		JavascriptExecutor executor =  (org.openqa.selenium.JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].setAttribute('value',name", element);
		return element;
		
		
	}
	public Actions click(WebElement element) {
	Actions ac = new Actions(driver);
	Actions click = ac.click(element);
	click.perform();
	
	return click;
	}
	public static WebElement sendKeys(WebElement element,String keys) {
		Actions ac = new Actions(driver);
		Actions sendKeys = ac.sendKeys(element, keys);
		sendKeys.perform();
		return element;
	}
	/*
	public static Actions sendKeys1(WebElement element,String keys) {
		Actions ac = new Actions(driver);
		Actions sendKeys = ac.sendKeys(element, keys);
		sendKeys.perform();
		return sendKeys;
		}
		*/
	
	
		public WebElement enterText(WebElement element, String data) {
			Actions ac = new Actions(driver);
			Actions l = ac.sendKeys(element,data);
			l.perform();
			return element;
		}
		
		public void sendKeysintValue(WebElement element, CharSequence[] number) {
			Actions ac = new Actions(driver);
			
			ac.sendKeys(number).perform();
			
			

		}
	
		public Actions sendKeys(WebElement element,	WebElement data) {
			Actions ac = new Actions(driver);
			 ac.sendKeys(data).perform();
			return ac;
		
	
		}
		
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
			

		}
		
		public void implicitylWait(int time) {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		}
		

		public static void explicitWait(WebElement element, int time) {
			
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(time));
			
			w.until(ExpectedConditions.elementToBeClickable(element));
			

		}
		
		
		public void fluentWait(final WebElement element) {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class);
			
			
			WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
					
					return element;
				}
			});
			
					
			
			
			

		}

		public WebElement takeScreenShort( WebElement element, String filePath, String fileName) throws IOException {
			TakesScreenshot sc = (TakesScreenshot) driver;
			File as = sc.getScreenshotAs(OutputType.FILE);
			
			File f = new File(filePath + fileName + ".png" );
				
			FileUtils.copyFile(as, f);
			return element;
			
		}
	public static Select getSelect(WebElement element, int index) {
		Select se = new Select(element);
		se.selectByIndex(index);
		return se;
	
	
	}
	public static WebElement keyPressContolPlusA (WebElement element) throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		return element;
		
	}
	public static WebElement backspce(WebElement element) throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_BACK_SPACE);
		ro.keyRelease(KeyEvent.VK_BACK_SPACE);
		return element;
		
	}
		public static WebElement keyReleaseControlPlusA(WebElement element) throws AWTException {
			Robot ro = new Robot();
		ro.keyRelease(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		return element;
	}
	public WebElement getAttribute(WebElement element, String id) {
		WebElement element1 = driver.findElement(By.id(id));
		String attribute = element1.getAttribute("value");
		return element;
	}
	public static String getData(String excelpath,String sheetname,int row, int cell) throws IOException {
		File file = new File(excelpath);
FileInputStream stream = new FileInputStream(file);
Workbook workbook = new HSSFWorkbook(stream);
Sheet sheet = workbook.getSheet(sheetname);
Row row2 = sheet.getRow(row);
Cell cell2 = row2.getCell(cell);
int type = cell2.getCellType();
if (type==1) {
	 data = cell2.getStringCellValue();
}
if (type==0) {
	if (DateUtil.isCellDateFormatted(cell2)) {
		Date date = cell2.getDateCellValue();
		SimpleDateFormat dateformte = new SimpleDateFormat("dd/MM/yyyy");
		 data = dateformte.format(date);
	} else {
		double date = cell2.getNumericCellValue();
		long l = (long) date;
		 data = String.valueOf(l);

	}
}
return data;

	}
}

