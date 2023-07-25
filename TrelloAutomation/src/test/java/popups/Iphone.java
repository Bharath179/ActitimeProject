package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iphone {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(.,'iphone 14 pro max')]/../.."));
	int count=allSuggestions.size();
	System.out.println(count);
	String l="null";
	for(int i=0;i<count;i++) {
		l=allSuggestions.get(i).getText();
		System.out.println(l);
	}
	
	//driver.manage().window().minimize();
	//driver.quit();
}
}
