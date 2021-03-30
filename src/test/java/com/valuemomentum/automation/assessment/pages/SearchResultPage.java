package com.valuemomentum.automation.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.util.Assert;
import com.valuemomentum.retail.TestAutomation.WebDriverHelper;

public class SearchResultPage extends BasePage{

	    public SearchResultPage(WebDriver driver) {
		super(driver);
		
	}
		
    

  // element
    @FindBy(xpath = "//*[text()='Cloudtail India']")
    private WebElement Cloudtail;

    public void clickOnFilter() {
        Cloudtail.click();
        
    }
        
    @FindBy(xpath = "//*[text()='AmazonBasics USB Type-C to USB-A 2.0 Male Cable - 3 Feet (0.9 Meters) - Black']")
   private WebElement USB ;
   public ProductDetailsPage clickOnProduct() {
            USB.click();
            WebDriverHelper.switchToWindow();
          
           
			return new ProductDetailsPage(driver);
            
            
        }
}
            
            
            