package com.valuemomentum.retail.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void Main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	WebElement element=driver.findElement(By.className("https://www.makemytrip.com/"));
	element.click();
}
}
