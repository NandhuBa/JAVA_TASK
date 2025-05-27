package day8_Selenium_WebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.makemytrip.com/");
	
	
		
		String Expected_month = "September 2025";
		int date = 6;
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		while(true)
		{
		     String actual_month = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			
			if(actual_month.equalsIgnoreCase(Expected_month))
			{
				break;
			}
			
			else 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//p[text()='"+date+"']")).click();
		
	}

}
