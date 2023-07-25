package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText ="Logout")
	private WebElement logout;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
		logout.click();
	}
	
}
