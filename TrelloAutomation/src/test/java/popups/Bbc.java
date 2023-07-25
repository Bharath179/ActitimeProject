package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bbc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	List<WebElement> latestNews = driver.findElements(By.xpath("//h2[text()='Latest Business News']/.."));
    int count=latestNews.size();
	System.out.println(count);
	for (WebElement news : latestNews) {
		String text=news.getText();
		System.out.println(text);
	}
	/*for(int i=0;i<latestNews.size();i++) {
		System.out.println(latestNews.get(i).getText());
	}
	driver.quit();*/
}
}
