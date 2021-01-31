
package JavaBasics;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cl=Calendar.getInstance();
		System.out.println("current date:");
		int date=cl.get(Calendar.DATE);
		int month=cl.get(Calendar.MONTH);
		int year=cl.get(Calendar.YEAR);
		System.out.println(date+"-"+month+"-"+year);
		System.out.println("current time");
		int hr=cl.get(Calendar.HOUR);
		int mn=cl.get(Calendar.MINUTE);
		int sc=cl.get(Calendar.SECOND);
		System.out.println(hr+":"+mn+":"+sc);
		int b=cl.get(Calendar.AM_PM);
		if(b==0) 
		System.out.println("good morning");
		else
			System.out.println("good evening");

	}

}
