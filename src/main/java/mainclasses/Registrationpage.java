package mainclasses;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.PageActions;
import pageobjects.PageObjects;




public class Registrationpage extends BaseTest {
	
	public static WebDriver driver;
	  PageActions pageAct = new PageActions(driver);
      PageObjects pageObj = new PageObjects(driver);
      public static  Logger log = Logger.getLogger("devpinoyLogger");
	
	public static WebDriver formFilling() throws Exception {
		
		try {
			
			Reporter.log("=====Read Data From Property File=====", true);
			driver = BaseTest.setDriver(prop.getProperty("browserType"));
			Reporter.log("=====Broswer type selected From Property File=====", true);
			//pagesCalling();
			log.info("entring weight");
			log.debug("hello");
				System.out.println("First Test ................");
									
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return driver;
		
	}
	
	@SuppressWarnings("static-access")
	public void validating1() throws Exception { 	// Values reading from config.properties file 
		 
	
		
		Thread.sleep(2000);
		pageAct.clickk(pageObj.registration_link,"Registration");
		log.info("*************** Clicking on the Registration Link **************");
		pageAct.typing(pageObj.first_name,prop.getProperty("First_Name"));
		pageAct.typing(pageObj.last_name,prop.getProperty("Last_name"));
		pageAct.clickk(pageObj.marital_status,"married");
		pageAct.clickk(pageObj.hobby_dance,"dance");
		pageAct.clickk(pageObj.hobby_reading,"reading");
		pageAct.drop_down(pageObj.drop_down_country,"India");
		pageAct.drop_down(pageObj.dob_month,"7");
		pageAct.drop_down(pageObj.dob_day,"2");
		pageAct.drop_down(pageObj.dob_year,"1985");
		pageAct.typing(pageObj.phone_number,prop.getProperty("Phone_number"));
		pageAct.typing(pageObj.user_name,prop.getProperty("User_name"));
		pageAct.typing(pageObj.email_id,prop.getProperty("Email_ID"));
		pageAct.clickk(pageObj.choose_file,"choose_file");
		Runtime.getRuntime().exec("C:\\Users\\Smita\\Desktop\\auto1.exe");
		pageAct.typing(pageObj.text_area,prop.getProperty("Text_area"));
		pageAct.typing(pageObj.password,prop.getProperty("Password"));
		pageAct.typing(pageObj.confirm_password,"Confirm_password");
		pageAct.clickk(pageObj.submit,"dance");
		
	}
	
@SuppressWarnings("static-access")
public void validating2() throws Exception {
		 
	
		
		Thread.sleep(2000);
		pageAct.clickk(pageObj.registration_link,"Registration");
		log.info("*************** Clicking on the Registration Link **************");
		pageAct.typing(pageObj.first_name,"swetaa");
		pageAct.typing(pageObj.last_name,"Ratha8");
		pageAct.clickk(pageObj.marital_status,"married");
		pageAct.clickk(pageObj.hobby_dance,"dance");
		pageAct.clickk(pageObj.hobby_reading,"reading");
		pageAct.typing(pageObj.phone_number,String.valueOf("9292951899"));
		pageAct.typing(pageObj.user_name,"rath@saia");
		pageAct.typing(pageObj.email_id,"saiasweta@gmail.com");
		pageAct.clickk(pageObj.choose_file,"choose_file");
		Runtime.getRuntime().exec("C:\\Users\\Smita\\Desktop\\auto1.exe");
		pageAct.typing(pageObj.text_area,"Hello , Everyone present here");
		pageAct.typing(pageObj.password,"Helloall");
		pageAct.typing(pageObj.confirm_password,"Helloall");
		pageAct.drop_down(pageObj.drop_down_country,"India");
		pageAct.drop_down(pageObj.dob_month,"7");
		pageAct.drop_down(pageObj.dob_day,"2");
		pageAct.drop_down(pageObj.dob_year,"1985");
		pageAct.clickk(pageObj.submit,"dance");
		
		
	}
}
