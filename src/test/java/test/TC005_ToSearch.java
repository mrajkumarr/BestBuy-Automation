package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC005_ToSearch  extends ProjectSpecificationMethod{
	@Test
	public void addcart() {
		
		StartPage start = new StartPage(driver);
		start.choosecountry();
		
		
		//add the cart by search
		Homepage search = new Homepage(driver);
		search.searchtoadd().clickitem().addtocart();
		
	}

}
