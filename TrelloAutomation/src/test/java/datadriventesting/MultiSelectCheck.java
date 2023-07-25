package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCheck {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("file:///C:/Users/Lenovo/Desktop/daydropdown.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/Lenovo/Desktop/daydropdown.html");
	WebElement daydropdown = driver.findElement(By.tagName("select"));
	Select daySelect = new Select(daydropdown);
	//identify the drop down is multiSelect or not
	if(daySelect.isMultiple()) {
		System.out.println("The drop down is multiselect");
	}else{
		System.out.println("The drop down is not multiselect");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
