package Section1Problem8;

import java.util.Scanner;

public class TimeDemo {

	public static void main(String args[]) {
		
		int hourInput, minuteInput, secondInput; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("If your input is out of range, it will be set to 0!  \n");  
		
		/** Set the initial time using constructor.  */
		System.out.print("Hour:  ");
		hourInput = input.nextInt();
		System.out.print("Minute:  ");
		minuteInput = input.nextInt();
		System.out.print("Second:  ");
		secondInput = input.nextInt(); 
		
		Time newTime = new Time(hourInput, minuteInput, secondInput);
		System.out.println(newTime.toString()); 
		
		
		/** Change the time using a single setter.  */
		System.out.print("Hour:  ");
		hourInput = input.nextInt();
		System.out.print("Minute:  ");
		minuteInput = input.nextInt();
		System.out.print("Second:  ");
		secondInput = input.nextInt(); 

		newTime.setTime(hourInput, minuteInput, secondInput);
		System.out.println(newTime.toString());
		
		newTime.nextSecond(newTime);
		System.out.println("Next Second:  " + newTime.toString());
		
		
		/** Now use individual getters and setters to get the output.  */
		System.out.print("Hour:  ");
		hourInput = input.nextInt();
		System.out.print("Minute:  ");
		minuteInput = input.nextInt();
		System.out.print("Second:  ");
		secondInput = input.nextInt(); 
		
		newTime.setHour(hourInput); 
		newTime.setMinute(minuteInput); 
		newTime.setSecond(secondInput); 
		System.out.println(newTime.getHour() + ":" + newTime.getMinute() + ":" + newTime.getSecond());
		
		newTime.previousSecond(newTime);
		System.out.println("Previous Second:  " + newTime.toString());
		
		input.close();
		
	}
	
}
