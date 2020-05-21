package Section4Problem5;

public class Circle extends Shape {

	private double radius; 
	
	Circle() {
		radius = 1.0;
	}
	
	Circle(double rRadius) {
		radius = rRadius;
	}
	
	Circle(double rRadius, String rColor, boolean rFilled) {
		super(rColor, rFilled); 
		radius = rRadius; 
	}
	
	public double getRadius() {
		return radius; 
	}
	
	public void setRadius(double rRadius) {
		this.radius = rRadius; 
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return radius * 2 * Math.PI; 
	}
	
	public String toString() {
		return "Circle[" + super.toString() + ", radius = " + radius + "]";
	}
	
}
