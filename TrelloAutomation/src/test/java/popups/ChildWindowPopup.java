package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Printing count of windows along with windows address
public class ChildWindowPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-facebook-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	String cw = driver.getWindowHandle();   //To print parent window address
	System.out.println(cw);                   
	Set<String> allWh = driver.getWindowHandles();
	int count=allWh.size();
	System.out.println(count);
	for (String wh : allWh) {
		System.out.println(wh);
	}
	driver.quit();
}
}
