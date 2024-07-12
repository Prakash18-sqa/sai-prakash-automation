package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoQaSubmitFormTest {
	@Test

	public static void SubmitForm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Sai Prakash");
		Reporter.log("Sai Prakash", true);
		driver.findElement(By.id("userEmail")).sendKeys("saiprakash.m1896@gmail.com");
		Reporter.log("saiprakash.m1896@gmail.com", true);
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		Reporter.log("Pune", true);
		driver.findElement(By.id("permanentAddress")).sendKeys("USA");
		Reporter.log("USA", true);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).isDisplayed();
		Reporter.log("name",true);
		driver.close();

	}

}
