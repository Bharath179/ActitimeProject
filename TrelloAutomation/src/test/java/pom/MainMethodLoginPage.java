package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodLoginPage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/");
	LoginPage l = new LoginPage(driver);
	l.setLogin("admin1", "manager1");
	Thread.sleep(2000);
	l.setLogin("admin", "manager");
}
}
