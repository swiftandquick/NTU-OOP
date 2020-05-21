package Section4Problem5;

public class Rectangle extends Shape {

	private double width, length; 
	
	Rectangle() {
		width = 1.0; 
		length = 1.0; 
	}
	
	Rectangle(double rWidth, double rLength) {
		width = rWidth; 
		length = rLength; 
	}
	
	Rectangle(double rWidth, double rLength, String rColor, boolean rFilled) {
		super(rColor, rFilled); 
		width = rWidth; 
		length = rLength; 
	}
	
	public double getWidth() {
		return width; 
	}
	
	public void setWidth(double rWidth) {
		this.width = rWidth; 
	}
	
	public double getLength() {
		return length; 
	}
	
	public void setLength(double rLength) {
		this.length = rLength; 
	}
	
	public double getArea() {
		return length * width; 
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	
	public String toString() {
		return "Rectangle[" + super.toString() + ", width = " + width + ", length = " + length + "]"; 
	}
	
}