package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{

	@FindBy(id = "Email")                        //Using "PageFactory" we are Inspecting all the Elements of EmailID, Password, remember, loginbutton here and storing it in a WebElement 
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id="RememberMe")
	WebElement remember;
	
	@FindBy(xpath = "//input[contains(@class,'login-button')]")
	WebElement loginButton;
	// (or) we can also store this single element in a List as like mwntioned below    
	// List<WebElement> loginButton;
	//"FindAll" Annotation is available just to find the WebElement (by condition) i.e., using more than 1 attribute to find a single element
	
	
	public LoginPage(WebDriver driver) { 
		
		this.driver=driver;
		PageFactory.initElements(driver,this);     //Constructor. As usual we are initiallizing Element using Pagefactory
	}
	
	public LoginPage enterEmail(String emailId) {
		
		email.sendKeys(emailId);      //Before using DataDriven we can mention it like  "email.sendKeys();"
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		
		password.sendKeys(pass);
		return this;
	}
	
	public LoginPage clickRememberMe() {
		
		remember.click();
		return this;
	}
	
	public HomePage clickLoginButton() {
		
		loginButton.click();
		return new HomePage(driver);
	}
}