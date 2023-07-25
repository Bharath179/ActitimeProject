package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabsExceptCurrentTab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> title = driver.getWindowHandles();
	for (String wh : title) {
		String allTitles = driver.switchTo().window(wh).getTitle();
		System.out.println(allTitles);
	}
	driver.quit();
}
}
