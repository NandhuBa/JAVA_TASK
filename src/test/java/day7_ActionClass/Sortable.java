package day7_ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.switchTo().frame(0);
		
		List<WebElement> items = driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", items.get(0));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(items.get(0), items.get(3)).perform();	

	}

}
