package day8_Selenium_WebComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException{
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/* driver.switchTo().frame(0);
		
		List<WebElement> options = driver.findElements(By.xpath("//legend[text()='Hotel Ratings:']/following-sibling::label"));
		
		String expectedText = "4 Star";
		
		for(WebElement ele : options)
		{
			String actualText = ele.getText();
			if (actualText.equalsIgnoreCase(expectedText))
			{
				System.out.println("Executed successfully");
				ele.click();
				break;
			}
		} */
		
		
		 driver.switchTo().frame(0);
		
		List<WebElement> options = driver.findElements(By.xpath("//legend[text()='Hotel Ratings: ']/following-sibling::label"));
		
		String expectedText="4 Star";
		
		//Actions act = new Actions(driver);
		
		for(WebElement ele : options) {
			
			String actualText = ele.getText();
			if(actualText.equalsIgnoreCase(expectedText)) {
				
				System.out.println("Executed successfully");
				ele.click();
				//ele.click();
				break;
			}
		} 
		
	} 
	} 

}
