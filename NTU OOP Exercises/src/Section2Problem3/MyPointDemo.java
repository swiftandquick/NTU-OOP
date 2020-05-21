package Section2Problem3;

import java.util.Scanner;

public class MyPointDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int xInput, yInput, targetX, targetY;
		
		
		/** Create the p1 object by using constructor.  */
		System.out.println("Insert your point 1 coordinate:  ");
		System.out.print("X:  "); 
		xInput = input.nextInt(); 
		System.out.print("Y:  "); 
		yInput = input.nextInt(); 
		
		MyPoint p1 = new MyPoint(xInput, yInput);
		
		/** Retrieved the coordinate using getXY() method.  */
		System.out.println("Point 1's coordinate is:  " + 
				"(" + p1.getXY()[0] + ", " + p1.getXY()[1] + ").  ");
		
		/** Find the distance from p1 to (0, 0).  */
		System.out.print("Distance from p1 to (0, 0) is " + p1.distance() + ". ");
		
		/** Find the distance from p1 to an input coordinate.  */
		System.out.println("Tell me the target coordinate:  ");
		System.out.print("X:  "); 
		targetX = input.nextInt(); 
		System.out.print("Y:  "); 
		targetY = input.nextInt(); 
		System.out.println("Distance from p1 to (" + targetX + ", " + targetY
				+ ") is " + p1.distance(targetX, targetY) + ".  ");
		
		/** Create the p2 object using setter.  */
		MyPoint p2 = new MyPoint();
		
		System.out.println("Insert your point 2 coordinate:  ");
		System.out.print("X:  "); 
		xInput = input.nextInt(); 
		System.out.print("Y:  "); 
		yInput = input.nextInt(); 
		
		p2.setX(xInput);
		p2.setY(yInput);
		
		System.out.println("Point's coordinate is:  " + 
				"(" + p2.getX() + ", " + p2.getY() + ").  ");
		
		/** Find the distance between p1 (this) and p2 (another).  */
		System.out.println("Distance between p1 and p2 is " + p1.distance(p2) + ".  ");
		
		input.close(); 
		
	}
	
}
