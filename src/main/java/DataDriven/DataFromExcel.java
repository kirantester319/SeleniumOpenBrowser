package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFXmlColumnPr;

public class DataFromExcel {
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		
File f = new File("C:\\Users\\hp\\Desktop\\DataDriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int  row = sheet.getLastRowNum();
		int column = sheet.getDefaultColumnWidth();
		
		
		System.out.println("Total no of rows "+ row);
		System.out.println("Total no of columns" + column);
		
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				
		String cellvalue= sheet.getRow(i).getCell(j).toString();
		
		System.out.println(cellvalue);
		
			}
		}
		
		
		
	}

}
