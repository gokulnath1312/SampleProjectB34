package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandleDay5 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
           driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
           Set<String> tab=driver.getWindowHandles();
           System.out.println("Total Tabs is "+tab.size());
           for(String childWindow:tab) {
        	   if(!childWindow.equalsIgnoreCase(parentWindow))
        	   {
        		   driver.switchTo().window(childWindow);
        		  
        		   Thread.sleep(4000);
        		   driver.manage().window().maximize();
        		  System.out.println(driver.findElement(By.cssSelector("span.menu-item-text")).getText());
        		 
        	   }
           }
           driver.close();  
           driver.switchTo().window(parentWindow);
           Thread.sleep(1000);
           driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
           driver.switchTo().newWindow(WindowType.WINDOW);
           driver.get("https://www.selenium.dev/");
           driver.quit();
          
		
	}
}
