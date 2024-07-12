package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class WebElements_LinkedInLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver originalDriver = new ChromeDriver();
		seleniumtests.Listener listener = new seleniumtests.Listener();
		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);
		WebDriver driver = decorator.decorate(originalDriver);
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		String pageTitleString = driver.getTitle();
		System.out.println("pageTitleString : " + pageTitleString);
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.isDisplayed();
		userNameTextBox.isEnabled();
		userNameTextBox.sendKeys("mogiligiddasaiprakash@gmail.com");
		System.out.println("userNameTextBox : " + userNameTextBox);
		WebElement userPassword = driver.findElement(By.id("password"));
		userPassword.isDisplayed();
		userPassword.isEnabled();
		userPassword.sendKeys("Prakash@18");
		System.out.println("Prakash@18 : " + userPassword);
		driver.findElement(By.xpath("//button[@data-litms-control-urn='login-submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ember146\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Satya Prakash")).click();
		driver.findElement(By.partialLinkText("Satya Prakash")).click();
		Thread.sleep(3000);
		WebElement userProfile = driver.findElement(By.partialLinkText("Sai Prakash Mogiligidda"));
		userProfile.isDisplayed();
		userProfile.isEnabled();
		System.out.println("User Profile Name : Satya Prakash" + userProfile);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Testcase is Passed");
	}

}

