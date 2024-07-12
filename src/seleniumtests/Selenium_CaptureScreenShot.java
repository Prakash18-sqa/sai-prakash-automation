package seleniumtests;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_CaptureScreenShot {
	@Test

	public static void CaptureScreenShot() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Satya");
		CaptureScreenShot("userName",driver);

	}

	private static void CaptureScreenShot(String screenName,WebDriver driver) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(screenshot, new File("C:\\Users\\saipr\\eclipse-workspace\\test_automation_amazon\\resources\\ScreenShots" + screenName + ".PNG"));

	}

}
