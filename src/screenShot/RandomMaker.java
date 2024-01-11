package screenShot;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class RandomMaker {

//	public static void main(String[] args)
//	{
//		RandomString rs= new RandomString();
//		
//		System.out.println(rs.make(4));
//		
//		Date d= new Date();
//		System.out.println(d);
//	}
	
	
public static void main(String[] args) {
	String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	System.out.println(timeStamp);
}
}
