package Section4Problem1;

/**
 * Subclass extends the superclass, subclass is Cylinder, superclass is Circle.
 */
public class Cylinder extends Circle {

	private double height;

	Cylinder() {
		height = 1.0;
	}

	/**
	 * Constructor cannot be overridden, so @Override annotation doesn't work here.
	 * Constructors are independent of each other. Only methods can be overridden.
	 */
	Cylinder(double rRadius) {
		radius = rRadius;
	}
	
	Cylinder(double rRadius, double rHeight) {
		radius = rRadius; 
		height = rHeight; 
	}
	
	Cylinder(double rRadius, double rHeight, String rColor) {
		radius = rRadius; 
		height = rHeight; 
		color = rColor;
	}
	
	public double getHeight() {
		return height; 
	}
	
	public void setHeight(double rHeight) {
		this.height = rHeight; 
	}
	
	public double getVolume() {
		return getArea() * height; 
	}
	
	/** If the method of the subclass and superclass has the same name, use "super" to call the superclass.  */
	public String toString() {
		return "Cylinder[height = " + height + ", " + super.toString() + "]";
	}

}
