package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.BaseTest;

public class InventoryMaintenancePage extends BaseTest{


	@FindBy(xpath= "//li[@title='View All Products']")
    WebElement View_All_Products;
    @FindBy(xpath = "//a[@title='Products']")
    WebElement View_All_Products_Lable;
	@FindBy(xpath= "//li[@title='View Inventory by Loc']")
    WebElement View_Inventory_by_Loc;
    @FindBy(xpath = "//a[@title='Inventory by Loc']")
    WebElement View_Inventory_by_Loc_Lable;
	@FindBy(xpath= "//li[@title='View Inventory by Loc, Prod and Lot']")
    WebElement View_Inventory_by_Loc_Prod_and_Lot;
    @FindBy(xpath = "//a[@title='Inv by Loc, Prod, Lot']")
    WebElement View_Inventory_by_Loc_Prod_and_Lot_Lable;
	@FindBy(xpath= "//li[@title='View All Cycle Counts']")
    WebElement View_All_Cycle_Counts;
    @FindBy(xpath = "//a[@title='Cycle Count Orders']")
    WebElement View_All_Cycle_Counts_Lable;
	@FindBy(xpath= "//li[@title='View All Containers']")
    WebElement View_All_Containers;
    @FindBy(xpath = "//a[@title='View All Containers']")
    WebElement View_All_Containers_Lable;
    
    
    
    public InventoryMaintenancePage() {
		PageFactory.initElements(driver, this);
	}
    public void clickView_All_Products() {
    	View_All_Products.click();
    }
    public String VerifyView_All_Products_Lable() {
    	return View_All_Products_Lable.getText();
    }
    public void clickView_Inventory_by_Loc() {
    	View_Inventory_by_Loc.click();
    }
    public String VerifyView_Inventory_by_Loc_Lable() {
    	return View_Inventory_by_Loc_Lable.getText();
    }
    public void clickView_Inventory_by_Loc_Prod_and_Lot() {
    	View_Inventory_by_Loc_Prod_and_Lot.click();
    }
    public String VerifyView_Inventory_by_Loc_Prod_and_Lot_Lable() {
    	return View_Inventory_by_Loc_Prod_and_Lot_Lable.getText();
    }
    public void clickView_All_Cycle_Counts() {
    	View_All_Cycle_Counts.click();
    }
    public String VerifyView_All_Cycle_Counts_Lable() {
    	return View_All_Cycle_Counts_Lable.getText();
    }
    public void clickView_All_Containers() {
    	View_All_Containers.click();
    }
    public String VerifyView_All_Containers_Lable() {
    	return View_All_Containers_Lable.getText();
    }
    
}
