package com.valuemomentum.automation.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductDetailsPage extends BasePage {

 public ProductDetailsPage(WebDriver driver) {
super(driver);
}

 @FindBy(id ="add-to-cart-button")
private WebElement _btnAddToCart;

 public void clickOnAddToCart() {

	 _btnAddToCart.click();
}

}