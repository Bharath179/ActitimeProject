package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(id="container_tasks")
	private WebElement container;
	
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement newbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[text()='- Select Customer -']/following::div[text()='Big Bang Company']")
	private WebElement company;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcust;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTask(String name,String des) {
		container.click();
		newbutton.click();
		newcustomer.click();
		customerName.sendKeys(name);
		description.sendKeys(des);
		dropdown.click();
		company.click();
		createcust.click();
	}
}
