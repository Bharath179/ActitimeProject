package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCurrentTab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String tab = driver.getWindowHandle();
	Set<String> title = driver.getWindowHandles();
	for (String wh : title) {
		driver.switchTo().window(wh);
		if(tab.equals(wh)) {
			driver.close();
		}else {
			//driver.close();
		}
}
}
}
