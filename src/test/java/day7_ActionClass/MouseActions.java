package day7_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions mouse = new Actions(driver);
		
		WebElement Ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		mouse.doubleClick(Ele).perform();
		
		driver.findElement(By.xpath("//button[@type='button')]"));
		mouse.contextClick().perform();
		
		
		
	}

}
