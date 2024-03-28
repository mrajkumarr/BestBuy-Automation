package pages;

import org.openqa.selenium.WebDriver;
import base.ProjectSpecificationMethod;

public class NewAccount extends ProjectSpecificationMethod {

	public NewAccount(WebDriver driver) {

		this.driver = driver;
	}

//give the first name value
	public NewAccount firstName(String firstname) {

		findElement("id", "firstName").sendKeys(firstname);

		return this;

	}

//give last name value
	public NewAccount lastName(String lastname) {

		findElement("id", "lastName").sendKeys(lastname);

		return this;
	}

//give the email
	public NewAccount email(String email) {

		findElement("id", "email").sendKeys(email);

		return this;
	}

//give the password
	public NewAccount password(String password) {

		findElement("id", "fld-p1").sendKeys(password);

		return this;
	}

	// give the confirm password
	public NewAccount confirmpassword(String confirmpassword) {

		findElement("id", "reenterPassword").sendKeys(confirmpassword);

		return this;
	}

//give the mobile number
	public NewAccount mobileNumber(String number) {

		findElement("id", "phone").sendKeys(number);

		return this;
	}

	// click the account create button
	public NewAccount createbutton() {

		findElement("Xpath", "//button[text()='Create an Account']").click();

		return this;
	}

}
