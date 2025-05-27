package day6_CSS_XPATH_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) 
	
	{
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Selenium Locators", Keys.ENTER);
	    //driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("Selenium Locators", Keys.ENTER);
		//Thread.sleep(1000);     //when this used we must use (throws InterruptedException{ ) near main method
				
	    //driver.findElement(By.cssSelector("textarea[role='combobox']")).sendKeys("Selenium Webdriver", Keys.ENTER);
		//driver.findElement(By.cssSelector("textarea[autocomplete='off'][class='gLFyf']")).sendKeys("Selenium Webdriver", Keys.ENTER);
			

		//Using "bstackdemo" Website
		driver.get("https://bstackdemo.com/");
		
		// CSS selector using id attribute 
				//driver.findElement(By.cssSelector("a#offers")).click();
				
		// CSS Selector combining attributes
		WebElement offers = driver.findElement(By.cssSelector("a[id='offers'][href='/offers']"));
		System.out.println(offers.isDisplayed());
				
		// CSS Selector using class attribute
		WebElement logo = driver.findElement(By.cssSelector("a.Navbar_logo__26S5Y"));
		System.out.println(logo.isDisplayed());
				
		// CSS selector using other attribute
		driver.findElement(By.cssSelector("span[role='link']")).click();
		
	}

}
