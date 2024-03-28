package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class ToShop extends ProjectSpecificationMethod{

	// constructor
		public ToShop(WebDriver driver) {

			this.driver = driver;
		}

		// add item to cart by selecting the menu by department
		public ToShop selectitemshop() {

			findElement("linkText", "Gaming laptops").click();

			findElement("Xpath", "//button[contains(text(),'Add to Cart')]").click();

			return this;

		}

	}