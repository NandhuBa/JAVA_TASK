package task10_Selenium_WebComponents;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guvi_SignUp_And_Login {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in//");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//SIGNUP 
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("name")).sendKeys("Nandhini");
		driver.findElement(By.id("email")).sendKeys("Nandhini6878@gmail.com");
		driver.findElement(By.id("password")).sendKeys("A123456!");
		driver.findElement(By.id("mobileNumber")).sendKeys("9994548398");
		driver.findElement(By.id("signup-btn")).click();

		WebElement profile = driver.findElement(By.id("profileDrpDwn"));
		Select prof = new Select(profile);
		prof.selectByValue("Looking for a career");
		
		WebElement degree = driver.findElement(By.id("degreeDrpDwn"));
		Select deg = new Select(degree);
		deg.selectByValue("B.E. / B.Tech. Computer Science");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter year']")).sendKeys("2013");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		WebElement signup = driver.findElement(By.className("left-head"));
		String Sign_cfm = signup.getText();
		System.out.println(Sign_cfm);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		// LOGIN
		((JavascriptExecutor) driver).executeScript("window.open();", "");
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String> (windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.get("https://www.guvi.in//");
		
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nandhinibalak92@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Niki@121113");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
	}

}
