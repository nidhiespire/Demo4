package HomeSolutionModule;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
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
	
	
	public homewifi()
	{
		PageFactory.initElements(driver, this);
	}
	//*[@id="list-top"]/div[2]/div[2]/div[10]/div/div[3]/div[3]/div[1]/button
	
	CommonUtilities cu= new CommonUtilities();
		
	@FindBy(id="HOME SOLUTIONS")
	WebElement elem_hs;
	@FindBy(id="checkbox3")
	WebElement elem_checkbox;
	@FindBy(xpath="//*[@id='list-top']/div[2]/div[2]/div[10]/div/div[3]/div[3]/div[1]/button")
	WebElement elem_cart;
	
//	@FindBy(id="image_list")
//	WebElement elem_list;
	
	public void housesolutionTab()
	{
		
		try 
		{
				
			
			Actions ac=new Actions(driver);
			ac.moveToElement(elem_hs).perform();
			mu.utilities.Screenshotcapture.captureAsImage(driver, "HouseSolutiontab");
			
			System.out.println("homsoulutiontab clicked");
		//	elem_hs.click();
//	                 
//			List<WebElement> list=driver.findElements(By.xpath("//*[@id='image_list']/ul/li/a"));
//			System.out.println("Number of product name listed ");
//			int count=list.size();
//			System.out.println(count);
//			for(int i=0;i<count-1;i++)
//			{
//				System.out.print(list.get(i).getText());
//				System.out.print("\n");
//			}
//
//		}
//		catch (Exception e) 
//			{
//				// TODO: handle exception
//				
//				System.out.println("Error"+e);
//				logger.error(" Failed:"+e);
//
//			}
			
//		}
//	}
//	public void clic_wifi() throws InterruptedException, HeadlessException, IOException, AWTException 
//	{
		// TODO Auto-generated method stub
		
//		Mesh_WiFi.click();
		//Thread.sleep(6000);
		WebElement elem2=driver.findElement(By.xpath("/html/body/noindex[1]/div[1]/header/div/nav/div/div[1]/ul/li[1]/div/div/div/div[1]/div[1]/div[2]/div[1]/div/ul/li[1]/a"));
      //CommonUtilities.fluentlyWaitForElementToLoad(driver, elem2);
     cu.fluentlyWaitForElementToLoad(driver, elem2);
      elem2.click();
		System.out.println("whole home mesg wifi clicked ");
		mu.utilities.Screenshotcapture.captureAsImage(driver,"Mesh WIFI");
		
		WebElement elem3=driver.findElement(By.xpath("//*[@id='main']/div/div/div[2]/aside/p/a"));
		cu.scrollToElement(elem3, driver);
		System.out.println("scroll down till Filtered ");
		Thread.sleep(3000);
		mu.utilities.Screenshotcapture.captureAsImage(driver,"Scroll down Filter");
}
	catch(Exception e)
	{
		System.out.println("error e");
		logger.error(" Failed:"+e);
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
//		catch (Exception e) +
//		{
//		// TODO: handle exception
//			System.out.println("Error"+e);
//		}
		

	
//	public void click()
//	{
//		try 
//		{
//			//searach.click();
//			searchclient.sendKeys(name);
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


	
public void display_productqty() throws InterruptedException, HeadlessException, IOException, AWTException
{

//mu.utilities.CommonUtilities.javascriptClick(elem_checkbox,driver);
	try
	{
	elem_checkbox.isSelected();
	elem_checkbox.click();
	Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='footer-list-cols']/div[4]/span[4]/button")).click();
	Thread.sleep(3000);
	mu.utilities.Screenshotcapture.captureAsImage(driver,"Hardware only clicked");
    System.out.println("product is clicked");
    System.out.println("\n");
    Thread.sleep(1000);
  //  cu.scrollDown(driver);
   String k=driver.findElement(By.xpath("//*[@id='list-top']/div[2]/div[1]/div/p")).getText();
   System.out.println("click product avaialblity count" +k);
  
    mu.utilities.Screenshotcapture.captureAsImage(driver,"items in stock");
       

}
	catch(Exception e)
	{
		System.out.println("error e");
		logger.error(" Failed:"+e);
	}
}

public void Addtocart()

{
	try
	
	{
		
		elem_cart.click();
		Thread.sleep(7000);
		   System.out.println("Available product added to cart screenshot picked");

	    mu.utilities.Screenshotcapture.captureAsImage(driver,"addto Cart");

		
		
	}


catch(Exception e)
{
	System.out.println("error e");
	logger.error(" Failed:"+e);
}
}

}








//	}
//}
//}
