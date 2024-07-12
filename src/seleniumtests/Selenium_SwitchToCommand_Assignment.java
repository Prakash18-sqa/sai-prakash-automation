package seleniumtests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_SwitchToCommand_Assignment extends BaseTest {
	@Test (groups="Smoke")

	public void SwitchToCommands() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_select_multiple");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='iframeResult']")));
		Select dropDown = new Select(driver.findElement(By.id("mySelect")));
		dropDown.selectByVisibleText("Horse");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		// Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		Reporter.log("Test is : " + text, true);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Set<String> windowHandlers = driver.getWindowHandles();
		for (String windowHandle : windowHandlers) {
			driver.switchTo().window(windowHandle);
			String currentTitle = driver.getTitle();
			Reporter.log("currentTitle is " + currentTitle, true);
			if (!currentTitle.contains("https://www.w3schools.com/")) {
				Reporter.log("Closing Popup: " + currentTitle, true);
				driver.close();
			}
			Reporter.log("Title : " + currentTitle, true);

		}
	}

}
