package day9_WindowHandling_ALert_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Options manage = driver.manage();
		manage.window().maximize();
		manage.timeouts().implicitlyWait(Duration.ofSeconds(20));  // [Does not control alert]
		
		
		//Simple Alert
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'display an  alert box')]")).click();
		
		Alert simple = driver.switchTo().alert();    //Alert is an Interface which has the methods to handle and simple is the object, whereas alert() is to handle the alert
		String alertText = simple.getText();
		System.out.println(alertText);
		simple.accept();
		
		
		// Confirm Alert
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		// Prompt alert
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Demouser");
		prompt.accept();
		
		String text2 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text2);

	}

}
