package day8_Selenium_WebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Fullname = driver.findElement(By.xpath("//input[@id='userName']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(Fullname).perform();  //used when moving mouse pointer (in default content)
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Fullname); //scroll upto given element
		
		
		Fullname.sendKeys("Nandhini");
		Fullname.clear();
		
		

	}

}
