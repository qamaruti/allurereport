package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.BaseTest;

public class UtilitiesPage extends BaseTest{

	
	@FindBy(xpath= "//li[@title='Interface Import Transactions']")
    WebElement Interface_Import_Transaction;
    @FindBy(id = "ui-id-7")
    WebElement Import_Transaction_Lable;
    @FindBy(xpath= "//li[@title='Interface Export Transactions']")
    WebElement Interface_Export_Transaction;
    @FindBy(xpath = "//a[@title='Export Transactions']")
    WebElement Export_Transaction_Lable;
    @FindBy(xpath= "//li[@title='Exacta Print Utility']")
    WebElement Exacta_Print_Utility;
    @FindBy(xpath = "//a[@title='Exacta Print Utility']")
    WebElement Exacta_Print_Utility_Lable;
    @FindBy(xpath= "//li[@title='Exacta Journal View']")
    WebElement Exacta_Journal_View;
    @FindBy(xpath = "//a[@title='Exacta Journal View']")
    WebElement Exacta_Journal_View_Lable;
    @FindBy(xpath= "//li[@title='View All Machines']")
    WebElement View_All_Machines;
    @FindBy(xpath = "//a[@title='View All Machines']")
    WebElement View_All_Machines_Lable;
    @FindBy(xpath= "//li[@title='Container Lookup Utility']")
    WebElement Container_Lookup_Utility;
    @FindBy(xpath = "//a[@title='Container Lookup Utility']")
    WebElement Container_Lookup_Utility_Lable;
    @FindBy(xpath= "//li[@title='Sort Code Configuration']")
    WebElement Sort_Code_Configuration;
    @FindBy(xpath = "//a[@title='Sort Code Configuration']")
    WebElement Sort_Code_Configuration_Lable;
    @FindBy(xpath= "//li[@title='Jackpot Lookup Utility']")
    WebElement Jackpot_Lookup_Utility;
    @FindBy(xpath = "//a[@title='Jackpot Lookup Utility']")
    WebElement Jackpot_Lookup_Utility_Lable;
    @FindBy(xpath= "//li[@title='Reason Configuration']")
    WebElement Reason_Configuration;
    @FindBy(xpath = "//a[@title='Reason Configuration']")
    WebElement Reason_Configuration_Utility_Lable;
    
    
    public UtilitiesPage() {
		PageFactory.initElements(driver, this);
	}
    public void clickInterface_Import_Transaction() {
    	Interface_Import_Transaction.click();
    }
    public String VerifyInterface_Import_Transaction_Lable() {
    	return Import_Transaction_Lable.getText();
    }
    public void clickInterface_Export_Transaction() {
    	Interface_Export_Transaction.click();
    }
    public String VerifyInterface_Export_Transaction_Lable() {
    	return Export_Transaction_Lable.getText();
    }
    public void clickExacta_Print_Utility() {
    	Exacta_Print_Utility.click();
    }
    public String VerifyExacta_Print_Utility_Lable() {
    	return Exacta_Print_Utility_Lable.getText();
    }
    public void clickExacta_Journal_View() {
    	Exacta_Journal_View.click();
    }
    public String VerifyExacta_Journal_View_Lable() {
    	return Exacta_Journal_View_Lable.getText();
    }
    public void clickView_All_Machines() {
    	View_All_Machines.click();
    }
    public String VerifyView_All_Machines_Lable() {
    	return View_All_Machines_Lable.getText();
    }
    public void clickContainer_Lookup_Utility() {
    	Container_Lookup_Utility.click();
    }
    public String VerifyContainer_Lookup_Utility_Lable() {
    	return Container_Lookup_Utility_Lable.getText();
    }
    public void clickSort_Code_Configuration() {
    	Sort_Code_Configuration.click();
    }
    public String VerifySort_Code_Configuration_Lable() {
    	return Sort_Code_Configuration_Lable.getText();
    }
    public void clickJackpot_Lookup_Utiliy() {
    	Jackpot_Lookup_Utility.click();
    }
    public String VerifyJackpot_Lookup_Utility_Lable() {
    	return Jackpot_Lookup_Utility_Lable.getText();
    }
    public void clickReason_Configuration() {
    	Reason_Configuration.click();
    }
    public String VerifyReason_Configuration_Lable() {
    	return Reason_Configuration_Utility_Lable.getText();
    }
    
}
