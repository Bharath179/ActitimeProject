package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTitle {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-facebook-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allTitles = driver.getWindowHandles();
	for (String at : allTitles) {
		String alTitles = driver.switchTo().window(at).getTitle();
		System.out.println(alTitles);
		driver.close();
	}
}
}