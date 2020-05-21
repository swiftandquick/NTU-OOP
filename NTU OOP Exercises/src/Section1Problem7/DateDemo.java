package Section1Problem7;

import java.util.Scanner;

public class DateDemo {

	/** No input validation, I can do a better job.  */
	public static void main(String args[]) {

		int dayInput, monthInput, yearInput; 
		
		Scanner input = new Scanner(System.in);
		
		/** Pass variables to the constructor.  */
		System.out.print("Day:  ");
		dayInput = input.nextInt();
		System.out.print("Month:  ");
		monthInput = input.nextInt();
		System.out.print("Year:  ");
		yearInput = input.nextInt(); 
		
		Date newDate = new Date(dayInput, monthInput, yearInput); 
		
		System.out.println(newDate.toString());
		
		
		/** Using individual setters to set the object variables.  Use getters to retrieve values instead of toString().  */
		System.out.print("Day:  ");
		dayInput = input.nextInt();
		System.out.print("Month:  ");
		monthInput = input.nextInt();
		System.out.print("Year:  ");
		yearInput = input.nextInt(); 
		
		newDate.setDay(dayInput);
		newDate.setMonth(monthInput);
		newDate.setYear(yearInput);
		
		System.out.println(newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());


		/** Using a single setter to set object variables.  */
		System.out.print("Day:  ");
		dayInput = input.nextInt();
		System.out.print("Month:  ");
		monthInput = input.nextInt();
		System.out.print("Year:  ");
		yearInput = input.nextInt(); 
		
		newDate.setDate(dayInput, monthInput, yearInput);

		System.out.println(newDate.toString());
		
		input.close();
		
	}
	
}
