package day9_WindowHandling_ALert_Frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_NewTab {

	public static void main(String[] args) 
	
	{
		//Another Way of WindowHandling
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		
		// Get current window handle
		String parentWindow = driver.getWindowHandle(); 
		
		// Get all open window handles
		Set<String> allWindow = driver.getWindowHandles();
		
		// Switch to the new window
		for(String window: allWindow) {
			
			if(!window.equals(parentWindow)) {
				
				driver.switchTo().window(window);
				break;
			}
			
		}
		
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
