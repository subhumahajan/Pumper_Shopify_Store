package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testcases.TestShopifyStore;

public class JavaScript extends TestShopifyStore {

	public void  scrollIntoView(WebElement element)
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
