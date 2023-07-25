package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CleartripEx {
@Test
public void trip(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMI_My1iM2XgAMVBUJ9Ch3tEwyXEAAYASAAEgJ7cfD_BwE&gclid=EAIaIQobChMI_My1iM2XgAMVBUJ9Ch3tEwyXEAAYASAAEgJ7cfD_BwE");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions a = new Actions(driver);
	// Actions b = new Actions(driver);

	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("BLR");
	WebElement from = driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']"));
	a.moveToElement(from).click().perform();

	WebElement toTextBox = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	a.moveToElement(toTextBox).click().perform();
	driver.switchTo().activeElement().sendKeys("GOI");
	WebElement to = driver.findElement(By.xpath("//p[text()='Goa, IN - Dabolim Airport (GOI)']"));// div[text()='GOI']
	a.moveToElement(to).click().perform();

	WebElement date = driver.findElement(By.xpath("(//button[@class='flex flex-middle  t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900'])[1]"));
	a.moveToElement(date).click().perform();
	driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();

	driver.findElement(By.xpath("//span[text()='Search flights']")).click();

	List<WebElement> flightNames = driver.findElements(By.xpath("//div[@class='ba bc-neutral-100 br-4 px-4 tp-box-shadow td-200 p-relative flex flex-column pt-1 hover:elevation-3 c-pointer px-6']//p[@class='fw-500 fs-2 c-neutral-900']"));
	int count = flightNames.size();
	System.out.println(count);
	List<WebElement> deptTiming = driver.findElements(By.xpath("//div[@class='ba bc-neutral-100 br-4 px-4 tp-box-shadow td-200 p-relative flex flex-column pt-1 hover:elevation-3 c-pointer px-6']//p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
	int count1 = deptTiming.size();
	System.out.println(count1);

	for (int i = 0; i < count; i++) {
		String f = flightNames.get(i).getText();
		String d = deptTiming.get(i).getText();
		System.out.println("FlIGHT NAME ====> " + f + " DEPARTURE TIMING ====> " + d);
	}

	driver.manage().window().minimize();
	driver.close();
}

	
}

