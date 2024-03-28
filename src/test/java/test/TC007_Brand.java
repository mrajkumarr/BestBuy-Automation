package test;

import java.io.IOException;

import org.testng.annotations.Test;
import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC007_Brand  extends ProjectSpecificationMethod{
	@Test
	public void addbrandcart() throws IOException {
		
		StartPage entry = new StartPage(driver);
		entry.choosecountry();
		//add cart to brand
		Homepage brand =new Homepage(driver);
		brand.addtoBrand().bybrand();
		
	}

}
