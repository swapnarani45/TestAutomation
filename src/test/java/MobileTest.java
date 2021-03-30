import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileTest {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		driver.manage().window().maximize();
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div/label/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(3000);
		
		 driver.navigate().back();
	        driver.navigate().forward();
	        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/span/a/div/img")).click();
	        
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
		
		
		
		
	}
	
}
