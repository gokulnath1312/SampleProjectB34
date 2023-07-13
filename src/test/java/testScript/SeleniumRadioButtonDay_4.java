package testScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.locators.RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumRadioButtonDay_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		Thread.sleep(1000);
		
WebElement radio=driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
if(!radio.isSelected())
{
	radio.click();
}

//String position=driver.findElement(with(By.tagName("td").
driver.quit();
	}
}


