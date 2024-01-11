package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("D:\\Velocity\\Java Class\\29th July Even\\29JulyEvenTest.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
		int lastRowNum = mySheet.getLastRowNum();//2

		int totalNumberOfRows=lastRowNum;
		
		System.out.println(totalNumberOfRows);
		
		System.out.println("============================");
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		
		int totalNumOfCells=lastCellNum-1;
		System.out.println(totalNumOfCells);
			}

}
