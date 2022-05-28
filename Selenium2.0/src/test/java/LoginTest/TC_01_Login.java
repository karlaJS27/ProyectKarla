package LoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globalVariables.variablesGlobales;
import navegationPages.LoginPage;
import setupDriver.DriverSetup;

public class TC_01_Login {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	
		@BeforeTest
	
	public void startWebDriber() {
		
		driver.get(variablesGlobales.HOME_PAGE);
		
	}
	
	
	
	
  @Test
  public void TC_01() {
	  
	  login.Login(variablesGlobales.USER_TESTER, variablesGlobales.PWD_TESTER);
  }
  
  
}
