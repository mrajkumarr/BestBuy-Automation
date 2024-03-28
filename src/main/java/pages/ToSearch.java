package pages;


import org.openqa.selenium.WebDriver;
import base.ProjectSpecificationMethod;

	public class ToSearch extends ProjectSpecificationMethod {
		// constructor chaining
		public ToSearch(WebDriver driver) {
			this.driver = driver;
		}

		// search item
		public ToSearch clickitem() {

			findElement("Xpath", "(//span[@class='nc-product-title clamp'])[1]").click();

			return this;
		}

		// add search item to cart
		public ToSearch addtocart() {

			findElement("Xpath", "(//button[text()='Add to Cart'])[1]").click();

			return this;
		}
	}

