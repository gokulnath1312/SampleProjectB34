package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/blog");
		//driver.findElement(By.className("login signup__cta")).click();
		
		List<WebElement> path=driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[@id='menu-item-1423']//following-sibling::li"));
		System.out.println(path.size());
		driver.quit();

	}

}
