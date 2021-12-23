package mu.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginModule.LoginPage;

import mu.utilities.ConfigReader;

public class TC_Alogin_001 extends TestBaseClass

{

	@Parameters("browser")
	@Test(enabled=true,priority=1)
	public void loginTest_1() throws InterruptedException
	{
		ConfigReader config=new ConfigReader();
			LoginPage _lp = new LoginPage();
		     /*click on icon and sign*/
			
			_lp.clickaccount();
			_lp.sig();
					
			/*enterusername and pass*/
			System.out.println("LoginPage");
			
			System.out.println(config.getUsername());
		
			_lp.setUserName(config.getUsername());
			Thread.sleep(1000);
		
			_lp.setPassword(config.getPassword());
			Thread.sleep(1000);

		_lp.clickOnSubmit();
	}	
	
	
	
	
	
}