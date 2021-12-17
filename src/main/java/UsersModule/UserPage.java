//package UsersModule;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//import mu.utilities.CommonUtilities;
//
//
//public class UserPage extends mu.testCases.TestBaseClass
//{
//	public UserPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	String useremail1=" ";
//	mu.utilities.CommonUtilities cu=new mu.utilities.CommonUtilities();
//
//	
//	@FindBy (xpath="//span[text()='Users']")
//			WebElement userTab;
//	
//	@FindBy (xpath="//*[text()='Create User ']")
//		WebElement createuser;
//	
//	@FindBy(xpath="//*[@id='email']")
//		WebElement useremail;
//	
//	@FindBy(xpath="//button[text()='Create User']")
//		WebElement createUserButton;
//	
//	public void userTabClick()
//	{
//		try 
//		{
//			System.out.println("");
//			Thread.sleep(2000);
//			userTab.click();
//			logger.info("");
//		} 
//		catch (Exception e)
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//		}
//	}
//	public void createNewUser()
//	{
//		try 
//		{
//			createuser.click();
//			logger.info("");
//		}
//		catch (Exception e) 
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//		}
//	}
//	public void userform(String email)
//	{
//		try 
//		{
//			CommonUtilities.changewindow(driver);
//			useremail1=email;
//			useremail.sendKeys(email);
//			logger.info(" method");
//		}
//		catch (Exception e)
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//		}
//	}
//	public void psroalButton()
//	{
//		try 
//		{
//			List<WebElement> li =driver.findElements());
//			li.get(1).click();
//			logger.info(" "+useremail1);
//		}
//		catch (Exception e)
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//		}
//		
//	}
//	public void pmroalButton()
//	{
//		try 
//		{
//			List<WebElement> li = driver.findElements("");
//			li.get(1).click();
//			logger.info(" "+);
//		} 
//		catch (Exception e) 
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//
//		}
//	}
//
//	public void createNewUserButton()
//	{
//		try 
//		{
//			createUserButton.click();
//			boolean value = cu.isdisplay("");
//			System.out.println(""+value);
//			Assert.assertEquals(false, value);
//
//		}
//		catch (Exception e)
//		{
//			// TODO: handle exception
//			logger.info("Error"+e);
//
//		}
//	}
//}
//
