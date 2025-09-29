package com.app.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.LoginPage;
import com.app.qa.pages.UtilitiesPage;

public class UtilitiesPageTest extends BaseTest {
	
	LoginPage loginPage;
	HomePage homePage;
	UtilitiesPage utilitiesPage;

	public UtilitiesPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		utilitiesPage = new UtilitiesPage();
	
	}
	@Test(enabled=true)
	public void VerifyInterface_Import_Transaction_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickInterface_Import_Transaction();
		String Lable1 = utilitiesPage.VerifyInterface_Import_Transaction_Lable();
		Assert.assertEquals(Lable1, "Import Transactions");
		System.out.println("Verified the label "+Lable1);
		
	}
	@Test(enabled=true)
	public void VerifyInterface_Export_Transaction_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickInterface_Export_Transaction();
		String Lable2 = utilitiesPage.VerifyInterface_Export_Transaction_Lable();
		Assert.assertEquals(Lable2, "Export Transactions");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyExacta_Print_Utility_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickExacta_Print_Utility();
		String Lable2 = utilitiesPage.VerifyExacta_Print_Utility_Lable();
		Assert.assertEquals(Lable2, "Exacta Print Utility");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyExacta_Journal_View_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickExacta_Journal_View();
		String Lable2 = utilitiesPage.VerifyExacta_Journal_View_Lable();
		Assert.assertEquals(Lable2, "Exacta Journal View");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyView_All_Machines_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickView_All_Machines();
		String Lable2 = utilitiesPage.VerifyView_All_Machines_Lable();
		Assert.assertEquals(Lable2, "View All Machines");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyContainer_Lookup_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickContainer_Lookup_Utility();
		String Lable2 = utilitiesPage.VerifyContainer_Lookup_Utility_Lable();
		Assert.assertEquals(Lable2, "Container Lookup Utility");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifySort_Code_Configuration_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickSort_Code_Configuration();
		String Lable2 = utilitiesPage.VerifySort_Code_Configuration_Lable();
		Assert.assertEquals(Lable2, "Sort Code Configuration");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyJackpot_Lookup_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickJackpot_Lookup_Utiliy();
		String Lable2 = utilitiesPage.VerifyJackpot_Lookup_Utility_Lable();
		Assert.assertEquals(Lable2, "Jackpot Lookup Utility");
		System.out.println("Verified the label "+Lable2);
		
	}
	@Test(enabled=true)
	public void VerifyReason_Configuration_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickUtilitiesMenu();
		utilitiesPage.clickReason_Configuration();
		String Lable2 = utilitiesPage.VerifyReason_Configuration_Lable();
		Assert.assertEquals(Lable2, "Reason Configuration");
		System.out.println("Verified the label "+Lable2);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
