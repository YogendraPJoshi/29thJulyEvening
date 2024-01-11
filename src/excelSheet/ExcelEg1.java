package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\29th July Even\\29JulyEvenTest.xlsx");
		
		
		
		  Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		  CellType valueType =mySheet.getRow(0).getCell(0).getCellType();
		  
		  System.out.println(valueType);
		  String value = mySheet.getRow(0).getCell(0).getStringCellValue();
//		
		  System.out.println(value);
		
		
	}

}
