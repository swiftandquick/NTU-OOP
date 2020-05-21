package Section6Problem1;

public class Circle extends Shape {

	protected double radius;
	
	Circle() {
		radius = 1.0;
	}
	
	Circle(double rRadius) {
		radius = rRadius; 
	}
	
	/**
	 * Notice how I don't have to declare the color and filled variables, because
	 * they are already declared in the abstract class, which is also the
	 * superclass.
	 */
	Circle(double rRadius, String rColor, boolean rFilled) {
		radius = rRadius; 
		color = rColor; 
		filled = rFilled; 
	}
	
	public double getRadius() {
		return radius; 
	}
	
	public void setRadius(double rRadius) {
		this.radius = rRadius; 
	}

	public String toString() {
		return "Circle[" + super.toString() + ", radius = " + radius + "]";
	}
	
	/** 
	 * Implements the abstract class' method.  @Override annotation allows 
	 * me to know that the superclass method has been overridden by the 
	 * subclass.  @Override doesn't do anything, it's just a notice.  
	 */
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI; 
	}
	
}
