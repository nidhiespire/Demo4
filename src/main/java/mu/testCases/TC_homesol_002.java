package mu.testCases;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginModule.LoginPage;
import mu.utilities.ConfigReader;



public class TC_homesol_002 extends TestBaseClass
{

	ConfigReader config=new ConfigReader();
	@Parameters("browser")
		@Test(enabled=true,priority=3)
	
	public void housesolutionTab_test() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
	{
		HomeSolutionModule.homewifi _wifi=new HomeSolutionModule.homewifi();
		_wifi.housesolutionTab();
		_wifi.display_productqty();
		_wifi.Addtocart();
	
	
			
//_wifi.checkout();
		}
		
	
//	
//	@Test(enabled=true,priority=3)
//	public void loginTestL() throws InterruptedException
//	{
//		System.out.println("LoginPage");
//		LoginPage lp = new LoginPage();
//		System.out.println(config.getLusername());
//		lp.setUserName(config.getLusername());
//		//Thread.sleep(2000);
//	//	lp.clickOnNext();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//
//	}
//	
//	@Test(enabled=true)
//	public void loginTestAO() throws InterruptedException
//	{
//		System.out.println("LoginPage");
//		LoginPage lp = new LoginPage();
//		System.out.println(config.getAOusername());
//		lp.setUserName(config.getAOusername());
//		//lp.clickOnNext();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//	}
//	
//	@Test(enabled =true)
//	public void loginTestFAC() throws InterruptedException
//	{
//		System.out.println("LoginPage");
//		LoginPage lp = new LoginPage();
//		System.out.println(config.getFacusername());
//		lp.setUserName(config.getFacusername());
//		//lp.clickOnNext();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//	}

}
