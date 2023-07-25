package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.TaskPage;


@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
	Reporter.log("createCustomer",true);
	FileLib f = new FileLib();
	String custName = f.getExcelData1("createcustomer", 1, 3);
	String custDescription = f.getExcelData1("createcustomer", 1, 4);
	TaskPage t=new TaskPage(driver);
	t.getContainerTask().click();
	t.getAddNewBt().click();
	t.getNewCustomer().click();
	t.getEnterCustNameTbx().sendKeys(custName);
	t.getEnterCustDespTbx().sendKeys(custDescription);
	t.getSelectCustDD().click();
	t.getBibBangCompany().click();
	t.getCreateCustomerFId().click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomerFId(), custName));
	String actualText = t.getActualCustomerFId().getText();
	Assert.assertEquals(actualText, custName);
	
}
}
