import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        Thread.sleep(1000);
        driver.findElement(By.id("searchDropdownBox")).sendKeys("electronics");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[2]/span/a/div/label/i")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/span/a/div/img")).click();
        Thread.sleep(1000);
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
