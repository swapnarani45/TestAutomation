import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        driver.findElement(By.id("nav_cs_2")).click();
        driver.findElement(By.id("a-label a-checkbox-label")).sendKeys("beauty");
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.xpath("//*[@id=\"dealImage\"]/div/div/div[2]")).click();
        driver.switchTo().newWindow(WindowType.TAB);
      
        
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
        driver.close();
        driver.quit();
	}

}
