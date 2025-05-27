package day10_DropDown_ExplicitWait_Sync;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWait_Snapshot {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://uitestingplayground.com/ajax");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));    //Page Load initiallization
		
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnclick.click();
		
		// Step 1: Set the time Duration
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Step2: Set the condition to wait
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
		
	//	String text = driver.findElement(By.xpath("//p[@class='bg-success']")).getText();
    //		System.out.println(text);
		
		
		// Fluent wait
	
		Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)   //wt is another object created for wait
				.withTimeout(Duration.ofSeconds(15))         // set the duration
				.pollingEvery(Duration.ofMillis(15))         // customize the interval
				.withMessage("Increase the wait time")       //Display message
				.ignoring(NoSuchElementException.class);     // to ignore any specific expection
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
		
		String text = driver.findElement(By.xpath("//p[@class='bg-success']")).getText();
		System.out.println(text);
		
		
		// Take screenshot
		
				// Capture the screenshot
				
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// Mnetion the target path
				
				File dest = new File("C:\\Users\\Digital Suppliers\\second-workspace\\SeleniumPractice\\screenshots\\sample.png");
				
				// saving the captured screenshot in the mentioned location
				FileUtils.copyFile(source, dest); 
		

	}

}
