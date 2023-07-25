package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptions {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/Lenovo/Desktop/daydropdown.html");
	WebElement daydropdown = driver.findElement(By.tagName("select"));
	Select daySelect = new Select(daydropdown);
	daySelect.selectByIndex(0);
	daySelect.selectByIndex(1);
	daySelect.selectByIndex(2);
	List<WebElement> allSelectedOptions = daySelect.getAllSelectedOptions();
	System.out.println(allSelectedOptions.size());
	for (WebElement selectedOptions : allSelectedOptions) {
		System.out.println(selectedOptions.getText());
	}
	Thread.sleep(5000);
	//daySelect.deselectByIndex(0);
	//daySelect.deselectByIndex(1);
	//daySelect.deselectByIndex(2);
	//daySelect.deselectByIndex(5);
	driver.manage().window().minimize();
	driver.quit();
}
}
