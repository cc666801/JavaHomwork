package Homework4;
import java.util.*;

public class MyCalendar {
	
	public static int check(int year, int month, int day) {
		Calendar birth = new GregorianCalendar(year, month , day);
		System.out.println(birth.DAY_OF_WEEK);
		System.out.println(birth.DAY_OF_MONTH);
//		System.out.println(birth.DAY_OF_WEEK);
		return birth.DAY_OF_WEEK;
	}
	
}
