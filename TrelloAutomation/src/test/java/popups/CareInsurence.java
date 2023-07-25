package popups;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurence {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.name("dob")).click();
	WebElement month = driver.findElement(By.className("ui-datepicker-month"));
	Select selectMonthDropDown = new Select(month);
	selectMonthDropDown.selectByVisibleText("Apr");
	
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	Select selectYearhDropDown = new Select(year);
	selectYearhDropDown.selectByVisibleText("1997");
	
	driver.findElement(By.linkText("8")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	String expectedErrorMessage="Please enter valid Policy No.";
	String actualErrorMessage = driver.findElement(By.id("policynumberError")).getText();
	System.out.println(actualErrorMessage);
	if(actualErrorMessage.equals(expectedErrorMessage)) {
		System.out.println("Error message is found corect and it is verified");
	}else {
		System.out.println("Error message is found incorect and it is verified");
	}	
	driver.manage().window().minimize();
	driver.quit();
}
}

