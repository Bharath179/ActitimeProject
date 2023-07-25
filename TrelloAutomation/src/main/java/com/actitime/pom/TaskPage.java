package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(id="container_tasks")
	private WebElement taskBtn;

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
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomerFId;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getContainerTask() {
		return taskBtn;
	}
	public WebElement getAddNewBt() {
		return newbutton;
	}
	public WebElement getNewCustomer() {
		return newcustomer;
	}
	public WebElement getEnterCustNameTbx() {
		return customerName;
	}
	public WebElement getEnterCustDespTbx() {
		return description;
	}
	public WebElement getSelectCustDD() {
		return dropdown;
	}
	public WebElement getBibBangCompany() {
		return company;
	}
	public WebElement getCreateCustomerFId() {
		return createcust;
	}
	public WebElement getActualCustomerFId() {
		return actualCustomerFId;
	}
}
