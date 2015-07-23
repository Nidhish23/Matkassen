// <summary>
//     Test Base 
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>

package Utility;

import java.io.File;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pageObjects.MasterPage;
import test.Core.*;

public  class TestBase {
	
	 
	public static  WebDriver driver=null;
	static WebdriverFactory   driverFactory = new WebdriverFactory();
	  public static StringBuffer verificationErrors = new StringBuffer();
	
	  Action Action ;
	 
	  @BeforeSuite
	  public static void BeforeSuit()
	  {
		
		
		
	  }
	
	@BeforeTest
	@Parameters({"Browser"})
	 

	public static void beforeTest(@Optional String Browser) {
		
		new Log("error");
		if (Browser==null)
		{
		
		driver = driverFactory.getDriver(Configuration.browser(),Configuration.SeleniumServer(),Configuration.ServerPort());
		}
		else
		{
		driver = driverFactory.getDriver(Browser,Configuration.SeleniumServer(),Configuration.ServerPort());
		}
		 new Action(driver);
		// System.out.println(driver);
		 driver.manage().window().maximize(); 
	  }
	  
	  @AfterTest
	  public static void afterTest()
	  {
		  driver.manage().deleteAllCookies();
		  driver.quit();
		    String verificationErrorString = Log.verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      Assert.fail(verificationErrorString);
		    }
	  }
	  

	  }
	

