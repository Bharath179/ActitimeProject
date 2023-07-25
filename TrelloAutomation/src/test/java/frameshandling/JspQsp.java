package frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JspQsp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/Page1.html");
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.id("t2")).sendKeys("Jsp");
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.findElement(By.id("t1")).sendKeys("Qsp");
}
}
