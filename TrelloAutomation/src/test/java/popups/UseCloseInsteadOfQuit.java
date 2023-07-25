package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Closing all the browsers using Close() instead of Quit()

public class UseCloseInsteadOfQuit {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-facebook-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWadd= driver.getWindowHandles();
	for (String add : allWadd) {
		driver.switchTo().window(add);
		Thread.sleep(2000);
		driver.close();
	}
}
}
