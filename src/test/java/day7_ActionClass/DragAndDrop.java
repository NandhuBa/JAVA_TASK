package day7_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Locate the source element -> drag
		WebElement source = driver.findElement(By.id("box6"));
		
		// Locate the target element -> drop
		WebElement dest = driver.findElement(By.id("box106"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).perform();
		
	}

}
