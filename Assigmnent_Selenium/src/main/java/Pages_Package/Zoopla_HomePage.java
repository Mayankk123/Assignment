package Pages_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Base_Class;

public class Zoopla_HomePage extends Base_Class
{
	//PageFactory
	
	@FindBy(xpath="//div/input[@name='q']")
	WebElement searchfield;
	
	@FindBy(xpath = "//button[@id='search-submit']")
	WebElement searchbtn;
	
	public Zoopla_HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchPlace()
	{
		searchfield.sendKeys(prop.getProperty("searchvalue"));
		searchbtn.click();
	}
}
