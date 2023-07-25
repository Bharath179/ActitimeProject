package frameshandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBy {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,3000)");
	//Actions a=new Actions(driver);
	//a.scrollByAmount(0, 3000).perform();
}
}
