package com.opensorce.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.Admin;
import poc.Login;

public class AdminPom {
	
	/*
	 * Objects instances
	 */
	
	WebDriver driver;
	Base base;
	Login login;
	Admin admin;
	String username, password, msgNoRecords, userNotExist, newEmployee, newUser, newpassword;

	
	@BeforeTest
	  public void beforeTest() {
		base = new Base(driver);
		driver = base.chromeDriverSetup();
		login = new Login(driver);
		admin = new Admin(driver);
		
		username = "Admin";
		password = "admin123";
		userNotExist = "XYZ";
		msgNoRecords = "No Records Found";
		newEmployee = "";
		newUser = "";
		newpassword = "";
	  }
	
	
  @Test
  public void tc001AdminSearchEmployeePom() {
	  
	  login.loginOrange(username, password);
	  admin.searchUser(username);
	  admin.validateUsernameTable(username);
	  login.logOut();
	  
  }
  	

  @AfterTest
  public void afterTest() {
  }

}
