import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsDemo {

	
		public static void main(String[] args) throws Exception {
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\swapnaraniv\\\\Downloads\\\\chromedriver_win32 (1)\\\\chrome_driver.exe");
	        //calling web Driver
	                WebDriver driver=new ChromeDriver();
	                driver.manage().window().maximize();    
	                driver.get("http://www.amazon.in");
	                Thread.sleep(5000);
	                driver.manage().window().maximize();
	                driver.findElement(By.xpath("//*[@class='nav-left']/a")).click();
	                Thread.sleep(2000);
	              ////*[@id="nav-hamburger-menu"]
	                WebElement menu= driver.findElement(By.xpath("//*[@class='hmenu hmenu-visible']"));
	              
	                List<WebElement> list= menu.findElements(By.tagName("li"));
	                for(WebElement items:list) {
	                    System.out.println(items.getText());
	                }
	                List<WebElement> array=new ArrayList<WebElement>();
	                array= menu.findElements(By.tagName("li"));
	                System.out.println("Element are listed below using Arraylist");
	                 
	                for(WebElement item :array) {
	                    System.out.println("Get the value of element "+ item.getText());
	                }
	                 driver.close();
	                   driver.quit();
	    }

	 

	}


