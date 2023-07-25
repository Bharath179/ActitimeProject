package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	
	@FindBy(id="username")
	private WebElement usernametextField;
	
	@FindBy(name="pwd")
	private WebElement passwordtextField;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw) {
		usernametextField.sendKeys(un);
		passwordtextField.sendKeys(pw);
		loginBtn.click();
	}
}
