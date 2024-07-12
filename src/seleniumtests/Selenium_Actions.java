package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_Actions extends BaseTest {

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * Listener(args); Action(args); Alert(args); }
	 */

	@Test(priority = 1)
	public void Listener() {

		WebDriver originalDriver = new ChromeDriver();
		seleniumtests.Listener listener = new seleniumtests.Listener();
		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);
		WebDriver driver = decorator.decorate(originalDriver);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Actions action = new Actions(driver);
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		action.clickAndHold(draggableElement).moveToElement(droppableElement);
		// Thread.sleep(3000);
		// action.dragAndDrop(draggableElement, droppableElement).build().perform();
		Reporter.log("Action is Completed Successfully for drag and drop", true);
		driver.quit();
	}

	@Test(dependsOnMethods = "Alert", alwaysRun = true)

	public void Action() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Sai Prakash");
		driver.findElement(By.id("userEmail")).sendKeys("saiprakash.m1896@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("currentAddress"))).keyDown(Keys.CONTROL).keyDown("A")
				.keyDown(Keys.CONTROL).keyDown("C").build().perform();
		action.click(driver.findElement(By.id("permanentAddress"))).keyDown(Keys.CONTROL).keyDown("V").build()
				.perform();
		// Thread.sleep(3000);
		Reporter.log("Pasted Permenant Address Sucessfully", true);
		driver.quit();
	}

	@Test(priority = 2)
	public void Alert() {
		WebDriver OriginalDriver = new ChromeDriver();
		Listener listener = new Listener();
		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);
		WebDriver driver = decorator.decorate(OriginalDriver);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		String pageTitle = driver.getTitle();
		// Thread.sleep(2000);
		Reporter.log("Page Title : " + pageTitle, true);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		// Thread.sleep(2000);
		String alertmessage = driver.switchTo().alert().getText();
		Reporter.log("Alert message is : " + alertmessage, true);
		// Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		Reporter.log("Alert message1 is : " + confirmResult, true);
		driver.quit();
	}
}