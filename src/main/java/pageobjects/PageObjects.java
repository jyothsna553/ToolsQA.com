package pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	

	public WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");

	public PageObjects(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[ text()= 'Registration']")
	public   WebElement registration_link;
	
	@FindBy(linkText = "Draggable")
	public WebElement draggable_link;
	
	@FindBy(linkText = "Droppable")
	public WebElement droppable_link;
	
	@FindBy(linkText = "Resizable")
	public WebElement resizable_link;
	
	@FindBy(linkText = "Selectable")
	public WebElement selectable_link;
	
	@FindBy(linkText = "Sortable")
	public WebElement sortable_link;
	
	@FindBy(linkText = "Accordion")
	public WebElement accordion_link;
	
	@FindBy(linkText = "Autocomplete")
	public WebElement autocomplete_link;
	
	@FindBy(linkText = "Datepicker")
	public WebElement datepicker_link;
	
	@FindBy(linkText = "Menu")
	public WebElement menu_link;
	
	@FindBy(linkText = "Slider")
	public WebElement slider_link;
	
	@FindBy(linkText = "Tabs")
	public WebElement tabs_link;
	
	@FindBy(linkText = "Tooltip")
	public WebElement tooltip_link;
	
	@FindBy(linkText = "Frames and windows")
	public WebElement frames_and_windows_link;
	
	@FindBy(xpath = "//input[@id='name_3_firstname']")
	public static  WebElement first_name;
	
	@FindBy(xpath = "//input[@id ='name_3_lastname']")
	public static  WebElement last_name;
	
	@FindBy(xpath = "//input[@value ='married']")
	public static  WebElement marital_status;
	
	@FindBy(xpath = "//input[@value ='dance']")
	public static  WebElement hobby_dance;
	
	@FindBy(xpath = "//input[@value ='reading']")
	public static  WebElement hobby_reading;
	
	@FindBy(xpath = "//input[@id ='phone_9']")
	public static  WebElement phone_number;
	
	@FindBy(xpath = "//input[@id='username']")
	public static  WebElement user_name;
	
	@FindBy(xpath = "//input[@id='email_1']")
	public static  WebElement email_id;
	
	@FindBy(xpath = "//textarea[@name='description']")
	public static  WebElement text_area;
	
	@FindBy(xpath = "//input[@id='password_2']")
	public static  WebElement password;
	
	@FindBy(xpath = "//input[@id='confirm_password_password_2']")
	public static  WebElement confirm_password;
	
	@FindBy(xpath = "//input[@name='pie_submit']")
	public static  WebElement submit;
	
	@FindBy(xpath = "//select[@id= 'dropdown_7']")
	public static  WebElement drop_down_country;
	
	@FindBy(xpath = "//select[@id= 'mm_date_8']")
	public static  WebElement dob_month;
	
	@FindBy(xpath = "//select[@id= 'dd_date_8']")
	public static  WebElement dob_day;
	
	@FindBy(xpath = "//select[@id= 'yy_date_8']")
	public static  WebElement dob_year;
	
	@FindBy(xpath = "//input[@id='profile_pic_10']")
	public static  WebElement choose_file;
	
	
}
