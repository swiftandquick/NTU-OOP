package Section1Problem1;

public class Circle {
	
	double radius; 
	String color; 
	
	/** Default constructor, if radius and color are not set, then these will be their default variables.  */
	Circle() {
		radius = 1.0;
		color = "red"; 
	}
	
	/** Constructor that sets radius equal to the parameter variable.  */
	public Circle(double retrievedRadius) {
		radius = retrievedRadius;
		color = "red";
	}
	
	/** Constructor that sets radius and color equal to the parameter variables.  */
	public Circle(double retrievedRadius, String retrievedColor) {
		radius = retrievedRadius;
		color = retrievedColor; 
	}
	
	/** Return the current radius value.  */
	public double getRadius() {
		return radius;
	}

	/** Use current radius value to calculate for area, then return the area.  */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/** Return the current color value.  */
	public String getColor() {
		return color;
	}

	public void setRadius(double retrievedRadius) {
		this.radius = retrievedRadius;
	}

	public void setColor(String retrievedColor) {
		this.color = retrievedColor;
	}
	
}

