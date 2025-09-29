package com.app.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {


	  public static WebDriver driver;
	  public static Properties prop;
	 
		  public BaseTest() {
		  try {
			  prop = new Properties();
			  FileInputStream ip = new FileInputStream("C:\\Users\\mkokane\\eclipse-workspace\\practice1\\ExactaApp\\src\\main\\java\\com\\app\\qa\\config\\config.properties");
			  prop.load(ip);
		  }
		  catch(FileNotFoundException e) {
			  
			  e.printStackTrace();
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
		  }
		  public static void initilization() {
			  
			  String browsername= prop.getProperty("browser");
			  if(browsername.equalsIgnoreCase("Chrome")) {
				 driver= new ChromeDriver();
			  }
			  else if(browsername.equalsIgnoreCase("Firefox")) {
				  driver= new FirefoxDriver();
			  }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get(prop.getProperty("SanMar_url"));
		  }
		  
	  }
		
