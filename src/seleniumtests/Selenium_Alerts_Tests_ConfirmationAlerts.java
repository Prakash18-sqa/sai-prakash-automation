package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_Alerts_Tests_ConfirmationAlerts {
	@Test

	public static void ConfirmAlerts() throws InterruptedException {
		WebDriver OriginalDriver = new ChromeDriver();
		Listener listener = new Listener();
		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);
		WebDriver driver = decorator.decorate(OriginalDriver);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		Reporter.log("Page Title : " + pageTitle, true);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		String alertmessage = driver.switchTo().alert().getText();
		Reporter.log("Alert message is : " + alertmessage, true);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();

		Reporter.log("Alert message1 is : " + confirmResult, true);
		driver.quit();

	}
}