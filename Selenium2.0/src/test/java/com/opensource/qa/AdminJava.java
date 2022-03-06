package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminJava {
	
	String username, password, nameusr;
	
	@BeforeTest
	public void beforeTest(){
		
		username = "Admin";
		password = "admin123";
		nameusr = "Admin";
	}
	
  @Test
  public void tc_01() {
	  
	  //Step1
	  	Reporter.log("Abrir navegador");
	  	String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Step2
		Reporter.log("Ingresar credenciales");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		//Step3
		Reporter.log("Validar loggin exitoso");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		
		//Step4
		Reporter.log("seleccionar menu admin");
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step5
		Reporter.log("Buscar nombre de usr");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
		
		//Step6
		Reporter.log("Hcer click en buscar usr");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step7
		Reporter.log("verificar nombre del usr en  la tabla");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a")).getText();
		Assert.assertEquals(actualValue, "Admin");
		
		//Step8
		Reporter.log("Hacer logout");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step9
		Reporter.log("cierra pantalla");
		driver.close();
		
  }
  
  
public void tc_02() {
	  
	  //Step1
	  	Reporter.log("Abrir navegador");
	  	String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Step2
		Reporter.log("Ingresar credenciales");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		//Step3
		Reporter.log("Validar loggin exitoso");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		
		//Step4
		Reporter.log("seleccionar menu admin");
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step5
		Reporter.log("Buscar nombre de usr");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
		
		//Step6
		Reporter.log("Hcer click en buscar usr");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step7
		Reporter.log("verificar nombre del usr en  la tabla");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a")).getText();
		Assert.assertEquals(actualValue, "Admin");
		
		//Step8
		Reporter.log("Hacer logout");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step9
		Reporter.log("cierra pantalla");
		driver.close();
}
}
