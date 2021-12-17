package mu.testCases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginModule.LoginPage;
import mu.utilities.ConfigReader;

public class TC_LoginTestPS_001 extends TestBaseClass
{
	ConfigReader config=new ConfigReader();
	
	//@Parameters("browser")
	@Test(enabled=true)
	public void loginTestPS() throws InterruptedException
	{
		ConfigReader config=new ConfigReader();
			LoginPage _lp = new LoginPage();
		     /*click on icon and sign*/
			
			_lp.clickaccount();
			_lp.sig();
					
			/*enterusername and pass*/
			System.out.println("LoginPage");
			
			System.out.println(ConfigReader.getUsername());
		
			_lp.setUserName(config.getUsername());
			Thread.sleep(1000);
		
			_lp.setPassword(config.getPassword());
			Thread.sleep(1000);

			_lp.clickOnSubmit();
	}
}
	
//	@Test(enabled=true)
//	public void loginTestAO() throws InterruptedException
//	{
//		System.out.println("LoginPage");
//		LoginPage lp = new LoginPage();
//		System.out.println(config.getLusername());
//		lp.setUserName(config.getUsername());
//		Thread.sleep(2000);
//		lp.clickOnNext();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//
//	}

