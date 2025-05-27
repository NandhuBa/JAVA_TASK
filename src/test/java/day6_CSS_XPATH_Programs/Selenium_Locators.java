package day6_CSS_XPATH_Programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {

	public static void main(String[] args) throws InterruptedException{
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Selenium Webdriver", Keys.ENTER);
		//driver.findElement(By.className("gLFyf")).sendKeys("Selenium webdriver");
		//driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Search works")).click();
	
		
		// Find the no.of links in the webpage
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		// Print each links  -> Output should be in [text of the Lnk -> link]
		for(WebElement Link : Links)
		{
			String LinkText = Link.getText();
			String ActualLink = Link.getAttribute("href");
			System.out.println(LinkText+"->"+ActualLink);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

} }
