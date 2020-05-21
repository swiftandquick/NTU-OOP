package Section5Problem2;

/**
 * In this class, I will use composition instead of inheritance. As a cylinder
 * composes of one circle.
 */

public class Cylinder {

	private double height; 
	private Circle base;
	
	public Cylinder() {
		height = 1.0; 
		base = new Circle();
	}
	
	public Cylinder(double rHeight, Circle rBase) {
		height = rHeight; 
		base = rBase; 
	}
	
	public Cylinder(double rHeight, double  rRadius, String rColor) {
		base = new Circle(rRadius, rColor); 
		height = rHeight; 
	}
	
	/** No getters or setters, since I already know how to use them.  */
	public String toString() {
		return "Cylinder[height = " + height + ", " + base.toString() + "]";
	}
	
	public double getVolume() {
		return height * base.getArea(); 
	}
	
}
