package HomeSolutionModule;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	@FindBy(xpath="//*[@id='list-top']/div[2]/div[2]/div[10]/div/div[3]/div[3]/div[1]")
	WebElement elem_cart;
	
//	@FindBy(xpath="//*[@id='content']/div/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div")
//	WebElement elem_qtydrp;
	
	
	
//	@FindBy(id="cart")
//	WebElement elem_carticon;
	
	//@FindBy(xpath="//*[@id='cart']/img[2]")
	@FindBy(xpath="/*[class='btn btn-primary btn-block checkout-btn']")
	WebElement elem_checkouticon;
	
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
  
      elem2.click();
		System.out.println("whole home mesg wifi clicked ");
		mu.utilities.Screenshotcapture.captureAsImage(driver,"Mesh WIFI");
		   cu.fluentlyWaitForElementToLoad(driver, elem2);
		WebElement elem3=driver.findElement(By.xpath("//*[@id='main']/div/div/div[2]/aside/p/a"));
		cu.scrollToElement(elem3, driver);
		System.out.println("scroll down till Filtered ");
		Thread.sleep(3000);
		mu.utilities.Screenshotcapture.captureAsImage(driver,"Scroll down Filter");
}
	catch(Exception e)
	{
		System.out.println("error e");
		logger.error(" Failed:"+e.getMessage());
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
	Thread.sleep(1000);
	mu.utilities.Screenshotcapture.captureAsImage(driver,"Hardware only clicked");
    System.out.println("product is clicked");
    System.out.println("\n");
    Thread.sleep(1000);
  //  cu.scrollDown(driver);
 //  String k=driver.findElement(By.xpath("//*[@id='list-top']/div[2]/div[1]/div/p")).getText();
   //System.out.println("click product avaialblity count" +k);
  
   // mu.utilities.Screenshotcapture.captureAsImage(driver,"items in stock");
       

}
	catch(Exception e)
	{
		System.out.println("error e");
		logger.error(" Failed:"+e.getMessage());
	}
}

public void Addtocart()

{
	try
	
	{
		
		elem_cart.click();
	
		   System.out.println("Available product added to cart screenshot picked");

	    mu.utilities.Screenshotcapture.captureAsImage(driver,"addto Cart");
	   
	    Thread.sleep(5000);
       cu.scrollToElement(elem_checkouticon, driver);
	   
		elem_checkouticon.click();
		mu.utilities.Screenshotcapture.captureAsImage(driver, "my cart");
	    
	    Thread.sleep(2000);

         mu.utilities.Screenshotcapture.captureAsImage(driver,"move to payment page");
         System.out.println("Available product added to cart screenshot picked");
/* WebElement e3=driver.findElement(By.xpath("//*[@id='icon-wrapper']/div[4]/div/div/div/div[2]/a"));
 cu.fluentlyWaitForElementToLoad(driver, e3);
 e3.click();*/
 Thread.sleep(1000);
	  //  driver.findElement(By.xpath("//*[@id='content']/div/div[1]")).click();
		
	}


catch(Exception e)
{
	System.out.println("error e");
	logger.error(" Failed:"+e.getMessage());
}
}
}
/*public void productqty()
{
	
	try
	{
		
		elem_qtydrp.click();
		
		elem_cart.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(1000);
		elem_cart.click();
		  mu.utilities.Screenshotcapture.captureAsImage(driver,"update productqty");

	}
	catch(Exception e)
	{
		System.out.print("error" +e.getMessage());
	}
}*/
	
/*	public void checkout()
	{
try
{

	cu.pagedown(driver);
	checkout.click();
//	Actions as=new Actions(driver);
//	as.moveToElement(elem_carticon).perform();
	Thread.sleep(1000);
	
	
 
}

catch(Exception e)
{
	System.out.print("error" +e);	
}

	}
	
	
	
	
	
	
	
	
}*/











//	}
//}
//}
