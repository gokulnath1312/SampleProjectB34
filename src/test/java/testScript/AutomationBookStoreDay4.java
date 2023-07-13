package testScript;

import java.util.List;
import org.openqa.selenium.support.locators.RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutomationBookStoreDay4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.get("https://automationbookstore.dev/");
	Thread.sleep(3000);
	WebElement closeIcon=driver.findElement(By.xpath("//a[@title='Clear text']"));
	System.out.println("Close icon.."+closeIcon.isDisplayed());
		
		driver.findElement(By.cssSelector("input#searchBar")).sendKeys("Test") ;
		
		if(closeIcon.isDisplayed())
		{
			System.out.println("After entering text Close icon.."+closeIcon.isDisplayed());
			System.out.println("close icon is displaying after entering the text");
			closeIcon.click();
		}

driver.quit();
	}
}


