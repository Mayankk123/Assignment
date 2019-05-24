package Pages_Package;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_Package.Base_Class;

public class Search_Page extends Base_Class
{
	@FindBy(xpath="//li[@id='listing_51544117'and //a[@class='listing-results-price text-price']]")
	WebElement clickElement;
	
	public Search_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	      public void collectdata()
	
	       {
	         List<WebElement> alllinkspresent = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
	  
	         String strArray[] = new String[alllinkspresent.size()];
	  
	  
	  
		     for(int i =0; i<alllinkspresent.size(); i++)
		      {
			     System.out.println(alllinkspresent.get(i).getText());
			
			     strArray[i] = alllinkspresent.get(i).getText();
		      }
		
	
	             for (int i = 0; i < strArray.length; i++) 
		           {
			           for (int j = i + 1; j < strArray.length; j++) 
			            {
				             if (strArray[i].compareTo(strArray[j])<0) 
				              {   	 
				                  String  temp = strArray[i];
					              strArray[i] = strArray[j];
					              strArray[j] = temp;
				              }
			             }
		           }
	        
	  
	          System.out.println("##################Sorted values in the Array####################");
	        	
	          for (int i = 0; i < strArray.length; i++) 
		         {
				    System.out.println(strArray[i]);
		         }
		
	       }
	
	           
	         public void selectitem()
	          {
	        	 List<WebElement> selectLink = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
	       	  
		         String strArray[] = new String[selectLink.size()];
		         
		         
		         
	          
		      }
			        
		  
	         }