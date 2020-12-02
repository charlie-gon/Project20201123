package Arrays;

import java.util.Calendar;

public class 연습 {
	public static void main(String[] args) {

		
		Calendar time = Calendar.getInstance();
		
		System.out.println(time.getTime());
		System.out.println(time.getTimeZone());
		System.out.println();
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(time.get(Calendar.MONTH)+1);
		System.out.println(time.get(Calendar.HOUR_OF_DAY));
		System.out.println();
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.add(Calendar.SECOND, 60);
		System.out.println(time1.getTime());
		
		time2.roll(Calendar.SECOND, 60);
		System.out.println(time2.getTime());
		
		
		
	}// end of main

}// end of class
