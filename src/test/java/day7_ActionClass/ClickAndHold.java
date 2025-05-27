package day7_ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
		List<WebElement> items = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		
		Actions mouse = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//click and hold using Mouse
		mouse.clickAndHold(items.get(0)).moveToElement(items.get(3)).release().perform();
		
		
		// scrolling down for the entire item list to be visible
		js.executeScript("arguements[0].scrollIntoView(true);", items.get(0));
		mouse.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(1)).click(items.get(4)).click(items.get(5)).keyUp(Keys.CONTROL).perform();
		
		// switching out of frame to scroll upto the coordinates mentioned.
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(836, 1809)", "");
		

	}

}
