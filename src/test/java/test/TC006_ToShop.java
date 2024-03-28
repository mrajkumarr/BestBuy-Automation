package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC006_ToShop  extends ProjectSpecificationMethod {
	@Test
	public void addcartshop() {
		
		StartPage entry = new StartPage(driver);
		entry.choosecountry();
		//add cart by shop
		Homepage shop = new Homepage(driver);
		shop.addtoshop().selectitemshop();

		
		
	}

}
