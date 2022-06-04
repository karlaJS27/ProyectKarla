package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import base.Base;

public class Admin extends Base{

	public Admin(WebDriver driver) {
		super(driver);
	}

	/*
	 * Objects
	 */
	
	By lnkAdminHeder = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By txtUserName = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	
	
	/*
	 * Customize methods
	 */
	
	public void searchUser(String username) {
		Reporter.log("Seaeching User.."+ username);
		click(lnkAdminHeder);
		type(txtUserName, username);
		click(btnSearch);
		implicitWait();
	}
	
	public void validateUsernameTable(String expectedUser) {
		Reporter.log("Valide Username.."+ expectedUser);
		String actualUserName = getText(tblUsername);
		Assert.assertEquals(actualUserName, expectedUser);
		
	}
}
