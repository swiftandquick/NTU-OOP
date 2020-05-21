package Section5Problem1;

public class Point {

	private int x, y; 
	
	public Point(int rX, int rY) {
		x = rX; 
		y = rY; 
	}
	
	public String toString() {
		return "Point[" + x + ", " + y + "]"; 
	}
	
	public int getX() {
		return x; 
	}

	public void setX(int rX) {
		this.x = rX; 
	}
	
	public int getY() {
		return y; 
	}
	
	public void setY(int rY) {
		this.y = rY; 
	}
	
	public void setXY(int rX, int rY) {
		this.x = rX; 
		this.y = rY; 
	}
	
}
