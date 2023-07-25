package popups;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args){
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
//driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
driver.findElement(By.linkText("About your actiTIME")).click();
driver.findElement(By.linkText("Read Service Agreement")).click();
String ExpectedTitle="actiTIME Online Terms of Service";
Set<String> add = driver.getWindowHandles();
for (String s : add) {
	driver.switchTo().window(s);
	String ActualTitle = driver.getTitle();
	if(ActualTitle.equals(ExpectedTitle)) {
		List<WebElement> headings = driver.findElements(By.tagName("h2"));
		for (WebElement hd : headings) {
			System.out.println(hd.getText());
		}
		driver.quit();
	}
}

}
}
