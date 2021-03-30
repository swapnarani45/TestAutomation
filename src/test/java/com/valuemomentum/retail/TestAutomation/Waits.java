
	package com.valuemomentum.retail.TestAutomation;

	import java.util.Set;
	import java.io.*;
import java.time.Duration;
import java.util.Iterator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class Waits {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http:\\www.amazon.in");
			//driver.manage().timeouts().wait();
			System.out.println(" Current URL = "+ driver.getCurrentUrl());
	        System.out.println(" Windows details "+ driver.getWindowHandle());
			
			// Initialize and wait till element(link) became clickable - timeout in 10 seconds
	       
	        	    WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
	        	                .until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
	        	        firstResult.sendKeys("iphone");

			
			firstResult.sendKeys("iphones");
			
			
	       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vivo phones");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        /*//open and swithes to new tab
	        driver.switchTo().newWindow(WindowType.TAB);
	        //open a new window and swithes to new window
	        driver.switchTo().newWindow(WindowType.TAB);*/
	        driver.navigate().back();
	        driver.navigate().forward();
	        
	        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
	        String currentWindow =  driver.getWindowHandle();
	        System.out.println(currentWindow);
	        Set<String> windows = driver.getWindowHandles();
	       Iterator<String> ite = windows.iterator();
	        while(ite.hasNext()) {
	            String newWindow=ite.next();
	            if(!currentWindow.equals(newWindow))
	            System.out.println(newWindow);{
	                driver.switchTo().window(newWindow);
	            }
	        }
	        driver.findElement(By.id("add-to-cart-button")).click();
	        Thread.sleep(4000);
	        //driver.findElement(By.id("dropdownLangauge")).click();
	        //Thread.sleep(5000);
	        //driver.findElement(By.xpath("//*[@id=\"fr\"]")).click();
	        driver.close();
	        driver.quit();
		}

	}


