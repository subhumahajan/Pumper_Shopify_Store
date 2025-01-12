package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScript;

public class WidgetOfferPage {

	WebDriver driver;
	JavaScript js = new JavaScript();
	
	
	@FindBy(xpath="//*[@id=\"collection-template--23814109102383__featured-collection-0\"]/div/h2")
	private WebElement featureProduct;
	
	@FindBy(css="#title-template--23814109102383__featured-collection-0-10414664548655")
	private WebElement snowBoard;
	
	public WidgetOfferPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectSnowBoard()
	{
		js.scrollIntoView(featureProduct);
		snowBoard.click();
	}

}
