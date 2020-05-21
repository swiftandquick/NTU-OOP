package Section7Problem2;

import java.util.*; // Includes Scanner, List, and ArrayList.  

public class PackageDemo {

	/** There are testing codes on the website, but I am writing my own.  */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numberOfPoints, iX, iY;
		
		/** Creates an empty Polyline object, which is an array list that contains no Point object yet.  */
		PolyLine polyline = new PolyLine();
		
		System.out.println("How many points do you want to have?  ");
		numberOfPoints = input.nextInt(); 
		while (numberOfPoints < 2) {
			System.out.println("A line must contain at least 2 points, try again.  "); 
			System.out.println("How many points do you want to have?  ");
			numberOfPoints = input.nextInt(); 
		}
		
		for(int i = 0; i < numberOfPoints; i++) {
			System.out.println("Enter the coordinates for the new point.  ");
			System.out.print("x:  "); 
			iX = input.nextInt();
			System.out.print("y:  "); 
			iY = input.nextInt();
			polyline.appendPoint(iX, iY);
			if (i >= 1) {
				System.out.println(polyline);
				System.out.println("Current Length:  " + polyline.getLength());
			}
		}
		
		System.out.println("It's over!  ");
		
		input.close();
		
	}

}