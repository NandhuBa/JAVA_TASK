package day8_Selenium_WebComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/ref_httpmessages.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//String Text = driver.findElement(By.xpath("(//table) [1]//tr[2]//td[2]")).getText();  //(for Static Table - Just mention which table, which row and which column then it will print)
		//String Text = driver.findElement(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr[2]//td[2]")).getText();
		//System.out.print(Text);
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr"));
		List<WebElement> column = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//th"));
		
		int row_size = rows.size();
		int col_size = column.size();
		
		for (int i=1; i<=row_size; i++)
		{
			for (int j=1; j<=col_size; j++)
				
				if(i==1)
			{
				String value = driver.findElement(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr["+i+"]//th["+j+"]")).getText();
				System.out.print(value + " ");
			} 
				else if(i>1)
			{
				String Value = driver.findElement(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(Value + " "); 
			}
		                       
		System.out.println();
	}
	}
}
