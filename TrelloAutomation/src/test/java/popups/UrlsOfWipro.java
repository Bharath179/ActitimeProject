package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlsOfWipro {
public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.co.in/");
	driver.switchTo().activeElement().sendKeys("wipro jobs"+Keys.ENTER);
	driver.get("https://www.google.com/search?q=wipro+jobs");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count=allLinks.size();
	System.out.println(count);
	
	for (WebElement link : allLinks) {
		String url = link.getAttribute("href");
		System.out.println(url);
	}
	driver.quit();
}
}
