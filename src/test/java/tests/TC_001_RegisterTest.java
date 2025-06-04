package tests;
import java.io.IOException;

//Before using TestNG, we need to call ProjSpec method manually but after using TestNG, it will do using annotations
import base.ProjectSpecificationMethods;                        // Still TestNG has not started, so we are running it as java application
import pages.HomePage;                                          // Actual execution starts here only 
                                                                // Here only we have main method for execution 
public class TC_001_RegisterTest extends ProjectSpecificationMethods{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
  
		readFromPropFile();    //Now this method will take and load the file from mentioned path and make it ready for next action
		ProjectSpecificationMethods obj = new ProjectSpecificationMethods();
		obj.browserLaunchAndUrlLoad("chrome", "https://demowebshop.tricentis.com/"); 
		
		HomePage obj1 = new HomePage(driver);           //create object for homepage for calling. While entering . it suggest us all the methods not only in Homepage but from Register Page also only because of "Constructor Chaining"
		obj1.clickRegister()
		.choseGender(prop.getProperty("gender"))
		.enterFirstName(prop.getProperty("Firstname"))        //Passing values from here for all the methods
		.enterLastName(prop.getProperty("Lastname"))
		.enterEmail(prop.getProperty("Email"))
		.enterPassword(prop.getProperty("Password"))
		.enterConpass(prop.getProperty("Conpass"))
		.clickSubmit()
		.clickContinue()
		.valiadteLoginAndSignUp(prop.getProperty("validateMsg")); 
		
		obj.closeBrowser();                      //if we close browser using Homepage obj "obj1" then browser close quickly after passing al these values and we cannot observe the result. 
		                                         //So after execution we need to close the browser using ProjSpec obj "obj" 
	}

}