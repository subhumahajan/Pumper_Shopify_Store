package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcases.TestShopifyStore;

public class PumperAutomation extends TestShopifyStore{

	
	@BeforeClass
	public void open_browser()
	{
		startUp();
	}
	
	
	@Test(priority=1)
	public void shopify_website_page()
	{
		shopifyWebSitePage();
	}
	
	@Test(priority=2)
	public void widget_offer_page()
	{
		widgetOfferPage();
	}
	
	@Test(priority=3)
	public void pumper_widget_page()
	{
		pumperWidgetPage();
	}
	
	
	@AfterClass
	public void close_browser()
	{
		tearDown();
	}
	
}
