package testScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_JavaScriptExecutor_Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String strTitel = (String)js.executeScript("return document.title");
		System.out.println("Title is...." + strTitel);
		js.executeScript("window.scrollBy(10,500)");
		js.executeScript("Window.scrollBy(10, document.body.scrollHeight)");
		WebElement srcbox=(WebElement)js.executeScript("return.document.getElementByName('input-password')");	
		System.out.println("Search box is "+srcbox.getText());
		driver.quit();

	}

}
