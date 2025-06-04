package utils;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Utility {

	public static WebDriver driver;
	public static Properties prop;    //Properties - is a class where we read everything as a property. this object prop should be common from wherever the class we call
	
	public void launchBrowserAndLoadUrl(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		} else {
			
			driver= new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	public void browserClose() {
		
		driver.close();
	}
	public static void readFromPropFile() throws IOException     //static - we declare as static means we can call directly easily instead of creating object. 
	{
		FileReader file = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\POM\\src\\test\\resources\\data\\testdata.properties");
		prop = new Properties(); 
		prop.load(file);            //Using this load class only we are going to load the file. This class only split the variables and values from the File. This may through 
		                            // FileReader is a class where we pass this URL and read the mentioned file using this FileReader class
		                            // Now each thing in property file is a Property, so after reading the file, we load each & everything. Then only we pass it to the methods
		                            // Here we just load the data
		FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\POM\\src\\test\\resources\\data\\testdata.properties");
		prop.store(output, "Validate message");
		output.close();
		
		// (or) For using FileReader we can also store the filepath as below:
		//String Filepath = "C:\\Users\\Admin\\eclipse-workspace\\POM\\src\\test\\resources\\data\\testdata.properties";
		//FileReader file = new FileReader(Filepath);
		//prop = new Properties(); 
		//prop.load(file);
		
	}       
	
	public static String[][] readExcel() throws IOException {
		// Open the workbook
				XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\POM\\src\\test\\resources\\data\\LoginTestData.xlsx");
				
				// Open the sheet
				
				XSSFSheet sheet = book.getSheet("LoginData");
				
				// get the no.of rows
				
				int rowCount = sheet.getLastRowNum();
				
				// get the column count
				
				int columnCount = sheet.getRow(0).getLastCellNum();
				
				// Create 2D array
				
				String[][] data = new String[rowCount][columnCount];
				
				// Get into each row
				
				for(int i=1; i<=rowCount; i++) {
					
					XSSFRow row = sheet.getRow(i);
					
					// get into the column
					
					for(int j=0; j<columnCount ; j++) {
						
						XSSFCell cell = row.getCell(j);
						
						// read the value
						
						System.out.print(cell.getStringCellValue()+"|");
						
						// to store in array
						
						data[i-1][j]=cell.getStringCellValue();
					}
					
					System.out.println();
				}

				book.close();
				return data;
	}
}                                   


