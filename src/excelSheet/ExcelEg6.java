package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream myFile=new FileInputStream("D:\\Velocity\\Java Class\\29th July Even\\29JulyEvenTest.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet3");
		int lastRowNum = mySheet.getLastRowNum();
		int totalNumOfRows= lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		int totalNumOfCells = lastCellNum-1;
		
		//outer for loop-->row
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			//inner for loop--> cells
			
			for(int j=0;j<=totalNumOfCells;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
	}

}
