package Java;

import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 * This is description
 * @author Kishan
 * @version 0.1
 * @since 2002
 * @see <a href="https://www.google.com/">Kishan Profile</a>
 */
public class BK_Time {
	
public static void main(String[] args){
	LocalDate d = LocalDate.now();
	System.out.println(d);
	
	LocalTime t = LocalTime.now();
	System.out.println(t);
	
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
	String myDate = dt.format(dtf);
	System.out.println(myDate);
	String myDate1 = dt.format(dtf2);
	System.out.println(myDate1);
}
}

