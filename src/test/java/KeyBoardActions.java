import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
         driver.findElement(By.id("//*[@class='nav-a  ']")).click();
        Thread.sleep(1000);
       //driver.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
    //driver.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        
       // driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
