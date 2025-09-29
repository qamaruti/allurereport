package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.BaseTest;

public class UsersandGroupsPage extends BaseTest{
	@FindBy(xpath= "//li[@title='View All Users']")
    WebElement View_All_Users;
    @FindBy(xpath = "//a[@title='View All Users']")
    WebElement View_All_Users_Lable;
    @FindBy(xpath= "//li[@title='View All Groups']")
    WebElement View_All_Groups;
    @FindBy(xpath = "//a[@title='View All Groups']")
    WebElement View_All_Groups_Lable;
    
    
    public UsersandGroupsPage() {
		PageFactory.initElements(driver, this);
	}
    public void clickView_All_Users() {
    	View_All_Users.click();
    }
    public String VerifyView_All_Users_Lable() {
    	return View_All_Users_Lable.getText();
    }
    public void clickView_All_Groups() {
    	View_All_Groups.click();
    }
    public String VerifyView_All_Groups_Lable() {
    	return View_All_Groups_Lable.getText();
    }

}
