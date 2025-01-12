package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopifyWebSitePage {
	
	WebDriver driver;
		
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement enterPassword;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/form/button")
	private WebElement enterButton;
	
	public ShopifyWebSitePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void openWebSite(String password)
	{
		enterPassword.sendKeys(password);
		enterButton.click();
	}
	

}
