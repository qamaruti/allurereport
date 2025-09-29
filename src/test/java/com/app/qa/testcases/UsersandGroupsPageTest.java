package com.app.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.LoginPage;
import com.app.qa.pages.UsersandGroupsPage;

public class UsersandGroupsPageTest extends BaseTest{

		LoginPage loginPage;
		HomePage homePage;
		UsersandGroupsPage usersandGroupsPage;
		
		public UsersandGroupsPageTest() {
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {
			initilization();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			usersandGroupsPage = new UsersandGroupsPage();
		}
		@Test(enabled=true)
		public void VerifyView_All_Users_Utility() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			homePage.clickUsersandGroupsMenu();
			usersandGroupsPage.clickView_All_Users();
			String Lable1 = usersandGroupsPage.VerifyView_All_Users_Lable();
			Assert.assertEquals(Lable1, "View All Users");
			System.out.println("Verified the label "+Lable1);
			
		}
		@Test(enabled=false)
		public void VerifyView_All_Groups_Utility() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			homePage.clickUsersandGroupsMenu();
			usersandGroupsPage.clickView_All_Groups();
			String Lable1 = usersandGroupsPage.VerifyView_All_Groups_Lable();
			Assert.assertEquals(Lable1, "View All Groups");
			System.out.println("Verified the label "+Lable1);
			
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
	}
