package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_Alerts_Tests_PromptAlerts {
	@Test

	public static void PromptAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		Reporter.log("Page Title : " + pageTitle, true);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("Satya");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}
}
