package com.valuemomentum.retail.test.Automation.TestAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class Assessment 
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.medplusmart.com");
        Thread.sleep(100);
        driver.manage().window().maximize();
        System.out.println("windows deatails"+driver.getTitle());
        Thread.sleep(100);
        driver.findElement(By.linkText("Health Store")).click();
        Thread.sleep(100);
        driver.findElement(By.linkText("OTC & Health Needs")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/section[2]/div/div/ul/div[1]/div/div[3]/li/a/div[1]/img"));
        driver.findElement(By.linkText("Oral Care")).click();
        driver.findElement(By.linkText("Tooth Paste & Powder")).click();
        
         driver.findElement(By.id("clearAll")).click();
        Select care = new Select(driver.findElement(By.name("Health store")));
        care.selectByVisibleText("Personal care");
        driver.findElement(By.linkText("Personal Care")).click();
        Thread.sleep(100);
        driver.findElement(By.tagName("Shop by Category"));
        Thread.sleep(100);
        //Personal Care
    }
}
 