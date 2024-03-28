package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC003_Menu extends ProjectSpecificationMethod {
	@Test
	public void navigation() throws IOException, InterruptedException {
		//choose country
		StartPage page = new StartPage(driver);
		page.choosecountry();
		// all menu navigation
		Homepage top = new Homepage(driver);
		
		top.topdeal();
		

		
		
		
	}

}
