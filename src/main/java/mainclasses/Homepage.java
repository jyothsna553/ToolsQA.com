package mainclasses;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.PageActions;
import pageobjects.PageObjects;


public class Homepage extends BaseTest{
	
	public static WebDriver driver;
	
	PageActions pageAct = new PageActions(driver);
	PageObjects pageObj = new PageObjects(driver);
	
	public static WebDriver openPage() throws Exception {
		 Logger log = Logger.getLogger("devpinoyLogger");
		
		try {
			Reporter.log("=====Read Data From Property File=====", true);
			driver = BaseTest.setDriver(prop.getProperty("browserType"));
			Reporter.log("=====Broswer type selected From Property File=====", true);
			
			log.info("*************** Clicking on the Registration Link **************");
				System.out.println("First Test ................");
								
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return driver;

	}
	
	public static void clickOnRegistrationLink() throws Exception {
	
		Thread.sleep(2000);
		PageActions pageAct = new PageActions(driver);
		PageObjects pageObj = new PageObjects(driver);
		pageAct.clickk(pageObj.registration_link,"Registration");
		
	}

}
