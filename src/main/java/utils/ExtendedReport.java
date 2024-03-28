package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendedReport {

	public static ExtentReports getreport() {
				
				//Create a Physical Report
				String path ="C:\\Users\\mrajk\\eclipse-workspace\\Ecommerce\\reports\\Ecommerce.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("Ecommerce Report");
				
				//Add automation data to physical report
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				
				return extent;
			}


		}



