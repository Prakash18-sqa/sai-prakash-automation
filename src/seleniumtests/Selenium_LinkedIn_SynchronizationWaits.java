package seleniumtests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_LinkedIn_SynchronizationWaits {
	@Test

	public static void Synchronisation() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.linkedin.com/checkpoint/lg/login");
		driver.findElement(By.id("username")).sendKeys("mogiligiddasaiprakash@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prakash@18");
		ExplicitWait(
				driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")));
		driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		String getCurrentUrl = driver.getCurrentUrl();
		Reporter.log("CurrentUrl is " + getCurrentUrl, true);
		FluentWaitForElement(driver.findElement(By.id("ember17")));
		driver.findElement(By.id("ember17")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		// waitForPageToLoad();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		Reporter.log(driver.getCurrentUrl(), true);
		driver.quit();

	}

	private static void FluentWaitForElement(WebElement element) {
		WebDriver driver = null;
		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(1))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.visibilityOf(element));

	}


	public static void ExplicitWait(WebElement element) {
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
