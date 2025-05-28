package task11_Windows_And_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames_Program {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
		//Switch to Top-Frame
		driver.switchTo().frame("frame-top"); 
		System.out.println("Found 3 Frames under TOP-FRAME");
		
		//Switch to Left-Frame
		WebElement Lft = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(Lft);
		
	    WebElement Lft1 = driver.findElement(By.tagName("body"));
	    String text = Lft1.getText();
	    System.out.println("Verified! this frame has the text" + " " + text);
	    
	    
	    //switch back to Top-Frame (Frame as string)
	    driver.switchTo().parentFrame();
	    
	    //switching to middle frame (Frame as Webelement)
	    WebElement mdl = driver.findElement(By.xpath("//frame[@name = 'frame-middle']"));
	    driver.switchTo().frame(mdl);
	    
	    WebElement mdl1 = driver.findElement(By.cssSelector("div#content"));
	    String text1 = mdl1.getText();
	    System.out.println("Verified! this frame has the text" + " " + text1);
	    
	    //switch back to Top-Frame
	    driver.switchTo().parentFrame();
	    
	  //switching to Right frame
	    driver.switchTo().frame("frame-right");
	    
	    WebElement Rgt = driver.findElement(By.tagName("body"));
	    String text2 = Rgt.getText();
	    System.out.println("Verified! this frame has the text" + " " + text2);
	    
	    //switch back to Top-Frame
	    driver.switchTo().parentFrame();
	    
	    //switch back to Default
	    driver.switchTo().defaultContent();
	    
	  //switching to Bottom frame (Frame as index)
		driver.switchTo().frame(1);    
	    
	    WebElement Bottom = driver.findElement(By.tagName("body"));
	    String text3 = Bottom.getText();
	    System.out.println("Verified! this frame has the text" + " " + text3);
	    
	    //switch back to Default
	    driver.switchTo().defaultContent();
	    
		//Switch back to Top-Frame
		driver.switchTo().frame("frame-top"); 

	}

}
