package testScript;

import java.util.List;
import org.openqa.selenium.support.locators.RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumTableDay4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		String salary=driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary is.. " +salary);
		
		List<WebElement> employee=driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding::td[2]"));
		System.out.println(employee.size());
for (int i=0;i<employee.size();i++)
{
	System.out.println(employee.get(i).getText());
}

//String position=driver.findElement(with(By.tagName("td").
driver.quit();
	}
}


