package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificationMethod;
import pages.StartPage;
import pages.Homepage;

public class TC001_NewAcount extends ProjectSpecificationMethod {

	@BeforeTest
	public void testdataFile() {
		excelfile = "createaccount_testdata";

	}

	@Test(dataProvider = "exceldata")
	public void NewAccount_test(String firstname, String lastname, String email, String password,
			String confirmpassword, String mobilenumber, String match) throws InterruptedException {

		StartPage page = new StartPage(driver);
		page.choosecountry();

		Homepage homeobj = new Homepage(driver);
		Thread.sleep(3000);
		homeobj.account_Createaccount().firstName(firstname).lastName(lastname).email(email).password(password)
				.confirmpassword(confirmpassword).mobileNumber(mobilenumber).createbutton();
		Thread.sleep(2000);

		// use assertion for verification
		Thread.sleep(1000);
		
		if (match.contains("correct")) 
		{
			//WebElement actualtext = driver
				//	.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
		//	String text = actualtext.getText();
		//	System.out.println(text);
		//	Assert.assertEquals(text, "An account with this email already exists.");
		//	System.out.println("\n");
		//	System.out.println("Please create with different email address");
			
			WebElement actualtext2 = driver
						.findElement(By.xpath("//strong[text()='Sorry, there was a problem creating your account.']"));
				String text2 = actualtext2.getText();
				System.out.println(text2);
				Assert.assertEquals(text2, "Sorry, there was a problem creating your account.");
				System.out.println("Error Occured, Please try again later.");
			}
		
		

		else if (match.equals("emailwrong")) 
		{

			WebElement emailele = driver.findElement(By.xpath("//p[text()='Please enter a valid email address.']"));
			String emailtext = emailele.getText();
			Assert.assertEquals(emailtext, "Please enter a valid email address.");
			System.out.println("\n");
			System.out.println("Invalid Email Address");
			System.out.println("Please enter your valid email address");

		}

		else if (match.equals("passwordwrong")) {
			WebElement passele = driver.findElement(By.xpath("//p[text()='Please enter a strong password.']"));
			String passtext = passele.getText();
			System.out.println("\n");
			System.out.println("Invalid Password");
			System.out.println("Please enter your valid password");
		}

		else if (match.equals("confirmpasswordwrong")) {
			WebElement confirmpassele = driver.findElement(By.xpath("//p[text()='Passwords do not match.']"));
			String confirmpasstext = confirmpassele.getText();
			Assert.assertEquals(confirmpasstext, "Passwords do not match.");
			System.out.println("\n");
			System.out.println("Password doesnt match,Please enter your valid password");
		}

		else if (match.equals("phonenumberwrong")) {
			WebElement phoneele = driver
					.findElement(By.xpath("//p[text()='Please enter a valid mobile phone number.']"));
			String phonetext = phoneele.getText();
			Assert.assertEquals(phonetext, "Please enter a valid mobile phone number.");
			System.out.println("\n");
			System.out.println("Invalid Mobile Phone Number");
			System.out.println("Please enter your valid phonenumber");
		}

		else {
			System.out.println("Please enter valid values");
		}

	}

}
