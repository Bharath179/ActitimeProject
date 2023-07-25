package popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HealthCare {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
	for (WebElement dropdown : allDropdowns) {
		if(dropdown.isDisplayed()) {
			Select dropdownSelect = new Select(dropdown);
		if(dropdown.getAttribute("aria-label").equals("Select month")) {
			dropdownSelect.selectByValue("3");
		}
		else if(dropdown.getAttribute("aria-label").equals("Select year")) {
			dropdownSelect.selectByValue("1997");
		}
	}
		}
	driver.findElement(By.linkText("8")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
}
}
