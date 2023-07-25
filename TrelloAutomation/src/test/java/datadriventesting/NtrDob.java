package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NtrDob {
private static final char[] Day = null;
private static final char[] Month = null;
private static final char[] Year = null;

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify all dropdowns in the webpage
	List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
	//iterate the dropdowns
	for (WebElement dropdown : allDropDowns) {
		//select the visible one
		if(dropdown.isDisplayed()) {
			Select dropdownSelect = new Select(dropdown);
			if(dropdown.getAttribute("title").equals("Day")) {
				dropdownSelect.selectByVisibleText("20");
				}else if(dropdown.getAttribute("title").equals("Month")) {
					dropdownSelect.selectByVisibleText("May");
				}else if(dropdown.getAttribute("title").equals("Year")) {
					dropdownSelect.selectByVisibleText("1983");
					dropdownSelect.selectByValue("1983");
				}
		}
		
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
