package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.BaseTest;

public class InboundPage extends BaseTest{

	
	@FindBy(xpath= "//li[@title='View All Putaway Orders']")
    WebElement View_All_Putaway_Orders;
    @FindBy(xpath = "//a[@title='View All Putaway Orders']")
    WebElement View_All_Putaway_Orders_Lable;
    
    public InboundPage() {
		PageFactory.initElements(driver, this);
	}
    public void clickView_All_Putaway_Orders() {
    	View_All_Putaway_Orders.click();
    }
    public String VerifyView_All_Putaway_Orders_Lable() {
    	return View_All_Putaway_Orders_Lable.getText();
    }
}
