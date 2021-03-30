import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KotakDemo {
	
	
	   //public static void main(String[] args) throws InterruptedException {
	
	public void loginfile() {
	
	        // TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\swapnaraniv\\\\Downloads\\\\chromedriver_win32 (1)\\\\chrome_driver.exe");
	        //calling webDriver
	        WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        driver.get("https://netbanking.kotak.com/knb2/");
	        
	        WebElement userName = new WebDriverWait(driver, Duration.ofSeconds(5))
	                .until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
	                userName.sendKeys("12321");
	                
	        WebElement next = new WebDriverWait(driver, Duration.ofSeconds(5))
	                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
	                        next.click();
	                
	        WebElement mobileNumber = new WebDriverWait(driver, Duration.ofSeconds(5))
	                   .until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNo")));
	                                mobileNumber.sendKeys("12321321");
	                                
	    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-verify-mobile-number/app-card-layout/div/form/div[5]/button")).click();
	                        
	        
	    //    System.out.println("Active element is "+driver.switchTo().activeElement().getDomAttribute("formcontrolname"));
	    /*    
	        WebElement button = driver.findElement(By.xpath("//*[@type='submit']"));
	        System.out.println("Before Entering the value - Button Status displayed:"+button.isDisplayed());
	        System.out.println("Before Entering the value - Button Status enabled:"+button.isEnabled());
	        System.out.println("Before Entering the value - Button Status selected:"+button.isSelected());
	        
	        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
	        .until(ExpectedConditions.elementToBeClickable(By.id("userName")));
	        firstResult.sendKeys("12345");
	        
	        // driver.findElement(By.id("userName")).sendKeys("12345");
	        System.out.println("Before Entering the value - Button Status displayed:"+button.isDisplayed());
	        System.out.println("Before Entering the value - Button Status enabled:"+button.isEnabled());
	        System.out.println("Before Entering the value - Button Status selected:"+button.isSelected());*/
	        
	        
	        driver.close();
	        driver.quit();
 


}
}
		   
		   
		   
		   
		   