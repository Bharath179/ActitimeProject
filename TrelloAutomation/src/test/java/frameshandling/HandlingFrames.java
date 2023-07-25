package frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/Lenovo/Desktop/Page1.html");
Thread.sleep(3000);
driver.findElement( By.id("t1")).sendKeys("Bharath");
driver.switchTo().frame("f1");
Thread.sleep(3000);
driver.findElement( By.id("t2")).sendKeys("Civil");
Thread.sleep(3000);
driver.switchTo().parentFrame();
driver.findElement( By.id("t1")).sendKeys("Kumar");
Thread.sleep(3000);
driver.manage().window().minimize();
driver.quit();




	}

}
