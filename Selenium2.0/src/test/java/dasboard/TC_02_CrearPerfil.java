package dasboard;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globalVariables.variablesGlobales;
import navegationPages.LoginPage;
import navegationPages.PaginaInicio;
import setupDriver.DriverSetup;

public class TC_02_CrearPerfil {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	PaginaInicio dasboard = new PaginaInicio(driver);
	
	@BeforeTest
	
	public void startWebDriber() {
	
	driver.get(variablesGlobales.HOME_PAGE);
	
}
	
	
	
  @Test
  public void TC_02() {
	  
	  login.Login(variablesGlobales.USER_TESTER, variablesGlobales.PWD_TESTER);
	  dasboard.SeleccionPerfil();
	  dasboard.ProspectoClinete("12");
	  
	  
	  
	  
  }
}
