package day10_DropDown_ExplicitWait_Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_Demo {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,' css-tlfecz-indicatorContainer')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
	
		driver.findElement(By.id("react-select-2-option-0-0")).click();
		
		WebElement cars = driver.findElement(By.id("cars"));
		act.moveToElement(cars).perform();
		
		Select sel = new Select(cars);
		sel.selectByValue("volvo");
		sel.selectByValue("saab");
		sel.selectByVisibleText("Opel");
		sel.selectByIndex(3);
		
		sel.deselectByValue("saab");

	}

}
