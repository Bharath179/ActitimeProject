package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskModule {
	@FindBy(id="container_tasks")
	private WebElement taskTab;

	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement addNew;
	
	@FindBy(xpath = "//div[@class='item createNewTasks']")
	private WebElement createNewTask;
	
	@FindBy(xpath = "//tr[@class='selectCustomerRow']/following::div[@class='dropdownButton']")
	private WebElement selectDropDown;
	
	@FindBy(xpath = "(//div[text()='Our company'])[2]")
	private WebElement ourCompany;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement projectDropDown;
	
	@FindBy(xpath = "//div[text()='- Select Project -']/following::div[text()='- New Project -']/..//div[text()='Accounting']")
	private WebElement accounting;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement textfield;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createtask;


public TaskModule(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getContainerTab() {
	return taskTab;
}
public WebElement getAddNew() {
	return addNew;
}
public WebElement getCreateNewTask() {
	return createNewTask;
}
public WebElement getselectDrop() {
	return selectDropDown;
}
public WebElement getourCmpny() {
	return ourCompany;
}
public WebElement getprojectDrop() {
	return projectDropDown;
}
public WebElement getAccounting() {
	return accounting;
}
public WebElement getTextField() {
	return textfield;
}
public WebElement getCreateTask() {
	return createtask;
}
}
