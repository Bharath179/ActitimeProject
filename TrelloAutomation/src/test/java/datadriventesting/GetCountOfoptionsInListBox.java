package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCountOfoptionsInListBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://wwww.facebook.com/signup");
	//Identify all dropdowns in the webpage
	List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
	//Iterate all DropDowns at a time
	for (WebElement dropdown : allDropDowns) {
		//Select only visible dropdowns in the UI
		if(dropdown.isDisplayed()) {
			Select dropDownSelect = new Select(dropdown);
			List<WebElement> allOptions = dropDownSelect.getOptions();
			System.out.println(allOptions.size());
			for (WebElement options : allOptions) {
				System.out.println(options.getText());
			}
		}
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
