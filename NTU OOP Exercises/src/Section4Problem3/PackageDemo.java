package Section4Problem3;

import java.util.Arrays;

public class PackageDemo {

	public static void main(String args[]) {

		/** Array can be transformed into string via Arrays.toString().  */
		Point2D point2d = new Point2D(2.3f, 3.4f);
		System.out.println(Arrays.toString(point2d.getXY()));
		Point3D point3d = new Point3D(-2.4f, 3.3f, -1.2f); 
		System.out.println(Arrays.toString(point3d.getXYZ())); 
		
	}
	
}
