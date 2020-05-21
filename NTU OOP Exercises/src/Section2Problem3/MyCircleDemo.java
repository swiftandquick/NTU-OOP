package Section2Problem3;

import java.util.Scanner;

public class MyCircleDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int xInput, yInput, radiusInput; 
		
		
		/** Circle 1 uses constructor to passes in x, y, and radius.  */
		System.out.println("Circle 1:  ");
		System.out.print("Center X Coordinate:  "); 
		xInput = input.nextInt(); 
		System.out.print("Center Y Coordinate:  "); 
		yInput = input.nextInt(); 
		System.out.print("Radius:  "); 
		radiusInput = input.nextInt(); 
		while (radiusInput <= 0) {
			System.out.println("Radius cannot be negative, please enter again.  ");
			System.out.print("Radius:  "); 
			radiusInput = input.nextInt(); 
		}
		
		MyCircle circle1 = new MyCircle(xInput, yInput, radiusInput);
		System.out.println("Circle[Center[" + circle1.getCenterX() + ", " + circle1.getCenterY() + "], Radius = " + circle1.getRadius() 
			+ ", Area = " + circle1.getArea() + ", Circumference = " + circle1.getCircumference() + "]");
		
		
		/** Circle 2 uses constructor to passes in MyPoint (with x and y passed in) and radius.  */
		System.out.println("\nCircle 2:  ");
		System.out.print("Center X Coordinate:  "); 
		xInput = input.nextInt(); 
		System.out.print("Center Y Coordinate:  "); 
		yInput = input.nextInt(); 
		System.out.print("Radius:  "); 
		radiusInput = input.nextInt(); 
		
		MyPoint point2 = new MyPoint(xInput, yInput);
		MyCircle circle2 = new MyCircle(point2, radiusInput);
		System.out.println("Circle[Center[" + circle2.getCenterX() + ", " + circle2.getCenterY() + "], Radius = " + circle2.getRadius() 
		+ ", Area = " + circle2.getArea() + ", Circumference = " + circle2.getCircumference() + "]");
		
		
		/** Create an empty constructor, then use setters to pass in variables.  */
		MyCircle circle3 = new MyCircle(); 
		
		System.out.println("\nCircle 3:  "); 
		System.out.print("Center X Coordinate:  "); 
		xInput = input.nextInt(); 
		System.out.print("Center Y Coordinate:  "); 
		yInput = input.nextInt(); 
		System.out.print("Radius:  "); 
		while (radiusInput <= 0) {
			System.out.println("Radius cannot be negative, please enter again.  ");
			System.out.print("Radius:  "); 
			radiusInput = input.nextInt(); 
		}
		
		circle3.setCenterX(xInput); 
		circle3.setCenterY(yInput); 
		System.out.println("Circle 3's current center coordinate:  " + "(" 
				+ circle3.getCenterX() + ", " + circle3.getCenterY() + ")"); 
		
		System.out.println("The coordinate you just entered is wrong, enter again:  ");
		System.out.print("Center X Coordinate:  "); 
		xInput = input.nextInt(); 
		System.out.print("Center Y Coordinate:  "); 
		yInput = input.nextInt(); 
		
		circle3.setCenterXY(xInput, yInput);
		circle3.setRadius(radiusInput);
		
		System.out.println("Circle[Center[" + circle3.getCenterXY()[0] + ", " + circle3.getCenterXY()[1] + "], Radius = " + circle3.getRadius() 
		+ ", Area = " + circle3.getArea() + ", Circumference = " + circle3.getCircumference() + "]");
		
		
		/** Check the distance between the three circles.  */
		System.out.println("\nDistance between circle 1 and circle 2 is " + circle1.distance(circle2) + ".  ");
		System.out.println("Distance between circle 1 and circle 3 is " + circle1.distance(circle3) + ".  ");
		System.out.println("Distance between circle 2 and circle 3 is " + circle2.distance(circle3) + ".  ");
		
		
		input.close();
		
	}
	
}
