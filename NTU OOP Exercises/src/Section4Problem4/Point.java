package Section4Problem4;

public class Point {

	private float x, y; 
	
	Point() {
		x = 0; 
		y = 0; 
	}
	
	Point(float rX, float rY) {
		x = rX; 
		y = rY; 
	}
	
	public float getX() {
		return x; 
	}
	
	public void setX(float rX) {
		this.x = rX; 
	}
	
	public float getY() {
		return y; 
	}
	
	public void setY(float rY) {
		this.y = rY; 
	}
	
	public float[] getXY() {
		float xy[] = {x, y};
		return xy;
	}
	
	public void setXY(float rX, float rY) {
		this.x = rX; 
		this.y = rY; 
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}
