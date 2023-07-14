package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShawdowTreeDay5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
		WebElement showdowhost=driver.findElement(By.id("shadow_host"));
	
		SearchContext context=showdowhost.getShadowRoot();
		WebElement showdowText=context.findElement(By.cssSelector("#shadow_content"));
		System.out.println("Show root content is..."+showdowText.getText());
		//input[@name='username']
		//input[@id='username']
		
	}
}
