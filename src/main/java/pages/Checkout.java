package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;

public class Checkout extends ProjectSpecificationMethod {

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}

	// to checkout the cart
	public Checkout clickcheckout() throws InterruptedException {

		findElement("Xpath", "//button[text()='Checkout']").click();
		return this;

	}
	//customer sign in details
	public Checkout customersignin() {

		findElement("Xpath", "//button[text()='Continue as Guest']").click();
		
		return this;
	}
	
	//order details
		public Checkout gettingorder() {
			
			findElement("id", "user.emailAddress").sendKeys("mrajkumarr@hotmail.com");
			findElement("id", "user.phone").sendKeys("9524466537");
			findElement("Xpath", "//button[@class='btn btn-lg btn-block btn-secondary']").click();
			return this;
		}
		 
/*
//customer delivery details
	public Checkout deliverydetails() {
		
		findElement("id", "firstName").sendKeys("Rajkumar");

		findElement("id", "lastName").sendKeys("Muthusamy");

		findElement("id", "street").sendKeys("26 Erode");

		findElement("id", "save-for-billing-address-Map{}").click();

		findElement("Xpath", "//button[text()='Apply']").click();

		findElement("Xpath", "//span[text()='Continue to Schedule Delivery']").click();

		return this;
	}

//use to pick the date
	public Checkout datepick() {

		String expectedMonth = "April"; // get the month

		int selectDate = 28; // get the date

		while (true) { // verify the actual month is equals to expected month
			String actualMonth = driver.findElement(By.xpath("/caption[text()='April 2024']")).getText();

			if (expectedMonth.equals(actualMonth)) {

				break;

			} // if its not click the arrow unit expected reach
			else {
				driver.findElement(By.xpath("(//span[@class='sr-only'])[4]")).click();
			}

		}
		
		// click the selected date
		driver.findElement(By.xpath("//table//tr//td[//span[text()='28']")).click();

		// print the selected date
		String date = driver.findElement(By.xpath("[//span[text()='28']")).getText();

		return this;

	}

//payment details
	public Checkout payment_details() {

		findElement("id", "number").sendKeys("5181 5901 0736 1594");

		WebElement selectele = findElement("id", "expMonth");

		Select select = new Select(selectele);
		select.selectByIndex(4);

		WebElement year = findElement("id", "expYear");

		Select yearselect = new Select(year);
		yearselect.selectByIndex(2);

		findElement("id", "cvv").sendKeys("209");

		findElement("id", "first-name").sendKeys("Raj");

		findElement("id", "last-name").sendKeys("Kumar");

		findElement("id", "address-input").sendKeys("Erode");

		findElement("Xpath", "//span[text()='Place Your Order']").click();

		return this;
	}*/

}

