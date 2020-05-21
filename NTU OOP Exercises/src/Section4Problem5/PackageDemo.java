package Section4Problem5;

public class PackageDemo {

	public static void main(String args[]) {
		
		Shape newShape = new Shape("gray", true);
		System.out.println(newShape);
		
		Circle newCircle = new Circle(1.5, "purple", false);
		System.out.println(newCircle);
		System.out.println("Area:  " + newCircle.getArea());
		System.out.println("Perimeter:  " + newCircle.getPerimeter()); 
		
		Rectangle newRectangle = new Rectangle(2.5, 3.5, "white", false);
		System.out.println(newRectangle); 
		System.out.println("Area:  " + newRectangle.getArea()); 
		System.out.println("Perimeter:  " + newRectangle.getPerimeter()); 
		
		Square newSquare = new Square(3.25, "yellow", true);
		System.out.println(newSquare); 
		System.out.println("Area:  " + newSquare.getArea());
		System.out.println("Perimeter:  " + newSquare.getPerimeter()); 
		
		/** The following test codes are full of errors, and that's what's supposed to happen.  
		 * Upcast and downcast may result in errors if I call a method name that only exists 
		 * for the subclass and not the superclass, or vice versa.  
		 * 
		// Can't get radius, area, and perimeter via down-casting, those are in the Circle class.  
		Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version?
		System.out.println(s1.getArea());          // which version?
		System.out.println(s1.getPerimeter());     // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius());
		   
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		   
		Shape s2 = new Shape();
		   
		Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength());
		   
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		   
		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide());
		  
		// Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		System.out.println(r2.getLength());
		   
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		
		*/
		
	}
	
}
