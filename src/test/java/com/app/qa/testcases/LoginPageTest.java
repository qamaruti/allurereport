package com.app.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.BaseTest;
import com.app.qa.pages.HomePage;
import com.app.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	

		LoginPage loginpage;
		HomePage homepage;
		public LoginPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			
			initilization();
			 loginpage=new LoginPage();
		}
		
		@Test
		public void loginpagetitletest() {
			String title=loginpage.validateloginpageTitle();
			Assert.assertEquals(title, "Login - Exacta Portal");
		}

		@Test
		public void loginTest() {
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
		
	}
