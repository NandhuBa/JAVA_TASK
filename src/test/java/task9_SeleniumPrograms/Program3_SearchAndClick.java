package task9_SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3_SearchAndClick {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']")).click();
		
		//(or) driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
		driver.findElement(By.id("toc-History")).click();
		String Txt = driver.findElement(By.id("History")).getText();
		System.out.println(Txt);

	}

}
