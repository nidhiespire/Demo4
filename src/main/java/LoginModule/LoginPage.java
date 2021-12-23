package LoginModule;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mu.testCases.TestBaseClass;
import mu.utilities.CommonUtilities;

public class LoginPage extends TestBaseClass

{

CommonUtilities cu=new CommonUtilities();

	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="account")
	WebElement acc;
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement sub;
	@FindBy(id="_ipEmlLgn")
	WebElement username;
	

	@FindBy(id="searchinput")
	WebElement pword;
	
	@FindBy(xpath="//span[contains(text(),'NETGEAR Sign In')]")
//@FindBy(id="Login-btn")
	WebElement submit;
	public void clickaccount()
	{
		try 
		{
			acc.click();
			System.out.println("Clicked on Account Sucessfully");

							
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Error while clicked on Account"+e);
		}
		
	}
	
	
	public void sig()
	{
		try 
		{
			
			sub.click();
			Thread.sleep(1000);
		
							
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Exception"+e);
		}
	}
		

	

	
	
		
	public void setUserName(String uname)
	{
		try 
		{
			
		
			
			System.out.println("Entered Username");
			username.sendKeys(uname);
			System.out.println("User name entered sucessfully");

		
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Error"+e);
		}
		
	}
	
	public void setPassword(String password)
	{	
		try 
		{
			//CommonUtilities.waitForElementToBeClickable(driver, pword, 2000);
			System.out.println("Entered Password");
			pword.sendKeys(password);
			System.out.println("Password  entered sucessfully");
			Thread.sleep(3000);
			
		
		} 
		catch (Exception e)
		{
			System.out.println("Exception"+e);
			logger.info("Exception"+e);
		}
		
	}

	public void clickOnSubmit()
	{
		try 
		{
			
			
			cu.javascriptClick(submit, driver);
		
			
			mu.utilities.Screenshotcapture.captureAsImage(driver, "browser");
			
			System.out.println("Logged in credentrail submitted sucessfully");
			}
			
	
		catch (Exception e)
		{
			logger.info("Exception"+e.getMessage());
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		}
		
	}
	
	
}