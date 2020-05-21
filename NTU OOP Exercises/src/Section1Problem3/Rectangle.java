package Section1Problem3;

public class Rectangle {

	private float length; 
	private float width; 
	
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle(float retrievedLength, float retrievedWidth) {
		length = retrievedLength;
		width = retrievedWidth; 
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float retrievedLength) {
		this.length = retrievedLength;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float retrievedWidth) {
		this.width = retrievedWidth; 
	}
	
	public double getArea() {
		return length * width; 
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
	
	
}
