package Section3Problem5;

import java.util.Scanner;

public class MyDateDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		int iYear, iMonth, iDay; 

		/** Creates an default object.  */
		MyDate newDate = new MyDate();  
		
		System.out.print("Year:  ");  
		iYear = input.nextInt(); 
		System.out.print("Month:  ");  
		iMonth = input.nextInt(); 
		System.out.print("Day:  ");  
		iDay = input.nextInt(); 
		
		/** Checks whether the input is a leap year, and if it's valid.  */
		newDate.isLeapYear(iYear); 
		newDate.isValidDate(iYear, iMonth, iDay); 
		while(!newDate.isValidDate(iYear, iMonth, iDay)) {
			System.out.println("Invalid date, try again.  ");
			System.out.print("Year:  ");  
			iYear = input.nextInt(); 
			System.out.print("Month:  ");  
			iMonth = input.nextInt(); 
			System.out.print("Day:  ");  
			iDay = input.nextInt(); 
			newDate.isLeapYear(iYear); 
			newDate.isValidDate(iYear, iMonth, iDay); 
		}
		System.out.println("\nIt is a leap year:  " + newDate.isLeapYear(iYear) + ".  "); 
		System.out.println("It is a valid date:  " + newDate.isValidDate(iYear, iMonth, iDay) + ".  "); 
		
		/** Set the date.  */
		newDate.setDate(iYear, iMonth, iDay);
		
		/** Get the current date, previous dates, and next dates.  */
		System.out.println("\nCurrent Date:  " + newDate.toString());
		
		newDate.previousDay();
		System.out.println("Previous Day:  " + newDate.toString()); 
		
		newDate.previousMonth();
		System.out.println("Previous Month:  " + newDate.toString());
		
		newDate.previousYear(); 
		System.out.println("Previous Year:  " + newDate.toString()); 
		
		newDate.nextYear(); 
		System.out.println("Next Year:  " + newDate.toString()); 

		newDate.nextMonth();
		System.out.println("Next Month:  " + newDate.toString()); 

		newDate.nextDay();
		System.out.println("Next Day:  " + newDate.toString()); 
						
		System.out.println("\nIt's back to the original date!  "); 
		
		input.close(); 
		
	}
	
}
