package Section6Problem1;

public class Square extends Rectangle{

	Square() {
		width = 1.0; 
		length = 1.0; 
	}
	
	Square(double rSide) {
		width = rSide; 
		length = rSide; 
	}
	
	Square(double rSide, String rColor, boolean rFilled) {
		width = rSide; 
		length = rSide; 
		color = rColor; 
		filled = rFilled; 
	}
	
	public double getSide() {
		return width; 
		// return length;  This also works, since square has equal length and width.  
	}
	
	public void setSide(double rSide) {
		width = rSide;
		length = rSide; 
	}
	
	public String toString() {
		return "Square[" + super.toString() + "]"; 
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
