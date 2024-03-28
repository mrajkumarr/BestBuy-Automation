package pages;

import org.openqa.selenium.WebDriver;
import base.ProjectSpecificationMethod;

public class Brand extends ProjectSpecificationMethod {
		// constructor chaining
		public Brand(WebDriver driver) {

			this.driver = driver;
		}

		// add the item by clicking the selected brand
		public Brand bybrand() {

			findElement("linkText", "Computing").click();
			
			findElement("linkText", "Galaxy Book").click();
			
			findElement("Xpath", "//button[contains(text(),'Add to Cart')]").click();

			return this;
		}

	}

	
