package pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageActions extends PageObjects {

	Logger log = Logger.getLogger("devpinoyLogger");

	public PageActions(WebDriver driver) {
		super(driver);
	}

	
	public void clickk(WebElement ele, String msg) {
		System.out.println("In click method");
		ele.click();		
		
		log.info("Clicked on "+msg);

	}
	
	public void typing(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);
		log.info("successfully entered the value  "+msg);
	}
	
	public void type(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);
		log.info("successfully entered the value  "+msg);
	}
	
	
	public void drop_down(WebElement ele, String value) {
		System.out.println("In drop down method");
		
		Select s = new Select(ele);
		s.selectByValue(value);
		
	}

	public String check_text_value(WebElement ele) {
		System.out.println("read the text");
		String text=ele.getText();
		
		log.info("successfully read the value " +text);
		return text;
	}

	
		
	

}
