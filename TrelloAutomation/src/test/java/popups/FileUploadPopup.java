package popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/naukri.html");
	File file = new File("./src/test/resources/Resume.docx.docx");
	String abPath = file.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abPath);
}
}
