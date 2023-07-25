package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphonePrice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("iphone 14"+Keys.ENTER);
	List<WebElement> productName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	int count=productName.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text= productName.get(i).getText();
		String text1=productPrice.get(i).getText();
		System.out.println(text+"------>"+text1);
	}
	driver.close();
}
}
