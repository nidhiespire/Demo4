//package mu.testCases;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import ClientModule.ClientFeatureMain;
//import ClientModule.ClientFeatureOther;
//import LoginModule.LoginPage;
//import mu.utilities.CommonUtilities;
//import mu.utilities.ConfigReader;
//
//
//public class TC_ClientModule_002 extends TestBaseClass
//{
//
//	public String TestCaseID=null;
//    String[] data=null;
//    String Sheet = null;
//
//
//	/**
//	 * Login as a PS and Create New Client.  
//	 * @throws InterruptedException
//	 * @throws InvalidFormatException
//	 */
//    
//	@Test(enabled=false)
//	public void loginTest() throws InterruptedException, InvalidFormatException
//	{
//		TestCaseID="TC_CreateNewClient_001";
//        Sheet="Sheet1";
//        data = mu.utilities.CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		
//		System.out.println("LoginPage");
//		LoginPage lp = new LoginPage();
//
//		System.out.println(ConfigReader.getUsername());
//		lp.setUserName(ConfigReader.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//
//		ClientFeatureMain client= new ClientFeatureMain();
//		client.clientTab();
//		client.createNewClientButton();
//		client.clientName(data[1]);
//		client.cityName(data[2]);
//		client.industryName(data[3]);
//		client.createNewClientClick();
////		client.addAccountOwner();
////		client.aoEmail("");
//	}
//
//	/**
//	 * Login as a PS and Search a particular Client.
//	 * @throws InterruptedException
//	 * @throws InvalidFormatException 
//	 */
//	
//	@Test(enabled=false)
//	public void searchClientAsPS() throws InterruptedException, InvalidFormatException
//	{
//		TestCaseID="TC_SearchClientPS_002";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		
//			LoginPage lp= new LoginPage();
//			lp.setUserName(config.getUsername());
//			//Thread.sleep(2000);
//			lp.clickOnSubmit();
//			
//			lp.setPassword(config.getPassword());
//			lp.clickOnSubmit();
//			
//			ClientFeatureMain client =new ClientFeatureMain();
//			client.clientTab();
//		//	Thread.sleep(3000);
//			//SearchClientText sclient=new SearchClientText();
//			client.searchClient1(data[1]);
//	}
//	
//	/**
//	 * Login as a PM and Search a particular Client.
//	 * @throws InterruptedException
//	 */
//
//	@Test(enabled=false)
//	public void searchClientText_AsPMRole() throws InterruptedException, InvalidFormatException
//	{ 
//		TestCaseID="TC_SearchClientPM_003";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//
//		LoginPage lp=new LoginPage();
//		lp.setUserName(config.getPMusername());
//		
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		
//		ClientFeatureMain client =new ClientFeatureMain();
//		client.clientTab();
//	
//		//SearchClientText sclient=new SearchClientText();
//		client.searchClient1(data[1]);
//	}
//	
//	/**
//	 * Login as a SS and Search a particular Client.
//	 * @throws InterruptedException
//	 * @throws InvalidFormatException 
//	 */
//	
//	@Test(enabled=false)
//	public void searchClient_AsSS() throws InterruptedException, InvalidFormatException
//	{
//		TestCaseID="TC_SearchClientSS_004";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		
//			LoginPage lp = new LoginPage();
//			lp.setUserName(config.getSSusnername());
//		
//			lp.clickOnSubmit();
//			lp.setPassword(config.getPassword());
//			lp.clickOnSubmit();
//			
//			ClientFeatureMain client =new ClientFeatureMain();
//			client.clientTab();
//			
//			//SearchClientText sclient=new SearchClientText();
//			client.searchClient1(data[1]);
//	}
//	
//	/**
//	 * Sorting the Client list as per Name, Location and Industry.
//	 * @throws InvalidFormatException 
//	 * 
//	 */
//	
//	@Test(enabled=false)
//	public void sortClient_ListASPS() throws InvalidFormatException
//	{
//		TestCaseID="TC_SortClientListPS_005";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//        
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		
//	//	SortClient sort= new SortClient();
//		client.sortclientlist(data[1]);
//	}
//	
//	
//	@Test(enabled=false)
//	public void sortClient_ListASPM() throws InvalidFormatException
//	{
//		TestCaseID="TC_SortClientListPM_006";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//        
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getPMusername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		
//		//SortClient sort= new SortClient();
//		client.sortclientlist(data[1]);
//	}
//	
//	@Test(enabled=false)
//	public void sortClient_ListASSS() throws InvalidFormatException
//	{
//		TestCaseID="TC_SortClientListSS_007";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//        
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getSSusnername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		
//		//SortClient sort= new SortClient();
//		client.sortclientlist(data[1]);
//	}
//	
//	/**
//	 * Create New Project
//	 * @throws InvalidFormatException
//	 */
//	
//	@Test(enabled=false)
//	public void createNewProject() throws InvalidFormatException
//	{
//		TestCaseID="TC_CreateNewProjectPS_008";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		client.searchClient1(data[1]);
//		
//		ClientFeatureOther cfo=new ClientFeatureOther();
//		//cfo.projectTab();
//		cfo.createProjectButton(data[2]);
//		cfo.enterProjectName(data[2]);
//		cfo.setTimeLine();
//		cfo.selectSoftwareVersion(data[3]);
//		cfo.selectSoftwareType(data[4]);
//		cfo.enterSOW(data[5]);
//		cfo.clickOnSaveProjectbtn();
//		
//		cfo.clickNewScenariobtn();
//		cfo.newScenarioName(data[6]);
//		cfo.selectDeliveryMode(data[7]);
//		cfo.selectSessionLength(data[8]);
//		cfo.selectSimulationContent(data[9]);
//		cfo.enterOutcome(data[10]);
//		cfo.enterStrategies(data[11]);
//		cfo.clickScenarioSaveBtn();
//		cfo.clickCreatePlanningBtn();
//		cfo.addTeamInScenario(data[12]);
//	}
//	
//	@Test(enabled=false)
//	public void createClientUsers() throws InvalidFormatException
//	{
//		TestCaseID="TC_CreateClientUsers_009";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		client.searchClient1(data[1]);
//		ClientFeatureOther cfo=new ClientFeatureOther();
//		cfo.clickClientUsers();
//		cfo.createClientUser(data[2]);
//		cfo.enterUserEmail(data[2]);
//		cfo.selectRoleOfClientUser(data[3]);
//		
//	}
//	
//	@Test(enabled=true)
//	public void createClientUsers1() throws InvalidFormatException
//	{
//		TestCaseID="TC_CreateNewProjectPS_010";
//        Sheet="Sheet1";
//        data = CommonUtilities.toReadExcelData(TestCaseID, Sheet);
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		client.searchClient1(data[1]);
//		
//		ClientFeatureOther clientO= new ClientFeatureOther();
//		clientO.searchProject("all");
//
//	}
//	/**
//	 * Schedule a session through PS account
//	 * using Already created project and scenario
//	 * @throws InvalidFormatException 
//	 * 
//	 */
//	@Test(enabled=false)
//	public void scheduleASessionPS() throws InvalidFormatException
//	{
//		
//		LoginPage lp = new LoginPage();
//		lp.setUserName(config.getUsername());
//		lp.clickOnSubmit();
//		lp.setPassword(config.getPassword());
//		lp.clickOnSubmit();
//		ClientFeatureMain client = new ClientFeatureMain();
//		client.clientTab();
//		//SearchClientText sclient=new SearchClientText();
//		client.searchClient1("Poonam.sharma@mursion.com");
//		
//		ClientFeatureOther proj= new ClientFeatureOther();
//		//proj.searchProject(Sheet);
//		
//	}
//	
//
//}
