package Section4Problem4;

public class PackageDemo {

	public static void main(String args[]) {
		
		int moves = 10;
		
		/** Stationary point.  */
		Point point1 = new Point(4.51f, -1.28f); 
		System.out.println(point1); 
		
		/** Moving point.  */
		MovablePoint point2 = new MovablePoint(12.25f, -14.6f, -2.25f, 2.25f);
		System.out.println(point2);
		
		/** Let point move 10 times.  */
		for(int i = 1; i <= moves; i++) {
			point2.move();
			System.out.println(point2);			
		}
		
	}
	
}
