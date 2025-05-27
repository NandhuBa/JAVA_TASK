package day9_WindowHandling_ALert_Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_NewTab {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		
		// Open main site
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Open new tab
		((JavascriptExecutor) driver).executeScript("window.open();", "");   //just a new Tab but no address for the Tab
		
		// Switch to the new tab
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> windows = new ArrayList<String> (windowHandles);
				driver.switchTo().window(windows.get(1));
				
				// Navigate to another site in new tab
				driver.get("https://www.google.com");
				driver.close();
	}

}
