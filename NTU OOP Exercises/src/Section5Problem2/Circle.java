package Section5Problem2;

public class Circle {

	double radius; 
	String color; 
	
	Circle() {
		radius = 1.0; 
		color = "red"; 
	}
	
	Circle(double rRadius) {
		radius = rRadius; 
		color = "red"; 
	}
	
	Circle(double rRadius, String rColor) {
		radius = rRadius; 
		color = rColor; 
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rRadius) {
		this.radius = rRadius; 
	}
	
	public String getColor() {
		return color; 
	}
	
	public void setColor(String rColor) {
		this.color = rColor; 
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + ", color = " + color + "]";
	}
	
}