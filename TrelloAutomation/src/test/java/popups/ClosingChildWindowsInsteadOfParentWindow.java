package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingChildWindowsInsteadOfParentWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("login-facebook-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	String parentWindow = driver.getWindowHandle();
	Set<String> allWadd= driver.getWindowHandles();
	for (String add : allWadd) {
		Thread.sleep(2000);
		driver.switchTo().window(add);
		if(parentWindow.equals(add)) {
			
		}else {
			driver.close();
		}
		
	}	
}
}
