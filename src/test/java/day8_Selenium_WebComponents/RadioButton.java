package day8_Selenium_WebComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> button = driver.findElements(By.className("form-check-label"));
		
		String expectedText = "Yes";
		
		for(WebElement ele : button)
		{
			String actualText = ele.getText();
			
			if(actualText.equalsIgnoreCase(expectedText))
			{
				WebElement Radiobutton = driver.findElement(By.xpath("//label[text()='"+actualText+"']/preceding-sibling::input"));
				
			    if(Radiobutton.isEnabled())
			    {
			    	Radiobutton.click();
			    	break;
			    }
			    else
			    {
			    	System.out.println("Button is Disabled");
			    }
			    
			    if(Radiobutton.isSelected())
			    {
			    	System.out.println("Value is selected");
			    }
			    else
			    {
			    	System.out.println("Value is not selected");
			    }
			}
		}
		
	}

}
