package day9_WindowHandling_ALert_Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multiple_WIndows {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]")).click();
		
		// Get set of windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Convert Set to List
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		// Pick up the particular window and switch to it
		
		driver.switchTo().window(windows.get(2));
		
		// get the title to validate the switch
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// switch to previous window
//		driver.switchTo().window(windows.get(1));
//		String title1 = driver.getTitle();
//		System.out.println(title1);
		
		//switch to parent window
		driver.switchTo().window(windows.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		
		//driver.close();

	}

}
