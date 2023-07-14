package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlertDay5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert text is..."+alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000);
		Alert alert2=driver.switchTo().alert();
		System.out.println("Confirm Alert text is..."+alert2.getText());
		alert2.dismiss();
		
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Thread.sleep(1000);
		Alert alert3=driver.switchTo().alert();
		
		System.out.println("Prompt Alert text is..."+alert3.getText());
		Thread.sleep(2000);
		//alert3.wait();
			alert3.sendKeys("Gokul");
		alert3.accept();
		Thread.sleep(1000);
		System.out.println("Prompt Alert entered text is..."+ driver.findElement(By.id("prompt-demo")).getText());
		driver.quit();
		
		
		
		
	}

}
