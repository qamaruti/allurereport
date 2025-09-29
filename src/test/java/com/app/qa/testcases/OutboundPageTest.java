package com.app.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.LoginPage;
import com.app.qa.pages.OutboundPage;

public class OutboundPageTest extends BaseTest{

	
	LoginPage loginPage;
	HomePage homePage;
	OutboundPage outboundPage;
	
	
	public OutboundPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    outboundPage = new OutboundPage();
	}
	@Test(enabled=true)
	public void VerifyView_All_Pick_Orders_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickOutboundMenu();
		outboundPage.clickView_All_Pick_Orders();
		String Lable1 = outboundPage.VerifyView_All_Pick_Orders_Lable();
		Assert.assertEquals(Lable1, "View All Pick Orders");
		System.out.println("Verified the label "+Lable1);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
