package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderEx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("APjFqb")).sendKeys("Qspiders");
	List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(.,'QSpiders')]"));
	int count=autosugg.size();
	System.out.println(count);
	for (WebElement sugg : autosugg) {
		String text = sugg.getText();
		System.out.println(text);
	}
	
}
}
