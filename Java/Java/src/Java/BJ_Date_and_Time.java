package Java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

//Date in Java is stored as a long number
//Long number holds the number of mili seconds passed since 1 January 1970. 
//Java assumes that 1900 is the start year 
public class BJ_Date_and_Time {
	
public static void main(String[] args){
	System.out.println("Mili seconds passed after 1 January 1970 is "+System.currentTimeMillis());
	System.out.println("Years passed after 1 January 1970 is "+System.currentTimeMillis()/1000/3600/24/365);
	
	//Date
	Date d = new Date();
	System.out.println(d);
	System.out.println(d.getTime());
	System.out.println(d.getDate());
	System.out.println(d.getYear());
	System.out.println(d.getSeconds());
	
	//Calendar
	Calendar c = Calendar.getInstance();
	Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
	System.out.println(c.getCalendarType());
	System.out.println(c.getTimeZone());
	System.out.println(c.getTimeZone().getID());
	System.out.println(c.getTime());
	
	System.out.println(c1.getCalendarType());
	System.out.println(c1.getTimeZone());
	System.out.println(c1.getTimeZone().getID());
	
	//Gregorial Calendar
	GregorianCalendar gc = new GregorianCalendar();
	System.out.println(gc.isLeapYear(2000));
	
	//TimeZone
	String[] lst = TimeZone.getAvailableIDs();
	for (String s : lst) {
		System.out.println(s);
	}
}
}

