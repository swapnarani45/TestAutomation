import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\swapnaraniv\\\\Downloads\\\\chromedriver_win32 (1)\\\\chrome_driver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("https://www.amazon.in");
		  
		   Rectangle rect = driver.findElement(By.xpath("(//*[contains(text(),'Cart')])[1]")).getRect();
	        System.out.println(" height value of "+ rect.getHeight());
	        System.out.println(" Width value of "+ rect.getWidth());
	        System.out.println(" X value of "+ rect.getX());
	        System.out.println(" Y value of "+ rect.getY());
	        System.out.println(" Dimensions value of "+ rect.getDimension());
	        System.out.println(" Point value of "+ rect.getPoint());
		   
		   WebElement element= driver.findElement(By.xpath("//*[text()='Mobiles']"));
		   System.out.println("Text is "+driver.getTitle());
		  System.out.println("DOM of the attribute :"+element.getDomAttribute("class"));
		 System.out.println("Arial role of the element :"+element.getAriaRole());
		 System.out.println("Text is :"+element.getText());
		 
		
		   

		  
}
}