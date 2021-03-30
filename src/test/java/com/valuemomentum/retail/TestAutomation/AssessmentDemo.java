package com.valuemomentum.retail.TestAutomation;

 


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import com.valuemomentum.retail.medpluss.utils.WebDriverHelper;

 

//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class AssessmentDemo extends WebDriverHelper {
    
    WebDriver driver;

 

    
    @BeforeClass
    public void setup()
    {
        this.driver=getDriver();
    }
    
    

 


    public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}






	@Test
    public void medpluss() throws InterruptedException, IOException {
         driver.navigate().to("https://www.medplusmart.com");
         System.out.println("Title : "+driver.getTitle());
        
        //Thread.sleep(1000);
        
         File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile1, new File("./image.png"));
         
         WebElement menuOption = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@class, 'active') and contains(text(), 'Health Store')])[1]")));
            
            Actions actions = new Actions(driver);
            System.out.println("Accecible name:  "+menuOption.getAccessibleName());
            System.out.println("Tag name:  "+menuOption.getTagName());
          
            actions.moveToElement(menuOption).perform();
            
            
            WebElement selectMenuOption = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'cate-main') and contains(text(), 'Personal Care')])")));
           System.out.println("CSS font family:  "+selectMenuOption.getCssValue("font-family"));
            System.out.println("CSS font size:  "+selectMenuOption.getCssValue("font-size"));
            System.out.println("Accecible name:  "+selectMenuOption.getAccessibleName());
            System.out.println("Tag name:  "+selectMenuOption.getTagName());
          
          
            selectMenuOption.click();
            
            File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile2, new File("./image2.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
            driver.findElement(By.xpath("//*[@id=\"leftNav_MART_20004\"]/a")).click();
            System.out.println("Title : "+driver.getTitle());
            
            driver.findElement(By.xpath("//*[@id=\"leftNav_MART_30046\"]/a")).click();
            System.out.println("Title : "+driver.getTitle());
            
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement Element = driver.findElement(By.xpath("(//div[contains(@class, 'slider-track') ])"));
            // //*[@id="PriceRange"]/div[1]/div[1]
            actions.dragAndDropBy(Element, -40, 0).build().perform();
            
            
            WebElement firstResult1 = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'btn btn-danger btn-block addToCartBtn') and contains(text(), 'Add to Cart') ])[12]")));
          firstResult1.click();
            
            
          File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile3, new File("./image3.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
          WebElement firstResult2 = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'btn btn-danger btn-block addToCartBtn') and contains(text(), 'Add to Cart') ])[4]")));
          firstResult2.click();
          
            driver.findElement(By.xpath("//*[@id=\"microCartQty\"]")).click();
            
         
            String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
           System.out.println("First Product: "+text);
           
           WebElement firstResult3 = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr[2]/td[1]")));
           
           String text1 = firstResult3.getText();
            System.out.println("Second Product: "+text1);
            
            driver.findElement(By.xpath("//*[@id=\"pharmaCheckOutBtn\"]")).click();
            System.out.println("Title : "+driver.getTitle());
            System.out.println("Are two products equal: "+text.equals(text1));
            
         

 

    }
    
   

    }

 

 

