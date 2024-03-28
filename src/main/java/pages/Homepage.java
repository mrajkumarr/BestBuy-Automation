package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificationMethod;

public class Homepage extends ProjectSpecificationMethod {

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

//click create account button
	public NewAccount account_Createaccount() {

		findElement("Xpath", "//span[text()='Account']").click();

		findElement("linkText", "Create Account").click();

		return new NewAccount(driver);

	}

//click sign in button
	public Signin signin() throws InterruptedException {

		findElement("Xpath", "//span[text()='Account']").click();

		findElement("Xpath", "//a[text()='Sign In']").click();

		return new Signin(driver);

	}

//click menu navigation
	public Menu topdeal() {
		
		System.out.println("\n");
		// topdeal menu navigation
		findElement("linkText", "Top Deals").click();

		String titleTop = driver.getTitle();

		if (titleTop.contains("Top Deals and")) 
		{
				System.out.println("BestBuy -> Top Deals Page");
		}

		else 
		{			
			System.out.println("Failed to view BestBuy -> Top Deals Page");
		}

		System.out.println("\n");
		
		// Deal of the day menu navigation
		findElement("linkText", "Deal of the Day").click();

		String dealtitle = driver.getTitle();

		if (dealtitle.contains("Deal of the Day")) {

			System.out.println("BestBuy -> Deal of the day Page");
		}

		else {

			System.out.println("Failed to view BestBuy -> Deal of the day Page");
		}

		System.out.println("\n");
		
		// Yes Best Buy menu navigation
		findElement("linkText", "Yes, Best Buy Sells That").click();

		String bestbuytitle = driver.getTitle();

		if (bestbuytitle.contains("Yes, Best Buy Sells That")) {

			System.out.println("BestBuy -> Best Buy Sells Page");
		}

		else {
			System.out.println("Failed to view BestBuy -> Best Buy Sells Page");
		}

		System.out.println("\n");
		
		// My Best Buy Membership navigation
		findElement("linkText", "My Best Buy Memberships").click();

		String membershiptitle = driver.getTitle();

		if (membershiptitle.contains("My Best Buy Memberships")) {

			System.out.println("BestBuy -> My Best Buy Membership Page");
		}

		else {
			System.out.println("Failed to view BestBuy -> My Best Buy Membership Page");
		} 

		System.out.println("\n");
		
		// credit card navigation
		findElement("linkText", "Credit Cards").click();

		String creditcardtitle = driver.getTitle();

		if (creditcardtitle.contains("Credit Card")) {

			System.out.println("BestBuy -> Credit Cards Page");
		}

		else {
			System.out.println("Failed to view BestBuy -> Credit Cards Page");
		}

		System.out.println("\n");
		
		// Gift card navigation
		findElement("linkText", "Gift Cards").click();

		String giftcardtitle = driver.getTitle();

		if (giftcardtitle.contains("Gift Card")) {

			System.out.println("BestBuy -> Gift Card Page");
		}

		else {
			System.out.println("Failed to view BestBuy -> Gift Card Page");
		}

		System.out.println("\n");
		
		// Gift ideas navigation
		findElement("linkText", "Gift Ideas").click();

		String giftideatitle = driver.getTitle();

		if (giftideatitle.contains("Gift Ideas")) {

			System.out.println("BestBuy -> Gift Ideas Page");
		}

		else {
			System.out.println("Failed to view BestBuy -> Gift Ideas Page");
		}

		return new Menu(driver);
	}

//bottom link navigation
	public BottomLinks bottomlinksnavigate() {

		System.out.println("\n");
		
		findElement("linkText", "Interest-Based Ads").click();

		String Ads = driver.getTitle();

		if (Ads.contains("Interest-Based Ads")) 
		{
			System.out.println("BestBuy -> Interest-Based Ads Page");
		} 
		else 
		{
			System.out.println("Failed to view BestBuy -> Interest-Based Ads Page");
		}

		System.out.println("\n");
		
		findElement("linkText", "State Privacy Rights").click();

		String StatePrivacy = driver.getTitle();

		if (StatePrivacy.contains("State Privacy Rights")) 
		{

			System.out.println("BestBuy -> State Privacy Rights");
		}

		else
		{
			System.out.println("Failed to view BestBuy -> State Privacy Rights");
		}
		
		System.out.println("\n");

		return new BottomLinks(driver);
	}
	

//search to add item
	public ToSearch searchtoadd() {

		findElement("id", "gh-search-input").sendKeys("laptop");

		findElement("className", "header-search-icon").click();

		return new ToSearch(driver);

	}

//by department select to add item
	public ToShop addtoshop() {

		findElement("Xpath", "(//button[@type='button'])[2]").click();

		findElement("Xpath", "//button[contains(text(),'Computers & Tablets')]").click();

		findElement("Xpath", "//button[contains(text(),'Laptops & Desktops')]").click();

		findElement("linkText", "Laptops").click();

		return new ToShop(driver);

	}

//By brand add item
	public Brand addtoBrand() {

		findElement("Xpath", "(//button[@type='button'])[2]").click();

		findElement("Xpath", "//button[contains(text(),'Brands')]").click();

		findElement("linkText", "Samsung").click();

		return new Brand(driver);

	}

	// checkout the cart
	public Checkout checkoutcart() {

		findElement("Xpath", "//span[contains(text(),'Cart')]").click();

		return new Checkout(driver);

	}

}
