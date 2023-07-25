package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> allWh = driver.getWindowHandles();
	int count=allWh.size();
	System.out.println(count);
	for (String wh : allWh) {
		System.out.println(wh);
	}
	driver.quit();
}
}
