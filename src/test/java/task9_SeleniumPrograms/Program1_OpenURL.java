package task9_SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_OpenURL {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();              //maximize the browser
		driver.navigate().to("https://www.google.com/");  //navigate method to navigate to URL
		String currentUrl = driver.getCurrentUrl();       //just assigning the current Url to a variable "currentUrl"
		System.out.println(currentUrl);                   //Printing the URL 
		driver.navigate().refresh();                      //Reloading the page
	    driver.close();	                                  //Closing the current tab/webpage

	}

}
