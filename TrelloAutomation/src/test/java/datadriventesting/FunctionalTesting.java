package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalTesting {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
	for (WebElement dropdown : allDropDowns) {
		if(dropdown.isDisplayed()) {
			Select dropDownSelect = new Select(dropdown);
			List<WebElement> allOptions = dropDownSelect.getOptions();
			for (WebElement options : allOptions) {
				if(dropdown.getAttribute("title").equals("Day")) {
					dropDownSelect.selectByVisibleText(options.getText());
					if(options.isSelected()) {
						System.out.println(options.getText()+" is selected");
					}else {
						System.out.println(options.getText()+" is notselected");
						}
					}else if(dropdown.getAttribute("title").equals("Month")) {
						dropDownSelect.selectByVisibleText(options.getText());
						if(options.isSelected()) {
							System.out.println(options.getText()+" is selected");
						}else {
							System.out.println(options.getText()+" is notselected");
							}
						}else if(dropdown.getAttribute("title").equals("Year")) {
							dropDownSelect.selectByVisibleText(options.getText());
							if(options.isSelected()) {
								System.out.println(options.getText()+" is selected");
					}else {
						System.out.println(options.getText()+" is notselected");
}
}
		}
		}
}
	driver.manage().window().minimize();
	driver.quit();
}
}

