package java_Task5_Programs;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.io.FileOutputStream;

public class WriteExcel {

	public static void main(String[] args) throws Exception
	{
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("LoginData");
		Object [][] data = {
				{"Name", "Age", "Email"},
				{"John Doe", "30", "john@test.com"},
				{"Jane Doe", "28", "john@test.com"},
				{"Bob Smith", "35", "jacky@example.com"},
				{"Swapnil", "37", "swapnil@example.com"},
		};
		int rowCount =0;
		
		for(Object[] row1 : data) {
			XSSFRow row = sheet.createRow(rowCount++);
			
			int columnCount=0;
			
			for (Object col: row1)
			{
				XSSFCell cell = row.createCell(columnCount++);
				
                   if(col instanceof String) {
					
					cell.setCellValue((String)col);
             } else  if (col instanceof Integer) {
					
					cell.setCellValue((Integer)col);
             
		}


	}

}
		
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\Maven_Files\\src\\main\\java\\WriteExcel.xlsx");
			book.write(output);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		book.close();
}
}
