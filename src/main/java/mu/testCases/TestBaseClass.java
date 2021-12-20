package mu.testCases;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.ConfigurationSpi;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import utilities.ConfigReader;


/**
 * This is the Base class for the framework.
 * @author HP
 *
 */
public class TestBaseClass 
{
	ConfigReader config=new ConfigReader();
	public String baseURL =ConfigReader.getURL();
	public static SoftAssert assertt = new SoftAssert();
	public static  WebDriver driver;
	
	
	boolean status = false;
	public static Logger logger=LogManager.getLogger(TestBaseClass.class);
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	
	/**
	 * Launch multiple browser(Chrome, Edge, FireFox and Safari)
	 * @param br
	 * @throws InterruptedException
	 */
	
	public void setUp(String br) throws InterruptedException
	{
	//	logger=LogManager.getLogger(TestbaseClass.class);
		System.out.println("@BeforeClass" +br);
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			logger.info("Chrome Browser is Open");
		
		}
		else if(br.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			Thread.sleep(1500);
			logger.info("FireFox Browser is Open");
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			Thread.sleep(1500);
			logger.info("ChromeBrowser is Open");
		}
		else if(br.equalsIgnoreCase("Safari"))
		{
			
			//WebDriverManager.sa
			driver=new SafariDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		logger.info("URL is Open");
		driver.get(baseURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/**
	 *Close all open browser after each class.
	 */
	
//	@AfterMethod(alwaysRun = true)
//	public void tearDown()
//	{
//		System.out.println("@AfterClass");
//		driver.quit();
//	}
}
