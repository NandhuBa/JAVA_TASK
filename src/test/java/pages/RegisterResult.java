package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterResult extends ProjectSpecificationMethods{

	public RegisterResult(WebDriver driver) {            //Now driver pointer moves here after clicking register button from "RegisterPage"
		
		this.driver=driver;
	}
	
	public HomePage clickContinue() {                    //Application designed in a way to click "continue" in Homepage after registration
		
		driver.findElement(By.xpath("//input[contains(@class,'register-continue-button')]")).click();
		return new HomePage(driver);                     //after clicking continue the pointer will goes to Homepage. And here only we are creating memory for Homepage methods and variables using construtor.
	}
}