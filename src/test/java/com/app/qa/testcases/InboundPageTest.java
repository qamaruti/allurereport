package com.app.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.InboundPage;
import com.app.qa.pages.LoginPage;

public class InboundPageTest extends BaseTest{

	
	LoginPage loginPage;
	HomePage homePage;
	InboundPage inboundPage;
	
	
	public InboundPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inboundPage = new InboundPage();
	}
	@Test(enabled=true)
	public void VerifyView_All_Putaway_Orders_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInboundMenu();
		inboundPage.clickView_All_Putaway_Orders();
		String Lable1 = inboundPage.VerifyView_All_Putaway_Orders_Lable();
		Assert.assertEquals(Lable1, "View All Putaway Orders");
		System.out.println("Verified the label "+Lable1);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
