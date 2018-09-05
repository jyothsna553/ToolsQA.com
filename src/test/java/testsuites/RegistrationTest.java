package testsuites;

import org.testng.annotations.Test;

import mainclasses.BaseTest;
import mainclasses.Homepage;
import mainclasses.Registrationpage;

@SuppressWarnings("unused")
public class RegistrationTest extends BaseTest {

	

	@Test(priority=0)
	 public void registration() throws Exception {
		
		Registrationpage.formFilling(); 
		 System.out.println("In Test priority 0");
		 Registrationpage ref =new Registrationpage();
		 ref.validating1();  // Values reading from config.properties file 
		// ref.validating2();
		
		 
	 }
	
	
	/*@Test(priority=1)
	 public void clickRegistrationLink() throws Exception {
		Registrationpage ref =new Registrationpage();
		ref.validating();
		 System.out.println("In Test priority 1");
	 }*/
	
}
