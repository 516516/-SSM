package test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.taglibs.standard.lang.jstl.test.Bean1;

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
		System.out.println("____________________________________________________________-");
		
		BigDecimal b1=new BigDecimal("1.2");
		BigDecimal b2=new BigDecimal("1.3");
		System.out.println(b1.compareTo(b2));
	}

}
