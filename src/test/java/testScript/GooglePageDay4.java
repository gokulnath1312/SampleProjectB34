package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageDay4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
//		WebElement schBox = driver.findElement(By.name("q"));
//		WebElement schBox = driver.findElement(By.id("APjFqb"));
		
//		WebElement schBox = driver.findElement(By.className("gLFyf"));
		WebElement schBox = driver.findElement(By.tagName("textarea"));
		schBox.sendKeys("Java Tutorial");
		Thread.sleep(1000);
		
		List<WebElement> dropdown=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//*[@class='pcTkSc']"));
		System.out.println(dropdown.size());
		for (WebElement item:dropdown)
		{
			System.out.println();
			if(item.getText().equalsIgnoreCase("Java Tutorial pdf"))
			{
				item.click();
				break;
			}
		}
		driver.quit();

	}

}
