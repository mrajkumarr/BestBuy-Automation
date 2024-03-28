package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class Signin extends ProjectSpecificationMethod {

	public Signin(WebDriver driver) {

		this.driver = driver;

	}

//give the email value
	public Signin email(String email) {

		findElement("id", "fld-e").sendKeys(email);

		return this;

	}

//give the password value
	public Signin password(String password) {

		findElement("id", "fld-p1").sendKeys(password);

		return this;
	}

//give the sign in button
	public Signin signinbutton() {

		findElement("Xpath", "//button[text()='Sign In']").click();

		return this;
	}

}
