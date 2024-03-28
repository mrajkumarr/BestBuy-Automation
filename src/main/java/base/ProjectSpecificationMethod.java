package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility {

	// before method browser launch
	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void launchBrowser(String browser, String url) {

		browserLaunch(browser, url);

	}

	// after method browser close
	@AfterMethod
	public void browserClose() {

		closeBrowser();
	}

	// data provider for get data to excel
	@DataProvider(name = "exceldata")
	public String[][] excelReaddata() throws IOException {

		String[][] data = excelRead();
		return data;

	}

}
