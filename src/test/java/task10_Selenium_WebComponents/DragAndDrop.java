package task10_Selenium_WebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		

		String Actualcolor = "rgba(255, 250, 144, 1)";
		String Expectedcolor = destination.getCssValue("background-color");
		System.out.println(Expectedcolor); 
		
		if(Actualcolor.equalsIgnoreCase(Expectedcolor))
		{ 
			System.out.println("Drag and Drop Operation is successful");
		}
		else
		{
			System.out.println("Drag and Drop Operation is failed"); 
		}
	 
		
		String text = destination.getText();
		System.out.println();
		System.out.println(text);
	
	}
}
