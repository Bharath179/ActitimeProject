package popups;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	driver.findElement(By.partialLinkText("Resources")).click();
	driver.findElement(By.partialLinkText("Customers")).click();
	WebElement loginButton = driver.findElement(By.id("loginspan"));
	Actions actions=new Actions(driver);
	actions.doubleClick(loginButton).perform();
    String aTitle=driver.getTitle();
	String eTitle="Login - Vtiger";
	System.out.println("Loginpage title is " + aTitle);
	if(aTitle.equals(eTitle)) {
		System.out.println("Pass: The Login title found correct and it is verified");
	}else {
		System.out.println("Fail: The Login title found incorrect and it is verified");
	}
	driver.close();
	
	
}

}
