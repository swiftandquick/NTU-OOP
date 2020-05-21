package Section3Problem4;

public class MyTimeDemo {

	public static void main(String args[]) {
		
		MyTime newTime = new MyTime(1, 1, 0);
		System.out.println("Current Time:  " + newTime.toString());
		System.out.println("Previous Second:  " + newTime.previousSecond());
		System.out.println("Previous Minute:  " + newTime.previousMinute());
		System.out.println("Previous Hour:  " + newTime.previousHour());
		System.out.println("Next Second:  " + newTime.nextSecond());
		System.out.println("Next Minute:  " + newTime.nextMinute());
		System.out.println("Next Hour:  " + newTime.nextHour());
		
	}
	
}
