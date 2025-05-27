package day5_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Commands 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));   //implicit wait
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(5000);	 - > Java wait (use mainly for OTP and captchas)	
		//Work with WebElements
		
		//To find the username
		driver.findElement(By.id("user-name"));
		WebElement Username = driver.findElement(By.id("user-name"));
		
		Username.sendKeys("standard_user");                   //cannot assign and pass variable in same line
		
		Username.clear();       //To clear the value of the "Username" textbox
		Username.sendKeys("problem_user");
		
		// getAttribute("attribute_name"); Method
		
		System.out.println(Username.getAttribute("user-name"));  //Used to get the value of an attribute of the element
		String attribute = Username.getAttribute("user-name");  // we can also assign variable 
		
		//To find the password
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	  //To find (or) click login
	    
	    WebElement login = driver.findElement(By.name("login-button"));   //Here assigning variable for login. To do click function
	    login.click();
	    
	  //Validate the login (whether webpage goes to login page after click)
	    
	    WebElement login_logo = driver.findElement(By.className("app_logo"));  //check whether we can locate the logo in next page
	    
	 // Check whether the element(logo) is present 	
	    boolean flag = login_logo.isDisplayed();
	    System.out.println(flag);
	    
	    String Expect_text = "Swag Labs";
	    if(flag)
	    {
	      String logo_text = login_logo.getText();
	      System.out.println(logo_text);
	      
	      if(logo_text.equalsIgnoreCase(Expect_text))
	      {
	    	  System.out.println("Login sucessful!!");
	      }
	      else 
	      {
	    	  System.out.println("Check the element text");
	      }
	    }
	      else
	      
	      { 
	    	  System.out.println("Logo not dosplayed");
	      
	      }
	    
	    System.out.println(login_logo.getLocation());
	    
	    System.out.println(login_logo.getTagName()); 
	    
	    
	   // STALE ELEMENT EXCEPTION BELOW --> (org.openqa.selenium.StaleElementReferenceException)
	   // System.out.println(Username.getAttribute("user-name"));    //now we are in LoginPage so we cannot get the Attribute for "Username" (it will through Stale element exception. However we can get attribute_name only for the elements in current last page
	      
	    
	    }
	      
	     
}
