package com.valuemomentum.retail.TestAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

  static WebDriver driver;


 public static void setDriver(WebDriver driver) {

}

 public static WebDriver getDriver() {
return driver;
}

 @BeforeTest
public void test_beforesuit() {

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

 }

 @AfterTest
public void test_aftersuit() {
driver.close();
driver.quit();
}
}