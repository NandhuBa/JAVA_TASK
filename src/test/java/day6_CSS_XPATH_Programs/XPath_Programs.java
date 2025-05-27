package day6_CSS_XPATH_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Programs {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Absolute xpath
		//WebElement offer = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/a[3]"));
		//System.out.println(offer.isDisplayed());    //isDisplayed() method of WebElement interface is used to check whether the element is visible or not on the web page
		
		// Attribute based xpath
		//driver.findElement(By.xpath("//a[@id='orders']")).click();
		
		// Text based xpath
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'indicatorContainer')])[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		
	}

}
