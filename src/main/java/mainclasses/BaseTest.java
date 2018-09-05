package mainclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseTest {
	
	public static  WebDriver driver;
	static FileInputStream fs = null;
	public static Properties	prop = new Properties();
//	public  Logger log = Logger.getLogger("devpinoyLogger");	
	
	
public static  WebDriver setDriver(String browserType) throws Exception{
	
    fs =new FileInputStream("C:\\Users\\Smita\\eclipse-workspace\\Demo_POM\\src\\main\\resources\\utilities\\config.properties");	
		try {
			
			prop.load(fs);
		System.out.println("-----"+prop.getProperty("browserType"));
		if(prop.getProperty("browserType").equals("FireFox")){
			driver = initfirefoxdriver();
		}else if(prop.getProperty("browserType").equals("IE")){
			driver = initIEDriver();
		}else if(prop.getProperty("browserType").equals("Chrome")){
			System.out.println("here");
			driver = initchromedriver();
		}
		else {
			System.out.println("there");
			
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	
	}

	
	
		private static WebDriver initIEDriver() {
			
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEDriverPath"));
			System.out.println("launch ie");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("siteURL"));
			return driver;
		}
		
	private static WebDriver initfirefoxdriver() {
		System.setProperty("webdriver.gecko.driver",prop.getProperty("GeckoDriverPath"));
		     driver = new FirefoxDriver(); 
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.get(prop.getProperty("siteURL"));
			return driver;
	}
	
	private static WebDriver initchromedriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriverPath"));
		System.out.println("launch chromedriver");
		 driver = new ChromeDriver();
		 
		driver.get(prop.getProperty("siteURL"));
		//driver.get(prop.getProperty("URL1"));
		//pagesCalling();
		driver.manage().window().maximize();
					return driver;
	}



public void testScreenshot() throws Exception {
	//Current Date
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
	// then Augmenter will add the TakesScreenshot methods to the instance
	@SuppressWarnings("unused")
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(scrFile, new File("E:\\Selenium_Scripts\\TestNGDemo\\Screenshots"+dateFormat.format(date)+".png"));
}

public static void pagesCalling() throws Exception
{
  	
		driver.get(prop.getProperty("URL1"));
	
}


}
