package day9_WindowHandling_ALert_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
       driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();   //now clicking the box outside in default then switch inside
		
		// switching to the parent frame
		driver.switchTo().frame(2);                             //Here it is 3rd iframe from beginning
		
		// switch to the child frame
		driver.switchTo().frame(0);                             //Here it is 1st iframe from Parent Frame
		
		driver.findElement(By.tagName("input")).sendKeys("demotest");
		
		// Switch from child to default
      	driver.switchTo().defaultContent();                     //Swiching back directly from Child to default (switching back is possible from child to default but while swithing in we need to go from Default to parent then to child frame
	    driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		// switch from child to parent
		driver.switchTo().parentFrame();                        //Switching back directly from Child to parent
		
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
		
		// switch from parent to default
		driver.switchTo().defaultContent();                      //Swiching back directly from parent to default
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();

	}

}
