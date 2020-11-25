package com.CodingBook.mvn_ta_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchMainPage extends BasePage {
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchElement; 
	
	public GoogleSearchMainPage(WebDriver driver) {
		super(driver);
	}
	
	public void go() {
		driver.get("http://www.google.com");
	}

	
	public WebElement getSearchText() {
		return searchElement;
	}

}
