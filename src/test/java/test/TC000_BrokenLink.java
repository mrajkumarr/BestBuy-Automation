package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.StartPage;

public class TC000_BrokenLink extends ProjectSpecificationMethod {
	@Test
	public void Linkbroken() throws IOException, InterruptedException {
		// check given link is broken or not
		StartPage page = new StartPage(driver);
		page.choosecountry().brokenlinks();

	}

}
