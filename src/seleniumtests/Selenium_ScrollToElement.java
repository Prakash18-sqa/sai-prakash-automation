package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_ScrollToElement {

	//public static void main(String[] args) throws InterruptedException {
		@Test
		public void js() {
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		String pageTitle = driver.getTitle();
		System.out.println("Current PageTitle : " + pageTitle);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
		//Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5")).click();
		driver.quit();

	}

}
