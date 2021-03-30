
package com.valuemomentum.automation.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// element
	@FindBy(xpath = "//*[text()='Mobiles']")
	private WebElement _selectMoblies;
	 
	public SearchResultPage clickOn() {
		_selectMoblies.click();
		return new SearchResultPage(driver);
	}

}