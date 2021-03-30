package com.valuemomentum.retail.test.Automation.TestAutomation;

import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuemomentum.automation.assessment.pages.HomePage;
import com.valuemomentum.automation.assessment.pages.ProductDetailsPage;
import com.valuemomentum.automation.assessment.pages.SearchResultPage;
import com.valuemomentum.retail.TestAutomation.BaseTest;



public class SmokeTest extends BaseTest{
WebDriver driver;
HomePage homePage;

ProductDetailsPage productDetailsPage;
SearchResultPage searchResultPage;
@BeforeClass
public void setup() {
this.driver = getDriver();
homePage=new HomePage(driver);
}

 @Test
public void verifyMobilePurchase() throws InterruptedException {
final Logger logger = LogManager.getLogger(SmokeTest.class);

logger.info("Clicked on Mobile");
searchResultPage=homePage.clickOn();
logger.info("Clicked on CloudTails India");
searchResultPage.clickOnFilter();

 logger.info("Selected USB");
productDetailsPage=searchResultPage.clickOnProduct();

Thread.sleep(5000);
 logger.info("Clicked Add To Cart");
productDetailsPage.clickOnAddToCart();

 }
}