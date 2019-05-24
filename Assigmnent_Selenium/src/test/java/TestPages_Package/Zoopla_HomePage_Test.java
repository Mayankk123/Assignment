package TestPages_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Package.Base_Class;
import Pages_Package.Zoopla_HomePage;

public class Zoopla_HomePage_Test extends Base_Class
{
	Zoopla_HomePage home;
	
	public Zoopla_HomePage_Test()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		home = new Zoopla_HomePage();
		home.init_setup();
	}
	
	@Test
	public void searching_test()
	{
		home = new Zoopla_HomePage();
		home.searchPlace();
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}

}
