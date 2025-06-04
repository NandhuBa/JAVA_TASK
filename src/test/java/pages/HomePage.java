package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{  //always we extend only ProjSpecifi class because we are going to launch browser each time
	
	
	@FindBy(className  = "ico-login")         //Using @FindBy annotation, we locate element here using "Classname". Any Locators can be used not only Classname. (refer notes for detailed explaination)
	WebElement login; 
	
	@FindBy(xpath = "//div[@class='validation-summary-errors']/ul/li")  // [This is for  Login-Page
	WebElement noUser;
	                                            //Every page we create this constructor for chaining. Anyways this will invoke during object creation. 
	public HomePage(WebDriver driver) {         // We pass "driver" as parameter means -> we are going to work on the driver. we do chaining only with help of this driver
		                                        // So In each and every class we create a construtor, with the parameter "driver"        
		this.driver=driver;                     // we already receive a driver from "projctspec" method and here while creating object we have another driver, so to mention both are same we are declaring "this.driver = driver" (means both are same instance)
		PageFactory.initElements(driver,this);
	}
	
	public RegisterPage clickRegister() {     // once we click on register button it should take us to register page. Currently our driver pointing here. So now we are going to move the driver to register page
		                                      // so driver should "return" to Register page after clicking register from Homepage, for that we create constructor above 
		driver.findElement(By.className("ico-register")).click();
		return new RegisterPage(driver);      //here constructor chaining happen by calling constructor defined in "Register page".. It returns to register page. So now my driver pointer moves to Regiser page
	}                                         //Here "new" keyword used mainly to allocate memory for the constructor in Register page
	                                          // So with the help of this object "driver" created in homepage, we are calling methods in Register page (by creating memory for the Register page using "new keyword") (Memory created for all methods, variables, etc.,)
	
	
	public HomePage valiadteLoginAndSignUp(String expectedMessage) {     //After registeration by clicking continue driver points here and from here we are validating whether signup done successfully
		                                                                 //this "expectedMessage" is the mail-id that we refer for validation that we get runtime while calling this method from "test package"
		String actualText = driver.findElement(By.className("account")).getText();
		prop.setProperty("Message", actualText);               //This code is for "Writing values into Property/Flat File"
		if(expectedMessage.equals(actualText)) {
			System.out.println("Register completed sucessfully");
		} else {
			
			System.out.println("Validation failed");
		}
		return this;                                                   // Now the next step is -> we need to call all the methods from "Test package" by creating object
	}
	
public void validateLogin(String testType, String expectedMessage) {    //This Method is for login page
		
		if(testType.equals("ValidEmailValidPassword")) {
			
			String actualText = driver.findElement(By.className("account")).getText();
			if(expectedMessage.equals(actualText)) {
				System.out.println("Login completed sucessfully");
			} else {
				
				System.out.println("Validation failed");
			} 
					
			}else if(testType.equals("InvalidEmailValidPassword") || testType.equals("ValidEmailInvalidPassword") || testType.equals("InvalidEmailInvalidPassword")) {
				
				String actualText = noUser.getText();
				if(expectedMessage.equals(actualText)) {
					System.out.println("Login faild with message " + actualText);
				} else {
					System.out.println("Application Failed");
				}
		}
		
	}

	public LoginPage clickLogin() {
		
		login.click();                                 //Using PageFactory we inspect login Element and store it in a Webelement "Login" at the start of the program and we are clicking here 
		return new LoginPage(driver);                 // Returning to Login page
	}
	

}