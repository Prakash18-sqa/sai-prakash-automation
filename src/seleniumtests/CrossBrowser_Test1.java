package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsers_Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.getTitle();
		System.out.println("ChromeTitle :" + driver);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		Thread.sleep(2000);
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demoqa.com/");
		driver1.getTitle();
		System.out.println("EdgeTitle :" + driver1);
		Thread.sleep(2000);
		driver1.manage().window().minimize();
		driver1.quit();

	}

}
******/

public class CrossBrowser_Test1 extends BaseTest {
	@Test
	public void LaunchBrowser() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		String getTitle = driver.getTitle();
		Reporter.log("ChromeTitle : " + getTitle, true);
		String actual = ("DEMOQA");
		String expected = ("DEMOQA");
		Assert.assertEquals(actual, expected, "DEMOQA");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}