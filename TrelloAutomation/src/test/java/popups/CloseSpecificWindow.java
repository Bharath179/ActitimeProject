package popups;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the title which you want to close");
	String expectedTitle = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-facebook-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWadd= driver.getWindowHandles();
	for (String add : allWadd) {
		driver.switchTo().window(add);
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {	
			driver.close();
		}
			
}
}
}
