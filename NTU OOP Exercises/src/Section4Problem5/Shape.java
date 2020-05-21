package Section4Problem5;

public class Shape {
	
	private String color; 
	private boolean filled; 
	
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
	
	public void setFilled(boolean rFilled) {
		this.filled = rFilled; 
	}
	
	public String toString() {
		return "Shape[color = " + color + ", filled = " + filled + "]"; 
	}

}
