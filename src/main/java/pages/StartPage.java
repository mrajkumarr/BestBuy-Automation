package pages;

import org.openqa.selenium.WebDriver;
import base.ProjectSpecificationMethod;

public class StartPage extends ProjectSpecificationMethod{

	public StartPage (WebDriver driver) {
		this.driver = driver;
	}
	//choose the country
	public StartPage choosecountry() {
		
		findElement("Xpath", "(//img[@alt='United States'])[1]").click();
		
		return this;
		
	}
}
