import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssessmentDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.medplusmart.com");
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        WebElement element=driver.findElement(By.xpath("/html/body/header/div[1]/nav[2]/ul/li[1]/a"));
	        Actions act=new Actions(driver);
	        act.moveToElement(element).perform();
	        driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/ul/li[3]/a")).click(); 
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("Oral Care")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.linkText("Tooth Paste & Powder")).click();
	        Thread.sleep(1000);

	 

	     

	 

	      WebElement slider =driver.findElement(By.xpath("//*[@id=\"PriceRange\"]/div[1]/div[1]/div[3] "));
	        Actions move = new Actions(driver);
	        // move.moveToElement(slider).clickAndHold().moveByOffset(0, 100).release().perform();
	        move.dragAndDropBy(slider,-154,0).perform();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div[3]/div/a/i")).click();
	        driver.findElement(By.xpath("//*[@id=\"PEPS0011\"]/div[4]/div[4]/form/div[1]/div[2]/button")).click();
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
	        driver.findElement(By.xpath("//*[@id=\"PEPS0011\"]/div[4]/div[4]/form/div[1]/div[2]/button")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.id("addToCartBtn")).click();
	      
        
	}

}
