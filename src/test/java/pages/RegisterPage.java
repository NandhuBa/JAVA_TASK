package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods{
	
	public RegisterPage (WebDriver driver) {                         //same constructor declaration as explained early
		
		this.driver=driver;
	}
	
	public RegisterPage choseGender(String gender) {                //1st step --> Returning to Register page from HomePage while calling constructor
		                                                
		if(gender.equalsIgnoreCase("male")) {
		driver.findElement(By.id("gender-male")).click();
		} else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		return this;                                                //Now this will not return to any page but only this page.so we are giving "return this"
	}
	
	public RegisterPage enterFirstName(String firstname) {          //Here "RegisterPage" refers to return type - meaning pointer does not return to any page but will be here only.
		                                                            //enterFirstName(String firstname) --> Here passing parameter "firstname" as generic because it helps in Data-Driven Testing (While calling this method from "Test package" it comes with runtime values from Excel, each time)
		driver.findElement(By.id("FirstName")).sendKeys(firstname); // Definitely firstname values will be dynamic
		return this;                                                //Same - driver will not return to any page but only 
	}
	
	public RegisterPage enterLastName(String lastname) {            //Same explaination for this
		
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		return this;
		
	}
	
	public RegisterPage enterEmail(String email) {                  //Same explaination for this
		
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterPage enterPassword(String pass) {                 //Same explaination for this
		
		driver.findElement(By.id("Password")).sendKeys(pass);
		return this;
	}
	
	public RegisterPage enterConpass(String conPass) {                 //Same explaination for this
		 
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conPass);
		return this;
		
	}
	
	public RegisterResult clickSubmit() {                               
		
		driver.findElement(By.id("register-button")).click();    
		return new RegisterResult(driver);                              //Here after clicking the button it returns to "RegisterResult" page that we have created separately (same memory allocation for the class here)
	}

}