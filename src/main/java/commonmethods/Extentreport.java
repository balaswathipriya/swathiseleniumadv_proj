package commonmethods;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	
	static ExtentReports extent;
	static ExtentSparkReporter Spark;
	static ExtentTest test;
	
	
	public static void setup() {
		 extent = new ExtentReports();
		 Spark= new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(Spark);
		test=extent.createTest("advtest");
	    
	}
	
	public static void repopass() {
	
		test.pass("test is pass");
		extent.flush();
		
		}
public static void repofail() throws IOException {
		
	test.fail("test is fail");
	String path="D:\\errorsc12.png";
	test.addScreenCaptureFromPath("path");
	extent.flush();
		}


}
