package Section6Problem4;

public class Circle implements GeometricObject {

	/** # means protected in UML diagram.  */
	protected double radius; 
	
	Circle(double rRadius) {
		radius = rRadius; 
	}
	
	public String toString() {
		return "Circle[radius = " + radius + "]"; 
	}
	
	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;		
	}
	
}
