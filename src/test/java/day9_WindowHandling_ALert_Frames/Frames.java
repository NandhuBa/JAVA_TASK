package day9_WindowHandling_ALert_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// switch to frame
		// 1) By index
		
		driver.switchTo().frame(1);                         //frame always starts with 0 index. here its in 2nd frame
		driver.findElement(By.tagName("input")).sendKeys("Testuser");
		
             
		// 2) By String (Either id /name - attribues) 
		
        driver.switchTo().frame("singleframe");             //singleframe is the value of id attribute
		driver.findElement(By.tagName("input")).sendKeys("Testuser");
		
		
		// 3) By WebElement
				WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));  //inspect and storing in webelement
				driver.switchTo().frame(frameElement);
				
				driver.findElement(By.tagName("input")).sendKeys("Testuser");
				
				driver.switchTo().defaultContent();                  //To come out of Frame
				
				driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click(); 

	}

}
