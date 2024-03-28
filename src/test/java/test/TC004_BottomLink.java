package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC004_BottomLink extends ProjectSpecificationMethod {
	
	@Test
	public void bottomlink() {
		
		StartPage entry = new StartPage(driver);
		entry.choosecountry();
		//bottom links navigation
		Homepage bottom = new Homepage(driver);
		bottom.bottomlinksnavigate();
		
	}

}
