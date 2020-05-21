package Section6Problem1;

public class Rectangle extends Shape {

	protected double width; 
	protected double length; 
	
	Rectangle() {
		width = 1.0;
		length = 1.0; 
	}
	
	Rectangle(double rWidth, double rLength) {
		width = rWidth; 
		length = rLength; 
	}
	
	Rectangle(double rWidth, double rLength, String rColor, boolean rFilled) {
		width = rWidth; 
		length = rLength; 
		color = rColor; 
		filled = rFilled; 
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
	
	public String toString() {
		return "Rectangle[" + super.toString() + ", width = " + width + ", length = " + length + "]"; 
	}
	
	@Override
	public double getArea() {
		return width * length; 
	}
	
	@Override
	public double getPerimeter() {
		return width * 2 + length * 2;
	}
	
}
