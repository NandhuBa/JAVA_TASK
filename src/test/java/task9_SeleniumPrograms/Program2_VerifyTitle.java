package task9_SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_VerifyTitle {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String Expected_Text = "STORE";
		if (Title.equalsIgnoreCase(Expected_Text))
			{
			System.out.println("Page landed on correct website");
			}
		else
			{
			System.out.println("Page not landed on correct website");
			};

	}

}
