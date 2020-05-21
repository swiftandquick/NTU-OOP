package Section1Problem3;

import java.util.Scanner;

public class RectangleDemo {
	
	public static void main(String args[]) {
		
		float lengthInput;
		float widthInput; 
		
		Scanner input = new Scanner(System.in);
	
		/** The object's default length and width is 1.  */
		Rectangle rectangle = new Rectangle(); 
		
		System.out.println(rectangle.toString());
		System.out.println("Area = " + rectangle.getArea());
		System.out.println("Perimeter = " + rectangle.getPerimeter());
		
		
		/** Now set the object's length and width.  */		
		System.out.println(); 
		System.out.println("What is the length?  "); 
		lengthInput = input.nextFloat(); 
		System.out.println("What is the width?  "); 
		widthInput = input.nextFloat(); 
		
		Rectangle rectangle2 = new Rectangle(lengthInput, widthInput);
		
		System.out.println(rectangle2.toString());
		System.out.println(rectangle2.getArea());
		System.out.println(rectangle2.getPerimeter()); 
		
		
		/** Now set the object's width.  */
		System.out.println(); 
		System.out.println("What is the new length?  "); 
		lengthInput = input.nextFloat();
		System.out.println("What is the new width?  ");  
		widthInput = input.nextFloat(); 
		
		rectangle2.setLength(lengthInput);
		rectangle2.setWidth(widthInput);
		
		System.out.println("New length is:  " + rectangle2.getLength());
		System.out.println("New width is:  " + rectangle2.getWidth());
		System.out.println(rectangle2.toString()); 
		System.out.println(rectangle2.getArea()); 
		System.out.println(rectangle2.getPerimeter()); 
		
		input.close();
		
	}
	
}
