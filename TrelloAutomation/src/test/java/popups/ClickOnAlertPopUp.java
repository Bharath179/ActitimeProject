package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnAlertPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	alert.accept();
	System.out.println(text);
	driver.close();
	
}
}
