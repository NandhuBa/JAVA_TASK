package day5_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_And_Navigation_Commands {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//String url = "https://www.spicejet.com/";   // Another way of passing URL
		//driver.get(url);                            // Another way of passing URL
		
		// To get the webpage title
		
		String Title = driver.getTitle();
		System.out.println("The Title is" +Title );
		
		// To get the current title
		
		String currentUrl = driver.getCurrentUrl();       //just assigning the current Url to a variable "currentUrl"
		System.out.println(currentUrl);                   //Printing the URL 
		
		//To get the page source
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);  
		
		// browser navigate methods
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to(currentUrl);
		
		//Step4: Close browser
				driver.quit();
		

	}

}
