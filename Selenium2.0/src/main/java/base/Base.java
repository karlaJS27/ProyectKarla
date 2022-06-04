package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {
	
	//Instances
	private WebDriver driver;
	
	/*
	 * Constructor description
	 * @parametro: String
	 * @return
	 * @Throws
	 * @author: karla
	 * @date:
	 * --heder--
	 */
	
	public Base(WebDriver driver) {
		this.driver=driver;	
	}
	
	/*
	 * Reporter log
	 */
	
	public void reporterLog(String log) {
		
		Reporter.log(log);
	}
	
	/*
	 * chrome driver set up
	 */

	public WebDriver chromeDriverSetup() {
		
		System.setProperty(GlobalVariables.NAME_CHROME_DRIVER, GlobalVariables.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * Launch Browser
	 */
	
	public void launchBrowser(String url) {
		
		try {
			reporterLog("Lauching browser.."+url);
			driver.get(url);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Type (sendkeys)
	 */
	
	public void type(By locator, String inputText) {
		
		if(inputText.equals("")) {
			return;
		}
		driver.findElement(locator).sendKeys(inputText);
		
	}
	
	/*
	 * click
	 */
	
	public void click(By locator) {
		
		try {
		
		driver.findElement(locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			
		}
		
	}
	
	/*
	 * Wait for element present(Explicitwait)
	 */
	
	public void waitForElementPresent(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.STANDAR_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	/*
	 * Wait for element present(sobrecarga metodo-Overloading)
	 */
	
	public void waitForElementPresent(By locator, int specificTimeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.STANDAR_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	/*
	 * (implicit wait)
	 */
	
	public void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(GlobalVariables.STANDAR_TIME_OUT, TimeUnit.SECONDS);
	}
	
	/*
	 * Get Text
	 */
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	/*
	 * Close browser
	 */
	
	public void closeBrowse() {
		driver.close();
	}
	
}
