package navegationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver  driver) {
		
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(id="username")
	private WebElement userNametxt;
	@FindBy(id="password")
	private WebElement passtxt;
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/button")
	private WebElement bttnIngresar;

	public void Login(String user, String pass) {
		
		userNametxt.sendKeys(user);
		passtxt.sendKeys(pass);
		bttnIngresar.click();
		
	}
	
}
