package Section6Problem1;

/**
 * In abstract class and its subclasses, instance variables should be protected
 * instead of private, so that variables can be shared with the subclasses.  
 * Although encapsulation do usually requires the instance variables to be 
 * private, as protected instance variables are not safe.  An abstracted class 
 * may or may not contain abstract methods, but why should I even create an 
 * abstract class without abstract methods?  Hence, I also use abstract methods.  
 */
public abstract class Shape {

	protected String color; 
	protected Boolean filled; 
	
	Shape() {
		color = "red"; 
		filled = true; 
	}
	
	Shape(String rColor, boolean rFilled) {
		color = rColor;
		filled = rFilled;
	}
	
	public String getColor() {
		return color; 
	}
	
	public void setColor(String rColor) {
		this.color = rColor; 
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void set(boolean rFilled) {
		this.filled = rFilled; 
	}
	
	public String toString() {
		return "Shape[color = " + color + ", filled = " + filled + "]";
	}
	
	/** An abstract method is a method without a body.  */
	public abstract double getArea(); 
	public abstract double getPerimeter(); 
	
}