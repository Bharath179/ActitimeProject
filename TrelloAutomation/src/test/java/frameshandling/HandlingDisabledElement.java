package frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/DisabledElement.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	RemoteWebDriver r=(RemoteWebDriver) driver;
	r.executeScript("document.getElementById('d2').value='manager'");
	Thread.sleep(5000);
	r.executeScript("document.getElementById('d2').value=''");
	
}
}
