package Section6Problem1;


public class PackageDemo {

	public static void main(String args[]) {
		
		/** I cannot instantiate an object in an abstract class.  */
		// Shape newShape = new Shape("gray", true);
		
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
		
	}
	
}
