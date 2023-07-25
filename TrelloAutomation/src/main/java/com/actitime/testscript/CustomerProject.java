package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.TaskTabPage;

public class CustomerProject extends BaseClass{
	@Test
public void createProject() throws EncryptedDocumentException, IOException {
	Reporter.log("createProject",true);
	FileLib f=new FileLib();
	String project = f.getExcelData("createproject", 1, 3);
	String description = f.getExcelData("createproject", 1, 4);
	TaskTabPage t=new TaskTabPage(driver);
	t.getContainerTab().click();
	t.getAddNewProject().click();
	t.getNewProject().click();
	t.getProName().sendKeys(project);
	t.getProDes().sendKeys(description);
	t.getDropdown().click();
	t.getOurCmpny().click();
	t.getCreateProject().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualProject(), project));
	String actualText=t.getActualProject().getText();
	Assert.assertEquals(actualText, project);
}
}
