package com.app.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.InventoryMaintenancePage;
import com.app.qa.pages.LoginPage;

public class InventoryMaintenancePageTest extends BaseTest{
	
	LoginPage loginPage;
	HomePage homePage;
	InventoryMaintenancePage inventoryMaintenancePage;
	
	public InventoryMaintenancePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventoryMaintenancePage = new InventoryMaintenancePage();
	}
	@Test(enabled=true)
	public void VerifyView_All_Products_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInventoryMaintainanceMenu();
		inventoryMaintenancePage.clickView_All_Products();
		String Lable1 = inventoryMaintenancePage.VerifyView_All_Products_Lable();
		Assert.assertEquals(Lable1, "Products");
		System.out.println("Verified the label "+Lable1);
		
	}
	@Test(enabled=true)
	public void VerifyView_Inventory_by_Loc_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInventoryMaintainanceMenu();
		inventoryMaintenancePage.clickView_Inventory_by_Loc();
		String Lable1 = inventoryMaintenancePage.VerifyView_Inventory_by_Loc_Lable();
		Assert.assertEquals(Lable1, "Inventory by Loc");
		System.out.println("Verified the label "+Lable1);
		
	}
	@Test(enabled=true)
	public void VerifyView_Inventory_by_Loc_Prod_and_Lot_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInventoryMaintainanceMenu();
		inventoryMaintenancePage.clickView_Inventory_by_Loc_Prod_and_Lot();
		String Lable1 = inventoryMaintenancePage.VerifyView_Inventory_by_Loc_Prod_and_Lot_Lable();
		Assert.assertEquals(Lable1, "Inv by Loc, Prod, Lot");
		System.out.println("Verified the label "+Lable1);
		
	}
	@Test(enabled=true)
	public void VerifyView_All_Cycle_Counts_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInventoryMaintainanceMenu();
		inventoryMaintenancePage.clickView_All_Cycle_Counts();
		String Lable1 = inventoryMaintenancePage.VerifyView_All_Cycle_Counts_Lable();
		Assert.assertEquals(Lable1, "Cycle Count Orders");
		System.out.println("Verified the label "+Lable1);
		
	}
	@Test(enabled=true)
	public void VerifyView_All_Containers_Utility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickInventoryMaintainanceMenu();
		inventoryMaintenancePage.clickView_All_Containers();
		String Lable1 = inventoryMaintenancePage.VerifyView_All_Containers_Lable();
		Assert.assertEquals(Lable1, "View All Containers");
		System.out.println("Verified the label "+Lable1);
		
	
	}	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

