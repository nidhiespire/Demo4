package HomeSolutionModule;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mu.testCases.TestBaseClass;
import mu.utilities.CommonUtilities;
import mu.utilities.Screenshotcapture;


public class homewifi extends TestBaseClass
{
	String ExpectedClientName =" ";
	
	public homewifi()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	CommonUtilities cu= new CommonUtilities();
		
	@FindBy(id="HOME SOLUTIONS")
	WebElement elem_hs;
	
	@FindBy(id="image_list")
	WebElement elem_list;
	
	@FindBy(xpath="//a[contains(@data-gtm-menu,'HOME SOLUTIONS > Home WiFi > Whole Home Mesh WiFi')]")
			WebElement Mesh_WiFi;
			public void housesolutionTab() throws InvalidFormatException
	{
		
		try 
		{
			//a[contains(@data-gtm-menu,'HOME SOLUTIONS > Home WiFi > Whole Home Mesh WiFi')]
		
			
			
			
			System.out.println("homsoulutiontab clicked");
		
			elem_hs.click();
			//cu.javascriptClick(elem_hs, driver);
			
//			Actions ac=new Actions(driver);
//			ac.moveToElement(elem_hs).click().build();
			Thread.sleep(9000);
			mu.utilities.Screenshotcapture.captureAsImage(driver, "HouseSolutiontab");
//			
//			String url=driver.getCurrentUrl();
//			System.out.println("hs"+url);
			//Assert.assertEquals(url, "");
		
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			
			System.out.println("Error"+e);
			logger.error("Method clientTab is Failed:"+e);
		}
	
	}
	public void picklist()
	{
//		try
//		{
			System.out.println("pick list");
			CommonUtilities.waitForPageLoad(driver);
		//	elem_list.click();
	
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='image_list']/ul/li/a"));
			System.out.println("product");
			int count=list.size();
			System.out.println(count);
			for(int i=0;i<count-1;i++)
			{
				System.out.print(list.get(i).getText());
			}
			
	}
	public void clic_wifi() throws InterruptedException, HeadlessException, IOException, AWTException 
	{
		// TODO Auto-generated method stub
		
		Mesh_WiFi.click();
		Thread.sleep(1000);
		//WebElement elem=driver.findElement(By.xpath("//*[@id='image_list']/ul/li[1]/a"));
		System.out.println("wifi link is clicked ");
		//Thread.sleep(3000);
		mu.utilities.Screenshotcapture.captureAsImage(driver,"WIFI LINK");
//		WebElement elem=driver.findElement(By.xpath("//*[@id='filter1']/ul/li[1]/div/label"));
//		cu.scrollToElement(elem, driver);
//		System.out.println("scrolled down");
//		mu.utilities.Screenshotcapture.captureAsImage(driver,"Scrolldown");
//	
	}
}
			
//			if(count==1)
//			{
//				Assert.assertTrue(true);
//			}
//			else
//			{
//				Assert.assertTrue(false);
//			}
//
//		}
//		catch (Exception e) 
//		{
//		// TODO: handle exception
//			System.out.println("Error"+e);
//		}
		

	
//	public void click()
//	{
//		try 
//		{
//			//searchclient.click();
//			searchclient.sendKeys(Clientname);
//			Thread.sleep(2000);
//			String cl=driver.findElement(By.xpath("//span[@class='visibilityHidden']")).getText();
//			
//			System.out.println("result"+cl);
//			if(!cl.equalsIgnoreCase("0 result found"))
//			{
//				//driver.findElement(By.xpath("//*[@class='ListItem__cardBar___3yCE8 ListItem__cardBarMed___J-GHj'][1]")).click();
//				driver.findElement(By.xpath("//*[text()='"+Clientname+"']")).click();
//			}
//			else
//			{
//				Assert.assertEquals(false, true);
//			}
//
//		}
//		catch (Exception e)
//		{
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//}
//	public void sortclientlist(String type)
//	{
//		try
//		{
//			sort.click();
//			CommonUtilities.selectDropDownByVisibleText(sort, type);
//			Thread.sleep(2000);
//			CommonUtilities.captureAsImage(driver, "SortBy"+type);
//		}
//		catch (Exception e) 
//		{
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//}
//}
