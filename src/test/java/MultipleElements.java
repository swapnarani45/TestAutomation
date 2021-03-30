

 

import java.util.List;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class MultipleElements {

 

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\training\\java\\testautomation\\lib\\chromedriver.exe");

 

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        
        /* 
          // Using findElements Tag (getting all elements in a tag)
         // Identify Element 
        List<WebElement> menu=driver.findElements(By.xpath("//*[@id='nav-xshop']/a"));  //xpath has 1 of 29 we are find total bar
        // Print all Elements in the menu
        for(WebElement element: menu) {
            System.out.println(element.getText());
        }*/
        
        /*
        // findElement From Element (in a menu bar we are taking a particular value)
        WebElement menu=driver.findElement(By.id("nav-xshop"));
        WebElement element=menu.findElement(By.tagName("a"));
        System.out.println(element.getText());
        */
        
        
        // Find Elements of Elements (Same as getting all elements in menu)
        WebElement menu=driver.findElement(By.id("nav-xshop"));
        List<WebElement> value=menu.findElements(By.tagName("a"));
        
        for(WebElement item:value) {
            System.out.println(item.getText());
        }
    
        
        
        Thread.sleep(1000);
        driver.close();
        driver.quit();

 

    }

 

}