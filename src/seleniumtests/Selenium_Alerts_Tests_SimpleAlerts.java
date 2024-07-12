package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_Alerts_Tests_SimpleAlerts extends BaseTest {
	@Test(groups="Smoke")

	public void SimpleAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		Reporter.log("Page Title : " + pageTitle, true);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		String alertmessage = driver.switchTo().alert().getText();
		Reporter.log("Alert message is : " + alertmessage, true);
		Thread.sleep(2000);
		if (alertmessage.equals("You clicked a button")) {
			driver.switchTo().alert().accept();
			Reporter.log("Test is Passed", true);
		} else {
			driver.switchTo().alert().dismiss();
			Reporter.log("Test is Failed", true);

		}
		driver.quit();
	}

}