package actionsClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException
	
	{
	
		//create object of Properties
		
		Properties prop= new Properties();
		
		//Create Object of FileInputStream
	//	FileInputStream myFile= new FileInputStream("D:\\Yogendra\\Tesing29_JulyEven_Selenium\\CoverFoxData.properties");

		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\CoverFoxData.properties");
		
		
		prop.load(myFile);
		
		 String value = prop.getProperty("MobNum");
		
		System.out.println(value);
	}

}
