//package mu.testCases;
//
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import LoginModule.LoginPage;
//import UsersModule.UserPage;
//import mu.utilities.ConfigReader;
//
//public class TC_CreateUser_003 extends TestBaseClass
//{
//	ConfigReader config=new ConfigReader();
//	@Test
//	public void UserPage() throws InterruptedException
//	{ 
//		
////			System.out.println(br1);
////			setUp(br1);
//			System.out.println("LoginPage");
//			LoginPage lp = new LoginPage();
//			lp.setUserName(config.getUsername());
//			
//			Thread.sleep(2000);
//			//lp.clickOnNext();
//			lp.setPassword(config.getPassword());
//			lp.clickOnSubmit();
//			
//			UserPage up=new UserPage();
//			up.userTabClick();
//			up.createNewUser();
//			up.userform("");
//			up.psroalButton();
//			up.pmroalButton();
//			//up.ssroalButton();
//			up.createNewUserButton();
////			driver.quit();
//	}
//	
//}
