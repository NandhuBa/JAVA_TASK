package task10_Selenium_WebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Program {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);      //switching to iframe 
		WebElement ele = driver.findElement(By.className("hasDatepicker"));
		ele.click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();    //as per condition just selecting next month using single click
		driver.findElement(By.cssSelector("a[data-date='22']")).click();
		
		String text = ele.getAttribute("value");
		System.out.println(text);
		driver.quit();

	}

}
