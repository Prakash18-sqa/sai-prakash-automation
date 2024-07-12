package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Starting the Suite Execution", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("Suite Execution Completion", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}

	@BeforeClass(groups="Smoke")
	public void beforeClass() {
		Reporter.log("Opening Browser", true);
	}

	@AfterClass(groups="Smoke")
	public void afterClass() {
		Reporter.log("Browser Closed Successfully", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Method is Performing");
	}

	@AfterMethod
	public void aftereMethod() {
		Reporter.log("Method executed Successfully");
	}
}
