package utils;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Utility {

	public static WebDriver driver;

	public String excelfile;

	// for browser launch condition for cross browser testing
	public void browserLaunch(String browser, String url) {

		/*if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}*/
		
		// for headless mode testing
		
		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
		} else if (browser.equals("edge")) {
			EdgeOptions edgeoption = new EdgeOptions();
			edgeoption.addArguments("headless");
			driver = new EdgeDriver(edgeoption);
		} else if (browser.equals("firefox")) {
			FirefoxOptions foxoption = new FirefoxOptions();
			foxoption.addArguments("headless");

			driver = new FirefoxDriver(foxoption);
		}		 

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// close the browser
	public void closeBrowser() {
		driver.close();
	}

//for find element
	public WebElement findElement(String locatortype, String locatorvalue) {

		switch (locatortype) {
		case "id":
			return driver.findElement(By.id(locatorvalue));
		case "Xpath":
			return driver.findElement(By.xpath(locatorvalue));
		case "name":
			return driver.findElement(By.name(locatorvalue));
		case "className":
			return driver.findElement(By.className(locatorvalue));
		case "linkText":
			return driver.findElement(By.linkText(locatorvalue));
		case "partiallinkText":
			return driver.findElement(By.partialLinkText(locatorvalue));
		case "tagName":
			return driver.findElement(By.tagName(locatorvalue));

		default:
			return null;
		}

	}

	// excel read method
	public String[][] excelRead() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(
				"C:\\Users\\mrajk\\eclipse-workspace\\Ecommerce\\Testdata\\" + excelfile + ".xlsx");

		XSSFSheet sheet = book.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();

		int columncount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][columncount];

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < columncount; j++) {

				XSSFCell cell = row.getCell(j);

				data[i - 1][j] = cell.getStringCellValue();

			}
		}

		book.close();

		return data;

	}

	// screenshot method
	public String getScreenshot(String screenshotname) throws IOException {

		String path = "C:\\Users\\mrajk\\eclipse-workspace\\Ecommerce\\Screenshotss\\" + screenshotname
				+ ".png";

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
		return path;

	}

//for broken links
	public void brokenlinks() throws IOException, InterruptedException {

		// capture link from web page

		WebElement links = driver.findElement(By.tagName("a"));

		// Number of links

		String url = links.getAttribute("href");

		URL linkurl = new URL(url);

		// create a connection
		HttpURLConnection connect = (HttpURLConnection) linkurl.openConnection();
		Thread.sleep(2000);
		connect.connect();
		System.out.println("\n");
		// get response code
		int responsecode = connect.getResponseCode();

		if (responsecode >= 400) 
		{

			System.out.println("Broken link -> " + linkurl);
			System.out.println("Failed to load BestBuy.com,Please try again.");
		}

		else
		{

			System.out.println("\nChecking for broken links on -> " + linkurl);
			System.out.println("Welcome to BestBuy.com");
		}

	}

}
