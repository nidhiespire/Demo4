package LoginModule;
import java.util.concurrent.TimeUnit;
import mu.testCases.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBaseClass

{

mu.utilities.CommonUtilities cu=new mu.utilities.CommonUtilities();

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
			
							
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Exception"+e);
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
			
		
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Exception"+e);
		}
		
	}
	
	public void setPassword(String password)
	{	
		try 
		{
			//CommonUtilities.waitForElementToBeClickable(driver, pword, 2000);
			System.out.println("Entered Password");
			pword.sendKeys(password);
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
			
			System.out.println("submitted sucessfully");
			}
			
	
		catch (Exception e)
		{
			System.out.println("not able to submit");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		}
		
	}
}