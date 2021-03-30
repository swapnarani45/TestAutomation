import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\swapnaraniv\\\\Downloads\\\\chromedriver_win32 (1)\\\\chrome_driver.exe");
        //calling web Driver
                WebDriver driver=new ChromeDriver();
                driver.manage().window().maximize();    
                driver.get("http://www.paytm.com/flights");
                Thread.sleep(5000);
                driver.manage().window().maximize();
               /* WebElement depatureDate =driver.findElement(By.xpath("//*[@class='_3jkx']"));
                		depatureDate.click();
                		driver.findElement(By.name("Departure-Date")).sendKeys("20 Apr 2021");
                Thread.sleep(2000);*/
                
                JavascriptExecutor js=(JavascriptExecutor) driver;
                WebElement departureDate =driver.findElement(By.name("Departure-Date"));
                //executing javascript to click on element
                js.executeScript("arguments[0],click();", departureDate );
                //get return value from script
                //String text=(String)text js.executeScript("return arguments[0].innerText",departureDate);
                
               // for(WebElement item: Value) {
                	System.out.println();
                }
                
              
              
               
}

