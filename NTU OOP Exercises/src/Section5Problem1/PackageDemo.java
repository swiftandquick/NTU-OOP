package Section5Problem1;

public class PackageDemo {

	public static void main(String args[]) {
		
		Point newPoint = new Point(10, 20);
		System.out.println(newPoint); 
		
		/** Create Point objects first.  Then pass the two points to the constructor with two arguments.  */
		Point beginPoint = new Point(0, 0); 
		Point endPoint = new Point(3, 4); 

		Line line1 = new Line(beginPoint, endPoint);
		System.out.println(line1); 
		System.out.println("Length:  " + line1.getLength());
		System.out.println("Gradient:  " + line1.getGradient());
		
		/** Passes the coordinates to the constructor, then the constructor will set up two points.  Same result.  */
		Line line2 = new Line(0, 0, 3, 4);
		System.out.println(line2); 
		System.out.println("Length:  " + line2.getLength());
		System.out.println("Gradient:  " + line2.getGradient());
		
	}
	
}
