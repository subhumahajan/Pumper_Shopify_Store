package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScript;

public class PumperWidgetPage {

	WebDriver driver;
	JavaScript js = new JavaScript();

	
	@FindBy(xpath="//*[@id=\"ProductInfo-template--23814109266223__main\"]/div[1]/h1")
	private WebElement selectedProdcutName;
	
	@FindBy(xpath="//*[@id=\"price-template--23814109266223__main\"]/div/div/div[1]/span[2]")
	private WebElement selectedProductPrice;
	
	@FindBy(xpath="//*[@id=\"prvw__block_title\"]")
	private WebElement selectedOfferText;
	
	
	@FindBy(xpath="//*[@id=\"prvw__label_1\"]/div[1]/div[2]/div[1]/div/h5")
	private WebElement threePairProduct;
	
	@FindBy(xpath="//*[@id=\"prvw__label_1\"]/div[1]/div[2]/div[1]/div/h4")
	private WebElement threePairProductDiscount;
	
	@FindBy(xpath="//*[@id=\"prvw_totalAmount_0\"]")
	private WebElement threePairProductWithDiscountPrice;
	
	@FindBy(xpath="//*[@id=\"prvw_originalAmount_0\"]")
	private WebElement threePairProductWithoutDiscountPrice;
	
		
	@FindBy(xpath="//*[@id=\"prvw__label_2\"]/div[1]/div[2]/div[1]/div/h5")
	private WebElement eightPairProduct;
	
	@FindBy(xpath="//*[@id=\"prvw__label_2\"]/div[1]/div[2]/div[1]/div/h4")
	private WebElement eightPairProductDiscount;
	
	@FindBy(xpath="//*[@id=\"prvw_totalAmount_1\"]")
	private WebElement eightPairProductWithDiscountPrice;
	
	@FindBy(xpath="//*[@id=\"prvw_originalAmount_1\"]")
	private WebElement eightPairProductWithoutDiscountPrice;
	
	
	@FindBy(xpath="//*[@id=\"prvw__label_3\"]/div[1]/div[2]/div[1]/div/h5")
	private WebElement fivePairProduct;
	
	@FindBy(xpath="//*[@id=\"prvw__label_3\"]/div[1]/div[2]/div[1]/div/h4")
	private WebElement fivePairProductDiscount;
	
	@FindBy(xpath="//*[@id=\"prvw_totalAmount_2\"]")
	private WebElement fivePairProductWithDiscountPrice;
	
	@FindBy(xpath="//*[@id=\"prvw_originalAmount_2\"]")
	private WebElement fivePairProductWithoutDiscountPrice;
		
	@FindBy(xpath="//*[@id=\"bottomtitle__total__price\"]")
	private WebElement totalPriceForSelectedCard;

	@FindBy(xpath="//*[@id=\"ProductSubmitButton-template--23814109266223__main\"]")
	private WebElement addToCardIsDisplayed;
	
	@FindBy(xpath="//*[@id=\"product-form-template--23814109266223__main\"]/div/div/shopify-accelerated-checkout")
	private WebElement buyItNowIsDisplayed;

	@FindBy(xpath="//*[@id=\"prvw__bundle_container\"]/div/div[3]/a")
	private WebElement poweredByPumper;
	
	
	
	
	public PumperWidgetPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getSelectedProductName()
	{
		js.scrollIntoView(selectedProdcutName);
		String productName = selectedProdcutName.getText();
		return productName;
	}
	
	public String getSelectProductPrice()
	{
		String productPrice = selectedProductPrice.getText();
		return productPrice;
	}
	
	public String getSelectedOfferText()
	{
		String offerText = selectedOfferText.getText();
		return offerText;
	}
	
	
	public String getThreePairData()
	{
		String threePairProductValue = threePairProduct.getText();
		String threePairProductDiscountValue = threePairProductDiscount.getText();
		String threePairWithDiscountPriceValue = threePairProductWithDiscountPrice.getText();
		String threePairProductWithoutDiscountPriceValue = threePairProductWithoutDiscountPrice.getText();
		return 
		"Three Pair Product: " + threePairProductValue + "\n" +
        "Three Pair Discount: " + threePairProductDiscountValue + "\n" +
        "Three Pair Price With Discount: " + threePairWithDiscountPriceValue + "\n" +
        "Three Pair Price Without Discount: " + threePairProductWithoutDiscountPriceValue;	
	}
	
	
	public String getEightPairData()
	{
		String eightPairProductValue = eightPairProduct.getText();
		String eightPairProductDiscountValue = eightPairProductDiscount.getText();
		String eightPairWithDiscountPriceValue = eightPairProductWithDiscountPrice.getText();
		String eightPairProductWithoutDiscountPriceValue = eightPairProductWithoutDiscountPrice.getText();
		return 
		"Eight Pair Product: " + eightPairProductValue + "\n" +
        "Eight Pair Discount: " + eightPairProductDiscountValue + "\n" +
        "Eight Pair Price With Discount: " + eightPairWithDiscountPriceValue + "\n" +
        "Eight Pair Price Without Discount: " + eightPairProductWithoutDiscountPriceValue;	
	}
	
	public String getFivePairData()
	{
		String fivePairProductValue = fivePairProduct.getText();
		String fivePairProductDiscountValue = fivePairProductDiscount.getText();
		String fivePairWithDiscountPriceValue = fivePairProductWithDiscountPrice.getText();
		String fivePairProductWithoutDiscountPriceValue = fivePairProductWithoutDiscountPrice.getText();
		return 
		"Five Pair Product: " + fivePairProductValue + "\n" +
        "Five Pair Discount: " + fivePairProductDiscountValue + "\n" +
        "Five Pair Price With Discount: " + fivePairWithDiscountPriceValue + "\n" +
        "Five Pair Price Without Discount: " + fivePairProductWithoutDiscountPriceValue;	
	}
	
	
	public String getTotalPriceForSelectedCard()
	{
		return totalPriceForSelectedCard.getText();
	}
	
	public boolean getAddToCardIsDisplayed()
	{
		return addToCardIsDisplayed.isDisplayed();
	}
	
	public boolean getBuyItNowIsDisplayed()
	{
		return buyItNowIsDisplayed.isDisplayed();
	}
	
	public boolean getPoweredByText()
	{
		return poweredByPumper.isDisplayed();
	}
	
	

}
