package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethod
{
	//reading data from excel
	//taking screenshot
	//scrolling
	//waiting
	
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\29th July Even\\screenShot\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}

	
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		implicitWait(driver, 10);
		js.executeScript("arguments[0].scrollIntoView();",element );
	}
	
	public static void implicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException,FileNotFoundException
	{
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\29th July Even\\29JulyEvenTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static String readDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException,FileNotFoundException
	{
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\29th July Even\\29JulyEvenTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet(SheetName);
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//Create object of Properties class
		Properties prop= new Properties();
		//File Location
		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"//CoverFoxData.properties");
		//load file
		prop.load(myFile);
		//pass the Key for the data we want
		String value = prop.getProperty(key);
		return value;
	}
	
	
	
	
	
}
