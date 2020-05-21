package Section6Problem4;

public class PackageDemo {

	public static void main(String args[]) {
	
		/** Non-resizable circle.  */
		Circle circle1 = new Circle(2.5); 
		System.out.println(circle1); 
		System.out.println("Perimeter:  " + circle1.getArea()); 
		System.out.println("Area:  " + circle1.getArea()); 
	
		/** Resizable circle.  */
		ResizableCircle circle2 = new ResizableCircle(3);
		System.out.println(circle2); 
		System.out.println("Perimeter:  " + circle2.getArea()); 
		System.out.println("Area:  " + circle2.getArea()); 
		
		/** Reduce the radius to 50% of the original, or half as long.  */
		circle2.resize(50); 
		System.out.println(circle2); 
		System.out.println("Perimeter:  " + circle2.getArea()); 
		System.out.println("Area:  " + circle2.getArea()); 
		
		/** Increase the radius to 200% of the original, now the circle as big as the original one.  */
		circle2.resize(200); 
		System.out.println(circle2); 
		System.out.println("Perimeter:  " + circle2.getArea()); 
		System.out.println("Area:  " + circle2.getArea()); 
		
	}
	
}
