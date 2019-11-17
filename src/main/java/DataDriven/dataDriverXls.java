package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class dataDriverXls {
	
	
	public static void main(String[] args) throws Exception {
		
		
		File f= new File("C:\\Users\\hp\\Desktop\\DataDrivenxls.xls");
				
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = Workbook.getWorkbook(fis);
		
		Sheet sheet = wb.getSheet(0);
		
		for(int i=0;i<sheet.getRows();i++)
		{
			for(int j=0;j<sheet.getColumns();j++)
			{
				String data = sheet.getCell(j,i).getContents();
				
				System.out.println(data +"\\n");
				
			}
		}
		
		
		
		
		
		
	}

}
