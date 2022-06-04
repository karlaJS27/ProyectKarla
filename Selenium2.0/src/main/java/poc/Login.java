package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import base.Base;
import base.GlobalVariables;

public class Login extends Base {
	
	public Login(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Objects
	 */
	
	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By lnkWelcome = By.xpath("//a[@id='welcome']");
	By lnkLogout = By.xpath("//a[contains(@href, 'logout')]");

	
	/*
	 * Customize methods
	 */
	
	public void loginOrange(String username, String password) {
		Reporter.log("login into Orange HRM Portal");
		launchBrowser(GlobalVariables.QA_URL);
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		waitForElementPresent(lnkWelcome);
	}
	
	public void logOut() {
		
		Reporter.log("logOut of Orange HRM Portal");
		click(lnkWelcome);
		click(lnkLogout);
		implicitWait();
		
	}
	

}
