package TestPages_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Package.Base_Class;
import Pages_Package.Search_Page;
import Pages_Package.Zoopla_HomePage;

public class Search_Page_test extends Base_Class
{
	Zoopla_HomePage home;
	Search_Page search;
	
	public Search_Page_test()
	{
		super();
	}
	
	@BeforeClass
	public void init()
	{
		init_setup();
		home = new Zoopla_HomePage();
		home.searchPlace();
	}
	
	@Test(priority=1)
	public void verify_ListPrices()
	{
		search = new Search_Page();
		search.collectdata();
	}
	
	@Test(priority=2)
	public void verify_selectItem()
	{
		search = new Search_Page();
		search.selectitem();
	}
}