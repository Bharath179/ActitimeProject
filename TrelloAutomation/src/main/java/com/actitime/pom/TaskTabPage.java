package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskTabPage {
@FindBy(id="container_tasks")
private WebElement taskTab;

@FindBy(xpath = "//div[@class='addNewButton']")
private WebElement addNew;

@FindBy(xpath = "//div[@class='item createNewProject']")
private WebElement newProject;

@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
private WebElement proName;

@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
private WebElement proDescription;

@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement dropDown;

@FindBy(xpath = "//div[text()='-- New Customer --']/following::div[text()='Our company']")
private WebElement ourCmpny;

@FindBy(xpath = "//div[text()='Create Project']")
private WebElement createPro;

@FindBy(xpath = "(//div[text()='Banking Project'])[2]")
private WebElement actualProject;

public TaskTabPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getContainerTab() {
	return taskTab;
}
public WebElement getAddNewProject() {
	return addNew;
}
public WebElement getNewProject() {
	return newProject;
}
public WebElement getProName() {
	return proName;
}
public WebElement getProDes() {
	return proDescription;
}
public WebElement getDropdown() {
	return dropDown;
}
public WebElement getOurCmpny() {
	return ourCmpny;
}
public WebElement getCreateProject() {
	return createPro;
}
public WebElement getActualProject() {
	return actualProject;
}
}
