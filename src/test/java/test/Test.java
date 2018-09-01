package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//输入：
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date myDate2 = null;
		try {
			myDate2 = dateFormat2.parse("2010-09-13 22:36:01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(myDate2);
		
		//输出：
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	   String dateNowStr = sdf.format(myDate2);
	   System.out.println(dateNowStr);
	   
		System.out.println(100);
		
	}

}
