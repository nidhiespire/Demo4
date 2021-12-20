package HomeSolutionModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mu.testCases.TestBaseClass;
public class FilterProduct extends TestBaseClass

{
	public  void FilterProduct()
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id="checkbox3")
	WebElement elem_checkbox;
		
public void displa_productqty() throws InterruptedException
{
	
	mu.utilities.CommonUtilities.javascriptClick(elem_checkbox,driver);
	
	System.out.println("product is clicked");

	
	
	

	
	
}
}