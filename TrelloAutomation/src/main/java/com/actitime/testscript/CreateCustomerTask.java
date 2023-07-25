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
import com.actitime.pom.TaskModule;

public class CreateCustomerTask extends BaseClass{
@Test
	public void createTask() throws EncryptedDocumentException, IOException {
		Reporter.log("createTask",true);
		FileLib f=new FileLib();
		String task = f.getExcelData2("createtask", 1, 3);
		TaskModule t=new TaskModule(driver);
		t.getContainerTab().click();
		t.getAddNew().click();
		t.getCreateNewTask().click();
		t.getselectDrop().click();
		t.getourCmpny().click();
		t.getprojectDrop().click();
		t.getAccounting().click();
		t.getTextField().sendKeys(task);
		t.getCreateTask().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getTextField(), task));
		String actualTask=t.getTextField().getText();
		Assert.assertEquals(actualTask, task);
		
		
	}
}
