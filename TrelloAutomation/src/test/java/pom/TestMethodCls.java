package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
@Test
public void validLogin() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	SigninPage signin=new SigninPage(driver);
	signin.setLogin("admin", "manager");
	TaskPage task=new TaskPage(driver);
	task.setTask("HDFC_0001", "Banking Project");
	LogoutPage lgout=new LogoutPage(driver);
	Thread.sleep(4000);
	lgout.setLogout();
	driver.close();
}
}
