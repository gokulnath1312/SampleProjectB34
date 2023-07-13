package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		driver.get("https://demo.opencart.com/");
		Actions action = new Actions(driver);
		WebElement searchbox=driver.findElement(By.id("search"));
		
		WebElement menu=driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-child(3)"));
		WebElement submenu=driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-child(3)>div>div>ul>li:nth-child(2)"));
		
		action.moveToElement(menu).click(submenu).build().perform();
		Thread.sleep(2000);
		
//		WebElement schBox = driver.findElement(By.name("q"));
//		WebElement schBox = driver.findElement(By.id("APjFqb"));
		
/*	WebElement schBox = driver.findElement(By.className("gLFyf"));
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
		*/
		driver.quit();

	}

}
