package Section2Problem3;

import java.util.Scanner;

public class MyRectangleDemo {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in); 
		
		int topLeftX, topLeftY, bottomRightX, bottomRightY;
		
		/** For rectangle 1, I pass the x and y coordinates to the constructor.  */
		System.out.println("Rectangle 1:  ");
		System.out.print("Top left x coordinate:  ");
		topLeftX = input.nextInt(); 
		System.out.print("Top left y coordinate:  ");
		topLeftY = input.nextInt(); 
		System.out.print("Bottom right x coordinate:  ");
		bottomRightX = input.nextInt(); 
		System.out.print("Bottom right y coordinate:  ");
		bottomRightY = input.nextInt(); 
		while (topLeftX >= bottomRightX || topLeftY <= bottomRightY) {
			System.out.println("Invalid input, please put in the correct coordinates.  ");
			System.out.print("Bottom right x coordinate:  ");
			bottomRightX = input.nextInt(); 
			System.out.print("Bottom right y coordinate:  ");
			bottomRightY = input.nextInt(); 
		}
		
		MyRectangle rectangle1 = new MyRectangle(topLeftX, topLeftY, bottomRightX, bottomRightY); 
		System.out.println(rectangle1.toString());
		System.out.println("Area:  " + rectangle1.getArea());
		System.out.println("Perimeter:  " + rectangle1.getPerimeter()); 
		
		/** For rectangle 2, I pass the x and y coordinates to the MyPoint's constructor, then pass the MyPoint objects to MyRectangle's constructor.  */
		System.out.println("\nRectangle 2:  ");
		System.out.print("Top left x coordinate:  ");
		topLeftX = input.nextInt(); 
		System.out.print("Top left y coordinate:  ");
		topLeftY = input.nextInt(); 
		System.out.print("Bottom right x coordinate:  ");
		bottomRightX = input.nextInt(); 
		System.out.print("Bottom right y coordinate:  ");
		bottomRightY = input.nextInt(); 
		while (topLeftX >= bottomRightX || topLeftY <= bottomRightY) {
			System.out.println("Invalid input, please put in the correct coordinates.  ");
			System.out.print("Bottom right x coordinate:  ");
			bottomRightX = input.nextInt(); 
			System.out.print("Bottom right y coordinate:  ");
			bottomRightY = input.nextInt(); 
		}
		
		MyPoint r2TopLeft = new MyPoint(topLeftX, topLeftY); 
		MyPoint r2BottomRight = new MyPoint(bottomRightX, bottomRightY);
		MyRectangle rectangle2 = new MyRectangle(r2TopLeft, r2BottomRight);
		System.out.println(rectangle2.toString());
		System.out.println("Area:  " + rectangle2.getArea());
		System.out.println("Perimeter:  " + rectangle2.getPerimeter()); 
		
		
		input.close(); 
		
	}
	
}
