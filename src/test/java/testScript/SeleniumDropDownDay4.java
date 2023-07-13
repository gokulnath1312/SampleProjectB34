package testScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumDropDownDay4 {

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
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
		Thread.sleep(1000);

Select sel=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
sel.selectByValue("Wednesday");
Thread.sleep(1000);
System.out.println("Drop down value is.."+(driver.findElement(By.xpath("//select[@id='select-demo']")).getText()));
//String position=driver.findElement(with(By.tagName("td").

Select selOption=new Select(driver.findElement(By.id("multi-select")));

selOption.selectByValue("California");
selOption.selectByVisibleText("Florida");
selOption.selectByIndex(5);
Thread.sleep(1000);
System.out.println("Selected value is>>>" +selOption.getAllSelectedOptions().size());
System.out.println("Before Deslection Value is......");
for (WebElement item:selOption.getAllSelectedOptions())
{
	System.out.println(item.getText());

	}
selOption.deselectByIndex(5);
System.out.println("Selected value is>>>" +selOption.getAllSelectedOptions().size());
System.out.println("After Deslection Value is......");
for (WebElement item:selOption.getAllSelectedOptions())
{
	System.out.println(item.getText());

	}
driver.quit();
	}
}


