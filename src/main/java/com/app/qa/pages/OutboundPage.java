package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.BaseTest;

public class OutboundPage extends BaseTest{

	
	@FindBy(xpath= "//li[@title='View All Pick Orders']")
    WebElement View_All_Pick_Orders;
    @FindBy(xpath = "//a[@title='View All Pick Orders']")
    WebElement View_All_Pick_Orders_Lable;
    
    public OutboundPage() {
		PageFactory.initElements(driver, this);
	}
    public void clickView_All_Pick_Orders() {
    	View_All_Pick_Orders.click();
    }
    public String VerifyView_All_Pick_Orders_Lable() {
    	return View_All_Pick_Orders_Lable.getText();
    }
}
