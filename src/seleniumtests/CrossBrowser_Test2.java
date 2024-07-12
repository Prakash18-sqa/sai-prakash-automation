package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CrossBrowser_Test2 extends BaseTest {
	@Test
	public void LaunchBrowser() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		String getTitle = driver.getTitle();
		Reporter.log("EdgeTitle : " + getTitle);
		// String actual = ("DemoQA");
		// String expected = ("DEMOQA");
		Assert.assertEquals("DEMOQA", getTitle);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
