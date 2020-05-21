package Section7Problem2;

public class Point {

	private int x; 
	private int y; 
	
	Point(int rX, int rY) {
		x = rX;
		y = rY;
	}
	
	public int getX() {
		return x; 
	}
	
	public int getY() {
		return y; 
	}
	
	public void setX(int rX) {
		this.x = rX;
	}
	
	public void setY(int rY) {
		this.y = rY; 
	}
	
	public int[] getXY() {
		int[] xy = {x, y};
		return xy;
	}
	
	public void setXY(int rX, int rY) {
		this.x = rX; 
		this.y = rY; 
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
	
	/** Gets the distance between 2 points.  */
	public double distance(Point another) {
		return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
	}
	
}
