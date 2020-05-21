package Section2Problem3;

public class MyPoint {

	private int x; 
	private int y; 
	
	MyPoint() {
		x = 0;
		y = 0;
	}
	
	MyPoint(int retrievedX, int retrievedY) {
		x = retrievedX; 
		y = retrievedY; 
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int retrievedX) {
		this.x = retrievedX; 
	}
	
	public int getY() {
		return y; 
	}
	
	public void setY(int retrievedY) {
		this.y = retrievedY; 
	}
	
	/** Proper way to return an array.  */
	public int[] getXY() {
		int coordinate[] = {x, y};
		return coordinate;
	}
	
	public void setXY(int retrievedX, int retrievedY) {
		this.x = retrievedX; 
		this.y = retrievedY; 
	}
	
	/** Checks distance of the two points.  */
	public double distance(int givenX, int givenY) {
		// Formula:  sqrt((givenX - x)^2 + (givenY - y)^2)
		return Math.sqrt(Math.pow((givenX - x), 2) + Math.pow((givenY - y), 2));
	}
	
	/** Check the distance between two points.  */
	public double distance(MyPoint another) {
		return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
	}
	
	/** Checks distance from (0, 0).  */
	public double distance() {
		return Math.sqrt(x * x + y * y);
	}
	
}
