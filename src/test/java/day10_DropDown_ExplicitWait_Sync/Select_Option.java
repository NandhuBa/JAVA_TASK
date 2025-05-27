package day10_DropDown_ExplicitWait_Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Option {

	public static void main(String[] args) 
	{
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//locate the select tag
		WebElement birth_day = driver.findElement(By.id("day"));
		
		// Initialize the select class
		Select day = new Select(birth_day);
		
		// select by value
		day.selectByValue("3");
		
		WebElement birth_month = driver.findElement(By.id("month"));
		
		// choose month by visible text
		Select months = new Select(birth_month);
		months.selectByVisibleText("Mar");
		months.selectByVisibleText("April");
		months.selectByVisibleText("June");
		
		months.deselectByValue("June");
		
		// choose year using visible text
		
		WebElement birth_year = driver.findElement(By.id("year"));
		Select year = new Select(birth_year);
		year.selectByIndex(3);  // index starts from 0
	}

}
