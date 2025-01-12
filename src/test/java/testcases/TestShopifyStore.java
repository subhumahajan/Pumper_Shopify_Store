package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.PumperWidgetPage;
import pages.ShopifyWebSitePage;
import pages.WidgetOfferPage;
import utilities.ReadPropertyFile;

public class TestShopifyStore {

	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	StartupAndTeardown startupandteardown = new StartupAndTeardown();
	ReadPropertyFile readpropertyfile = new ReadPropertyFile(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");

	public void startUp()
	{
		startupandteardown.openBrowser();
		driver = startupandteardown.driver;
		Reporter.log("- Successfully Startup");
	}
	
	public void shopifyWebSitePage()
	{
		ShopifyWebSitePage shopifywebsitepage = new ShopifyWebSitePage(driver);
		shopifywebsitepage.openWebSite(readpropertyfile.getProperty("Password"));
		Reporter.log("- Successfully Shopify Website Page Opened");
	}
	
	public void widgetOfferPage()
	{
		WidgetOfferPage widgetofferpage = new WidgetOfferPage(driver);
		widgetofferpage.selectSnowBoard();
		Reporter.log("- Successfully Widget Offer Page Opened");
	}
	
	public void pumperWidgetPage()
	{
		PumperWidgetPage pumperwidgetpage = new PumperWidgetPage(driver);
		softassert.assertEquals(readpropertyfile.getProperty("SelectedProductName"), pumperwidgetpage.getSelectedProductName());
		softassert.assertEquals(readpropertyfile.getProperty("SelectedProductPrice"), pumperwidgetpage.getSelectProductPrice());
		softassert.assertEquals(readpropertyfile.getProperty("OfferText"), pumperwidgetpage.getSelectedOfferText());

		
		String[] threePairData = pumperwidgetpage.getThreePairData().split("\n");
	    softassert.assertTrue(threePairData[0].contains(readpropertyfile.getProperty("ThreePair")), "Three Pair Product mismatch!");
	    softassert.assertTrue(threePairData[1].contains(readpropertyfile.getProperty("ThreePairDiscount")), "Three Pair Discount mismatch!");
	    softassert.assertTrue(threePairData[2].contains(readpropertyfile.getProperty("ThreePairPriceWithDiscount")), "Three Pair Price With Discount mismatch!");
	    softassert.assertTrue(threePairData[3].contains(readpropertyfile.getProperty("ThreePairPriceWithoutDiscount")), "Three Pair Price Without Discount mismatch!");

	    String[] eightPairData = pumperwidgetpage.getEightPairData().split("\n");
	    softassert.assertTrue(eightPairData[0].contains(readpropertyfile.getProperty("EightPair")), "Eight Pair Product mismatch!");
	    softassert.assertTrue(eightPairData[1].contains(readpropertyfile.getProperty("EightPairDiscount")), "Eight Pair Discount mismatch!");
	    softassert.assertTrue(eightPairData[2].contains(readpropertyfile.getProperty("EightPairPriceWithDiscount")), "Eight Pair Price With Discount mismatch!");
	    softassert.assertTrue(eightPairData[3].contains(readpropertyfile.getProperty("EightPairPriceWithoutDiscount")), "Eight Pair Price Without Discount mismatch!");

	    String[] fivePairData = pumperwidgetpage.getFivePairData().split("\n");
	    softassert.assertTrue(fivePairData[0].contains(readpropertyfile.getProperty("FivePair")), "Five Pair Product mismatch!");
	    softassert.assertTrue(fivePairData[1].contains(readpropertyfile.getProperty("FivePairDiscount")), "Five Pair Discount mismatch!");
	    softassert.assertTrue(fivePairData[2].contains(readpropertyfile.getProperty("FivePairPriceWithDiscount")), "Five Pair Price With Discount mismatch!");
	    softassert.assertTrue(fivePairData[3].contains(readpropertyfile.getProperty("FivePairPriceWithoutDiscount")), "Five Pair Price Without Discount mismatch!");

	
	    softassert.assertEquals(readpropertyfile.getProperty("TotalPrice"),pumperwidgetpage.getTotalPriceForSelectedCard());
	    softassert.assertTrue(pumperwidgetpage.getAddToCardIsDisplayed(), "Add to cart is not displayed!");
	    softassert.assertTrue(pumperwidgetpage.getBuyItNowIsDisplayed(), "Buy it now is not displayed!");
	    softassert.assertTrue(pumperwidgetpage.getPoweredByText(),"Powered By is not displayed!");
	    
		Reporter.log("- Successfully Pumper Widget Page Validate");
	    softassert.assertAll();
		
	}
	
	
	public void tearDown()
	{
		startupandteardown.closeBrowser();	
		Reporter.log("- Successfully Tear Down");
	}
	
}
