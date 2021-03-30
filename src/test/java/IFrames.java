import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\swapnaraniv\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chrome_driver.exe");
		  
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();    
    	driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().fullscreen();
		int iframesize = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total iframes in webpage is"+iframesize);
		/*driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("topnavbtn_tutorials")).click();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		/*driver.findElement(By.id("topnavbtn_references")).click();*/
		/*driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("topnavbtn_references")).click();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("topnavbtn_references")).click();
		Thread.sleep(10000);*/
		
		/*Dimension size=driver.manage().window().getSize();
		int width=size.getWidth();
		int height =size.getHeight();
		System.out.println("Height of the screen :"+size.height);
		System.out.println("Height of the screen :"+size.width);
		driver.manage().window().setSize(new Dimension(990,674));*/
		Point position = driver.manage().window().getPosition(); 
		int x1 = position.getX();
		int y1 = position.getY();
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(0, 0));
		System.out.println(x1);
		System.out.println(y1);
		Thread.sleep(1000);
		
		driver.close();
		driver.quit();
}
}