package task11_Windows_And_Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_New_Window {

	public static void main(String[] args) throws InterruptedException {
	
	
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
	Set<String> windowHandles = driver.getWindowHandles(); 
	List<String> windows = new ArrayList<String>(windowHandles);  //still control is in parent window so we need to switch to child window to verify the text of new window
	       
	driver.switchTo().window(windows.get(1));
    String Actualtext = "New window"; 
    WebElement txt = driver.findElement(By.xpath("//div[@class='example']/h3"));
       
      
    String Expectedtext = txt.getText();
    System.out.println(Expectedtext);
       
    if(Actualtext.equalsIgnoreCase(Expectedtext))
    {
    System.out.println("Verified! the text 'New Window' is present on the page");
    } 
    else
    {
    System.out.println("New Window is not yet opened");
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  //Explicit wait
       //Thread.sleep(2000);
    driver.close();                  //now control in child window, so closing child window
       
    driver.switchTo().window(windows.get(0)); //Still we need to switch to parent window to see if its active
    String text = driver.getTitle(); 
    System.out.println();
    System.out.println("Original window is active now");

    Thread.sleep(2000);
    driver.quit();                 //now closing parent window
	}
	}
}
