package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPrub {
  @Test
  public void f() {
	  
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.youtube.com/");
	  
  }
}
